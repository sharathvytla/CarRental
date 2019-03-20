package com.sharath.IntgImpl;

import com.sharath.IntgBeans.CarRentalIntg_dobReqBean;
import com.sharath.IntgBeans.CarRentalIntg_dobResBean;
import com.sharath.Loggers.Loggers;

public class CarRentalIntg_dobImpl {

	CarRentalIntg_dobResBean book(CarRentalIntg_dobReqBean reqbean) {

		Loggers.log.debug("entered into dob layer");
		String dob = reqbean.getDob();
		CarRentalIntg_dobResBean intgres = new CarRentalIntg_dobResBean();
		intgres.setBooked(reqbean.getDob());
		if (dob.equalsIgnoreCase("19/04/2019")) {
			Loggers.log.info("Sorry.." + dob + " this date already booked");
		} else {
			Loggers.log.info("Your are booking is successfull");
		}

		return intgres;
	}
}
