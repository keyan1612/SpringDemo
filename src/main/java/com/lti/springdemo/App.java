package com.lti.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext appCon;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        appCon = new ClassPathXmlApplicationContext("StudentConfig.xml");
        StudentBean factory=(StudentBean)appCon.getBean("SB");
        factory.displayInfo();
        
        
    }
}
