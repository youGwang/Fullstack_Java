package 페스티벌10_17;

import java.util.Scanner;

public class Ex15번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int[] a = {1,2,4,7,11,16,22,33,44};
		
		for(int i =0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
