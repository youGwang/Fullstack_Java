import java.util.Scanner;

public class Ex08다중ifelse문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("잔액 : ");
		int money = sc.nextInt();
		
		System.out.print("성인/청소년/어린이 : ");
		String a = sc.next();
		
		if(a.equals("성인") && money>=1800) {
				System.out.println("감사합니다");
		}
		else if(a.equals("청년") && money>=1500) {
				System.out.println("반갑습니다");
		}
		else if(a.equals("어린이") && money>=1000) {
			System.out.println("안녕하세요");
		}
		else {
			System.out.println("잔액이 부족합니다");
		}
		
	}

}
