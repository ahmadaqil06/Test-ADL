package com.adl.driver;

import com.adl.Utils.ConstantsDriver;

public class DriverStrategyImplementor {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case ConstantsDriver.CHROME:
			return new Chrome();

		case ConstantsDriver.FIREFOX:
			return new FireFox();

		default:
			return null;
		}
	}
}
