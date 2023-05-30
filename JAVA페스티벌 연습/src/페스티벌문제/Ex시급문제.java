package 페스티벌문제;

import java.util.Scanner;

public class Ex시급문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int sum = 0;
		int si = 5000;
		if(time>8) {
			sum = 8 * si;
			time = time - 8;
			sum = (int) (sum + time * (si * 1.5));
		}else if(time<=8) {
			sum = sum + (time * si);
		}
		System.out.println(sum);
	}

}
