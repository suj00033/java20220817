package ch11.book.s110302;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member) obj;
//			if(id.equals(id)) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	@Override 											// id가 동일한 문자열인 경우
//	public int hashCode() {								// 같은 해시 코드를 리턴
//		return id.hashCode();
//	}
}
