package ex01.model;

public class Khruajinli implements Injection{
	private Warisara warisara;

	public Khruajinli() {}
	
	public Khruajinli(Warisara warisara) {
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
