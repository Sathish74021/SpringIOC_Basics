package basicIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bike2 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("sathish.xml");
		Bike b=(Bike) ac.getBean("ourbike");
		b.model();
	}

}
