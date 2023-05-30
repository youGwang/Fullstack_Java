package 페스티벌10_17;

import java.util.Scanner;

public class Ex17번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번 쨰 정수 입력>> ");
			number = sc.nextInt();
			if (number % 3 == 0) {
				a[i] = number;
			}

		}

		System.out.print("3의 배수 : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
