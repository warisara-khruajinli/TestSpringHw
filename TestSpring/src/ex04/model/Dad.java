package ex04.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import ex01.model.Injection;


public class Dad {
	private List<Injection> myList;
	
	
	public List<Injection> getList() {
		return this.myList;
	}
	
	@Autowired
	public Dad(List<Injection> myList) {
		this.myList = myList;
	}
	
	
}
