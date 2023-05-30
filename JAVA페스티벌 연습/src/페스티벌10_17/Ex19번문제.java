package 페스티벌10_17;

import java.util.Scanner;

public class Ex19번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수입력 : \n");
		int a = sc.nextInt();
		System.out.print("어느 수까지 출력 : \n");
		int b = sc.nextInt();
		
		
		System.out.print(a+"단\n");
		for(int i =1;i<=b;i++) {
			
			System.out.print(a+"*"+i+"="+a*i);
			System.out.println();
		}
		
	}

}
