package 페스티벌10_17;

import java.util.Scanner;

public class Ex08번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int a = 0;
		if(num % 10 >= 5) {
			a = (num / 10 + 1) * 10;
		}else {
			a = (num / 10) * 10;
		}
		
		System.out.println("반올림수 : " + a);

	}

}
