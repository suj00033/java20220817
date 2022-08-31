package p99codingbat.exer.bankapp;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	// 하나의 계좌 정보를 갖고있는 객체 Account를 여러개 만들기 위해 배열 필드로 저장
	// Account[] 변수의 타입을 Account이라는 클래스의 배열로 지정한 후
	// new Account[100] 100개의 고정 배열로 생성
	private static Scanner scanner = new Scanner(System.in);
	static int arrCount = 0;
	// 계좌 생성시 배열의 카운트를 생성해주는 변수
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");
            
            int selectNo = scanner.nextInt();
            
            if(selectNo == 1) {
            	creatAccount();
            } else if(selectNo == 2) {
            	accountList();
            } else if(selectNo == 3) {
            	deposit();
            } else if(selectNo == 4) {
            	withdraw();
            } else if(selectNo == 5) {
            	run = false;
            }
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌생성하기
	private static void creatAccount() {
		System.out.println("----------");
        System.out.println("계좌 생성");
        System.out.println("----------");
        
        // scanner 입력창을 전부 nextLine으로 통일
        // String으로 받은 금액 balance 다시 Integer.parseInt를
        // 사용해서 int형으로 변환
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        String strBalance = scanner.nextLine();
        int balance = Integer.parseInt(strBalance); // 문자열을 int형으로 반환
        
        // scanner로 입력받은 사용자 정보를 아래의 객체로 생성
        Account account = new Account(ano, owner, balance);
        
        // 위에서 생성한 account 배열에 객체 하나를 저장
        accountArray[arrCount] = account;
        // 배열 저장 후 배열의 행을 다음 카운트로 넘김
        arrCount++;
        // 배열의 행 카운트가 1씩 증감되었기 때문에 계좌를 다시 생성할 경우
        // 먼저 생성된 배열의 바로 다음 행에 저장
        System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	// 계좌목록보기
	private static void accountList() {
		 System.out.println("----------");
	     System.out.println("계좌 목록");
	     System.out.println("----------");
	     
	     for(int i=0; i<accountArray.length; i++) {
	    	 // 위에서 생성된 배열의 길이만큼 돈 후에
	    	 Account account = accountArray[i];
	    	 // 배열에 저장된 객체의 값을 account 클래스에 저장
	    	 // https://worri.tistory.com/95
	     }
	}
}
