package 코딩문제;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//나이 사용자 출력
		System.out.print("나이 >> ");
		int age = sc.nextInt();
		
		
		if(age <= 40) {
			System.out.print("초년입니다.");
		}
		else if(age >= 41 && age <=60 ) {
			System.out.print("중년입니다.");
		}
		else {
			System.out.print("노년입니다.");
		}
	}

}
