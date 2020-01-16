package com.seer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DriverData {
 
	@Id
	private int drivercode;
	private String name;
	private String address;
	private String contact;
	public int getDrivercode() {
		return drivercode;
	}
	public void setDrivercode(int drivercode) {
		this.drivercode = drivercode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "DriverData [drivercode=" + drivercode + ", name=" + name + ", address=" + address + ", contact="
				+ contact + "]";
	}
 
}
