package 페스티벌10_17;

import java.util.Scanner;

public class 보너스5번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int a;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번쨰 수 입력 : ");
			a = sc.nextInt();
			arr[i] = a;
		}
		
		
		int temp = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = i + 1; j < 5 ; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬 후");
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
