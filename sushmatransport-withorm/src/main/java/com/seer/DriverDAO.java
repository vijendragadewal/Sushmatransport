package com.seer;

import java.util.List;

public interface DriverDAO {

	public void driverSave(DriverData driver);
	public void driverUpdate(DriverData driver);
	public void driverDelete(int drivercode);
	public DriverData getDriverDetail(int drivercode);
	public List<DriverData> getAllDrivers();
}
