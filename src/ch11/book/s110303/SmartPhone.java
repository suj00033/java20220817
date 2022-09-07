package ch11.book.s110303;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override										// toString 재정의
	public String toString() {
		return company + ", " + os;
	}
	
	
}
