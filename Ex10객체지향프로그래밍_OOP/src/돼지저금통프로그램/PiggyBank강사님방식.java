package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBank강사님방식 {

	public static void main(String[] args) {
		System.out.println("===돼지 저금통===");
		//돼지 저금통 객체 생성
		PiggyBank강사님방식_ pi = new PiggyBank강사님방식_();
		// 입금기능 메소드 호출
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입금할 금액 입력 : ");
		int inputMoney = sc.nextInt();
		pi.deposit(inputMoney);
		System.out.println("입금할 금액 입력 : ");
		int inputMoney2 = sc.nextInt();
		pi.deposit(inputMoney2);
		//출금기능 메소드 호출
		pi.withdraw(300);
		//잔액확인 메소드 호출
		int m = pi.showMoney();
		System.out.println(m+"원 남았습니다.");
		// . : 참조한다!
		
	}

}
