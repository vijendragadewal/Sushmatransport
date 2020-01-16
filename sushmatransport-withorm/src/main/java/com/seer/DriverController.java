package com.seer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DriverController {
@Autowired
ServiceImpl service;

@RequestMapping("getdrivers")
public ModelAndView getAllDrivers() {
List<DriverData> dirverslist=service.getAllDrivers();
	ModelAndView mv= new ModelAndView("driverlist");
	mv.addObject("driverslist", dirverslist);
	return mv;
}
	@RequestMapping("search")
	public String searchPage()
	{
		return "searchdriver";
	}
	
	@RequestMapping("searchdriver")
	public ModelAndView searchDriver(@RequestParam("drivercode")int drivercode) {
		DriverData driver=service.getDriverDetail(drivercode);
		ModelAndView mv=new ModelAndView("driverdetail");
		mv.addObject("driverdata",driver);
		return mv;
	}

@RequestMapping("inputpage")
	public String displayEntryPage() {
		return "driverentry";
	}
	
	@RequestMapping("detailentry")
	public String entryDetail(@ModelAttribute("driver")DriverData driver) {
		service.driverSave(driver);				
		return "result";
	}
}
