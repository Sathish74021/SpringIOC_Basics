package AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BabyDriver {
	public static void main(String[] args) {
		ApplicationContext ap = new AnnotationConfigApplicationContext(ConfigAnnotation.class);
		Baby baby = (Baby) ap.getBean("baby");
		baby.eat();
		baby.eat();
	}
}
