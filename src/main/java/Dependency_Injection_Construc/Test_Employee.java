package Dependency_Injection_Construc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Employee {
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("di.xml");
		Employee emp=(Employee) ac.getBean("emp");
		System.out.println(emp);
	}

}
