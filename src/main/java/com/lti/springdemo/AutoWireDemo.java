package com.lti.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireDemo {
	 public static void main(String[] args) {
	    	new AutoWireDemo();
	    	ApplicationContext context = new
	    	ClassPathXmlApplicationContext("account.xml");
	    	UserAccountService uas;
	    	uas=(UserAccountService) context.getBean("UserAccountService");
	    	System.out.println(uas.getName());
	    	System.out.println(uas.getDetails());
	    	System.out.println(uas.getDescription());

}
}
