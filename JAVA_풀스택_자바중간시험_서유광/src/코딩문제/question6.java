package 코딩문제;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();

			int sum = 0;
			while(num>0) {
				sum += num%10;
				num/=10;
			}
			System.out.println("각 자리 수 합 : "+ sum);
	}

}
