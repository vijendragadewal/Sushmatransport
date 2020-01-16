package com.seer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements DriverService {

	@Autowired
	DriverDAO driverdao;
	
	@Override
	public void driverSave(DriverData driver) {
		driverdao.driverSave(driver);

	}

	@Override
	public void driverUpdate(DriverData driver) {
	driverdao.driverUpdate(driver);

	}

	@Override
	public void driverDelete(int drivercode) {
		driverdao.driverDelete(drivercode);

	}

	@Override
	public DriverData getDriverDetail(int drivercode) {
		DriverData driver=driverdao.getDriverDetail(drivercode);
		return driver;
	}

	@Override
	public List<DriverData> getAllDrivers() {
		List<DriverData> drivers=driverdao.getAllDrivers();
		return drivers;
	}

}
