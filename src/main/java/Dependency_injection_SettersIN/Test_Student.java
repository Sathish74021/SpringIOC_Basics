package Dependency_injection_SettersIN;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Student {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("di.xml");
		Student sd = (Student) ac.getBean("std");
		System.out.println(sd);
	}

}
