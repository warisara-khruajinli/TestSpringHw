package ex01.model;

public class Warisara implements Injection{
	String khruajinli;
	int may;
	
	@Override
	public String getHead() {
		return khruajinli;
	}

	@Override
	public int getTail() {
		return may;
	}
	
	public void setHead(String khruajinli) {
		this.khruajinli = khruajinli;
	}
	public void setTail(int may) {
		this.may = may;
	}

}
