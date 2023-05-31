package 코딩문제;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("숫자입력 >> ");
		int number = sc.nextInt();
		
		System.out.println("10으로 나눈 몫 "+number/10);
		System.out.println("10으로 나눈 나머지 "+number%10);
		
	}

}
