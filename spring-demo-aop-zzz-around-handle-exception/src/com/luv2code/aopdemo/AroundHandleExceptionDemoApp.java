package com.luv2code.aopdemo;


import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AroundHandleExceptionDemoApp {

	private static Logger myLogger = Logger.getLogger(AroundHandleExceptionDemoApp.class.getName());

	public static void main(String[] args) {
		

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService theTrafficFortuneService = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		myLogger.info("Main Program: AroundDemoApp");
		myLogger.info("Calling getFortune");
		
		boolean tripWire = true;
		String data = theTrafficFortuneService.getFortune(tripWire);
		
		myLogger.info("\nMy fortune is :" + data);
		
		myLogger.info("\nFinished!");
		
		context.close();
	}
	
	

}
