package com.lti.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjection {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("country.xml");
		Softwares soft=(Softwares)applicationContext.getBean("s1");
		soft.printListOfLanguages();
	}

}
