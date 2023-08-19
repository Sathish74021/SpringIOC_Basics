package AnnotationConfigApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	@Autowired
	IceCreame ice;

	void eat() {
		ice.open();
		System.out.println("Baby Starts Eat");
	}
}
