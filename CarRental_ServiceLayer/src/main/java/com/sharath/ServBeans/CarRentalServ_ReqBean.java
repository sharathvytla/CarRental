package com.sharath.ServBeans;

public class CarRentalServ_ReqBean {
	private TOV tov;
	private DOB dob;
	private Driv driver;
	private Location loc;
	public TOV getTov() {
		return tov;
	}
	public void setTov(TOV tov) {
		this.tov = tov;
	}
	public DOB getDob() {
		return dob;
	}
	public void setDob(DOB dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "CarRentalServ_ReqBean [tov=" + tov + ", dob=" + dob + ", driver=" + driver + ", loc=" + loc + "]";
	}
	public Driv getDriver() {
		return driver;
	}
	public void setDriver(Driv driver) {
		this.driver = driver;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	

}
