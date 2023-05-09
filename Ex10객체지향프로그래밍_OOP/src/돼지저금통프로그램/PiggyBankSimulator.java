package 돼지저금통프로그램;

import 자판기객체지향연습.VendingMachine;
import java.util.Scanner;

import 물품관리프로그램.Product;
public class PiggyBankSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 돼지 저금통 객체 생성
		PiggyBank pig = new PiggyBank();
		
		// 입금기능 메소드 호출
		//pig.deposit();
		// 출금기능 메소드 호출
		//pig.withdraw();
		// 잔액확인 메소드 호출
		//pig.showMoney();
		
		
		while(true) {
			System.out.print("[1]입금하기 [2]출금하기 [3]잔액확인 [4]프로그램 종료 >> ");
			int number = sc.nextInt();
			if(number ==1) {
				pig.deposit();
			}else if(number ==2) {
				pig.withdraw();
			}else if(number ==3) {
				pig.showMoney();
			}else {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}

}
