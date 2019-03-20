package com.sharath.ServImpl;

import com.sharath.Loggers.Loggers;
import com.sharath.ProcBeans.CarRentalProc_ReqBean;
import com.sharath.ProcBeans.DOB;
import com.sharath.ProcBeans.Driv;
import com.sharath.ProcBeans.Location;
import com.sharath.ProcBeans.TOV;
import com.sharath.ProcImpl.CarRentalProc_Impl;
import com.sharath.ServBeans.CarRentalServ_ReqBean;
import com.sharath.ServBeans.CarRentalServ_ResBean;

public class CarRental_SrvImpl {
	
	
	CarRentalServ_ResBean book(CarRentalServ_ReqBean srvreq){
		Loggers.log.debug("entered into serv layer");
		//1.create a proc req bean object and set srv req to proc req
		CarRentalProc_ReqBean procreq=new CarRentalProc_ReqBean();
		
		TOV tov=new TOV();
		tov.setV(srvreq.getTov().getV());
		procreq.setTov(tov);
		DOB dob=new DOB();
		dob.setDob(srvreq.getDob().getDob());
		procreq.setDob(dob);
		procreq.getDriver();
		Location loc=new Location();
		loc.setFrom(srvreq.getLoc().getFrom());
		loc.setTo(srvreq.getLoc().getTo());
		procreq.setLoc(loc);
		
	
	
		
		
		return null;
		
	}
}
