package 페스티벌10_17;

import java.util.Scanner;

public class 보너스4번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int num;
		
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(i+"번쨰 별의 수 : ");
			num = sc.nextInt();
			arr[i] = num;
		}
	
	
	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+":");
			for(int j=0;j<arr[i];j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	
	
	
	}

}
