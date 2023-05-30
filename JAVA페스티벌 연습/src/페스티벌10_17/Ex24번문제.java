package 페스티벌10_17;

import java.util.Scanner;

public class Ex24번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("x 입력 >> ");
		int x = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print(i+1 + "번쨰 정수 입력 >> ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		System.out.print("결과>> ");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<x) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
	
	
	
	}

}
