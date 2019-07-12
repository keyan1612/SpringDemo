package com.lti.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeInherit {

public static void main(String[] args) {
 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("employee.xml");
 Employee e=(Employee)applicationContext.getBean("e1");
 Employee e1=(Employee)applicationContext.getBean("e2");
 e.display();
 e1.display();
}
}

