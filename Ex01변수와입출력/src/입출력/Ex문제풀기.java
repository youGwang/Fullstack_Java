package 입출력;

import java.util.Scanner;

public class Ex문제풀기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.printf("이름은 %s 이고 나이는 %d입니다.\n ", name, age);
		System.out.print("이름은 "+name+"이고 나이는 "+age+" 입니다.");
	
		
	}
}
