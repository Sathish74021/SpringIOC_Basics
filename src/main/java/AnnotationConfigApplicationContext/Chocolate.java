package AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Chocolate implements IceCreame {

	public void open() {
		System.out.println("Choco is opened");
	}

}
