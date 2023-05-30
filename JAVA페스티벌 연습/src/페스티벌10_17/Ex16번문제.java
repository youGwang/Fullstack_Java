package 페스티벌10_17;

import java.util.Scanner;

public class Ex16번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum =0;

		while(num >0) {
			sum += num % 10;
			num = num/10;
		}
		System.out.println("합은 " + sum + "입니다.");
		
	}

}
