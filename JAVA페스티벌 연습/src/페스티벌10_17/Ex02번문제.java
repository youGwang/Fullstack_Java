package 페스티벌10_17;

import java.util.Scanner;

public class Ex02번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int a = sc.nextInt();
		int si = 5000;
		int sa = 7500;
		if(a<=8) {
			System.out.println("총 임금은"+si*a+"원 입니다.");
		}else {
			a = a -8;
			a = a * sa + 40000;
			System.out.println("총 임금은"+a+"원 입니다.");
		}
		
	}

}
