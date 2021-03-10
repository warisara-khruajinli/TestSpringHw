package ex04.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex01.model.Injection;
import ex04.model.Khruajinli;
import ex04.model.Dad;
import ex04.model.Warisara;

public class BeanMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfig.class);

		
		Injection x = context.getBean("me", Warisara.class);
		System.out.println(x.getHead()+ " " + x.getTail());
		
		Injection y = context.getBean("mine", Khruajinli.class);
		System.out.println(y.getHead()+ " " + y.getTail());
		
		Dad k = (Dad) context.getBean("listBean");
		System.out.println(k.getList());
		
		System.out.println("Is first element is the same as x: " +(k.getList().get(0) == x) );
		System.out.println("Is second element is the same as y: " +(k.getList().get(1) == y));
		
		context.close();
		
	}

}
