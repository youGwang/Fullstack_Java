package 페스티벌10_17;

import java.util.Scanner;

public class Ex04번문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();

		System.out.println("잔돈 : " + money);

		int a = money / 10000;
		int b = money % 10000 / 5000;
		int c = money % 10000 % 5000 / 1000;
		int d = money % 10000 % 5000 % 1000 / 500;
		int e = money % 10000 % 5000 % 1000 % 500 / 100;

		System.out.printf("10000원 : %d개\n", a);
		System.out.printf("5000원 : %d개\n", b);
		System.out.printf("1000원 : %d개\n", c);
		System.out.printf("500원 : %d개\n", d);
		System.out.printf("100원 : %d개\n", e);

	}

}
