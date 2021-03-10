package ex01.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex01.model.Injection;
import ex01.model.Khruajinli;
import ex01.model.Term;
import ex01.model.Warisara;

public class Tanit {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Injection x = context.getBean("me", Warisara.class);
		System.out.println(x.getHead()+ " " + x.getTail());
		
		Injection y = context.getBean("mine", Khruajinli.class);
		System.out.println(y.getHead()+ " " + y.getTail());
		
		Term k = (Term) context.getBean("listBean");
		System.out.println(k.getList());
		
		System.out.println("Is first element is the same as x: " +(k.getList().get(0) == x) );
		System.out.println("Is second element is the same as y: " +(k.getList().get(1) == y));
		
		context.close();
		
	}

}
