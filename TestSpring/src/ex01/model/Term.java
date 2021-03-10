package ex01.model;

import java.util.List;

public class Term {
	private List<Injection> myList;
	
	
	public List<Injection> getList() {
		return this.myList;
	}

	public Term(List<Injection> myList) {
		this.myList = myList;
	}
	
	public Term() {}
	
}
