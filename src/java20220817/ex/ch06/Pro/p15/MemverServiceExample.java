package java20220817.ex.ch06.Pro.p15;

public class MemverServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean res = memberService.login("hong", "12345");
		if(res) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
