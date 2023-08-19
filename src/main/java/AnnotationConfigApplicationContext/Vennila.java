package AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
public class Vennila implements IceCreame{
	public void open() {
		System.out.println("Vennila is opened");
	}
}
