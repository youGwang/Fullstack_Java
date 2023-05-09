package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBank {
	Scanner sc = new Scanner(System.in);
	//필드 - money
	int money=0;
//메소드 - deposit, withdraw, showMoney
	
	
	
	public void deposit() {
		System.out.print("입금할 돈을 입력하세요 >> ");
		int a = sc.nextInt();
		money = money + a;
	}
	public void withdraw() {
		System.out.print("출금할 돈을 입력하세요 >> ");
		int b = sc.nextInt();
		money = money - b;
	}
	public void showMoney() {
		System.out.print("남은돈은 "+money+" 입니다.\n");
	}


}
