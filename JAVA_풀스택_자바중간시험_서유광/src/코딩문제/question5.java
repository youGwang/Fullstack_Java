package 코딩문제;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("단 수 입력 : ");
		int number = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int number1 = sc.nextInt();
		
		
		for(int i = 1;i<=number1;i++) {
			System.out.println(number+" * "+i+" = "+number*i);
			
		}
	}

}
