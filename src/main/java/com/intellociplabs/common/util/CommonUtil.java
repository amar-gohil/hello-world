package com.intellociplabs.common.util;


import java.util.Date;
import java.util.UUID;


public class CommonUtil {	
	
	 public static String getUUID() {
	    	return UUID.randomUUID().toString();
	 }	 
	 public static Long getCurrentTimeInUTC() {	    	
	    	return new Date().getTime();
	}
}
