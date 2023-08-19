package basicIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile2  {

	public static void main(String[] args) {
//		ClassPathResource cp=new ClassPathResource("sathish.xml");
//		BeanFactory bean=new XmlBeanFactory(cp);
//		Mobile mob=(Mobile) bean.getBean("mine");
//		mob.cover();
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("sathish.xml");
		Mobile mob=(Mobile) ap.getBean("mobile");
		mob.cover();
	}

}
