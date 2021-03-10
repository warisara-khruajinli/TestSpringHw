package ex04.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ex01.model.Injection;
import ex04.model.Khruajinli;
import ex04.model.Dad;
import ex04.model.Warisara;

@Configuration
public class BeanConfig {

	@Bean
	@Scope("prototype")
	public Injection me() {
		return new Warisara();	
	}
	
	@Bean
	@Scope("singleton")
	public Khruajinli mine() {
		return new Khruajinli((Warisara)me());
	}
	
	@Bean
	@Scope("prototype")
	public Dad listBean() {
		return new Dad(Arrays.asList(me(),mine()));	
	}
	
	
}
