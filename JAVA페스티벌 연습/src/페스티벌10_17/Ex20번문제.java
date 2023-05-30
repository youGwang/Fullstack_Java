package 페스티벌10_17;

import java.util.Scanner;

public class Ex20번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자입력>>\n");
		int number = sc.nextInt();
	
		
		int[] a = new int[32];
		int count = 0 ;
		
		while(number!=1) {
			a[count++] = number%2;
			number = number/2;
		}
		
		a[count]=number;
		
		for(int i=count; i>=0; --i) {
			System.out.print(a[i]+" ");
		}
		
	}

}
