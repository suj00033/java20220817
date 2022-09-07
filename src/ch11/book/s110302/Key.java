package ch11.book.s110302;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (number != other.number)
			return false;
		return true;
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Key) {
//			Key compareKey = (Key) obj;
//			if(this.number == compareKey.number) {   	// 필드값이 같으면 true
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	@Override								// 재정의한 hashCode() 메소드를 통해
//	public int hashCode() {					// hashCode()의 리턴값을 number 필드값으로 했기 때문에
//		return number;						// 저장할때의 new Key(1)와 읽을때의 new Key(1)이 같은 해시코드로 리턴
//	}
}
