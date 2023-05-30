package 페스티벌10_17;

import java.util.Scanner;

public class Ex01번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int a = sc.nextInt(); 
		System.out.print("목표몸무게 : ");
		int b = sc.nextInt(); 
	
		
		int i=1;
		while(true) {
			
			System.out.print(i+"주차 감량 몸무게 : ");	
			int c = sc.nextInt();
			a = a - c;
			i++;
			if(a<=b) {
				System.out.print(a+"kg 달성!! 축하합니다!!");
				break;
			}
			
			
			
		}
		
		
		
	}

}
