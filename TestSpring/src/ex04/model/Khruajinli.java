package ex04.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

import ex01.model.Injection;


public class Khruajinli implements Injection{
	private Warisara warisara;

	public Khruajinli(@Autowired @Qualifier("me") Warisara warisara) {
		this.warisara = warisara;
	}

	
	@Override
	public String getHead() {
		return this.warisara.getHead();
	}

	@Override
	public int getTail() {
		return this.warisara.getHead().length();
	}
	

}
