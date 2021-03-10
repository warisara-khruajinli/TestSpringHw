package ex02.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ex01.model.Injection;

@Component("listBean")
@Scope("prototype")

public class Term {
	private List<Injection> myList;
	
	
	public List<Injection> getList() {
		return this.myList;
	}
	
	@Autowired
	public Term(List<Injection> myList) {
		this.myList = myList;
	}
	
//	public Term() {}
	
}
