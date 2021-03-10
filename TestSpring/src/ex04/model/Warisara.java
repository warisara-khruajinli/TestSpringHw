package ex04.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ex01.model.Injection;

public class Warisara implements Injection{
	String khruajinli;
	int may;


	@Override
	public String getHead() {
		// TODO Auto-generated method stub
		return khruajinli;
	}

	@Override
	public int getTail() {
		// TODO Auto-generated method stub
		return may;
	}
	
	@Value("Namwaan")public void setHead(String khruajinli) {
		this.khruajinli = khruajinli;
	}
	
	@Value("084")public void setTail(int may) {
		this.may = may;
	}
}

