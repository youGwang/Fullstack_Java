package 페스티벌문제;

import java.util.Scanner;

public class Ex10진수를2진수로변환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력하는 도구 가져오기
		
		// 2진수를 저장할 수 있는 배열 : 10
		
		int[] arr = new int[10];
		
		
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		// 2진수를 구해서 배열에 저장
		// ex) 8을 2로 나눠서 나머지값 배열에 저장 0 +1
		//     위에 나누기한 몫을 2로 나눠서 나머지값 배열에 저장1 +1
		//     위에 나누기한 몫을 2로 나눠서 나머지값 배열에 저장2 +1
		//     ...
		//    언제까지 반복? : 나눴을 때 몫이 1이면 멈춤
		int i = 0;
		while(num >= 2) {
			// index
			arr[i] = num%2;
			// num을 2로 나누기
			num = num/2;
			// num을 2로 나눠서 나온 나머지값을 배열에 저장
			
			i++;
		}
		
		arr[i] = num;
		
		// arr이라는배열에 i번쨰 인덱스까지 값이 들어가 있는 상태
		// 출력
		// + index어디까지 값이 저장되어있는지 변수
		for(int j=i ; j>=0;j--) {
			System.out.print(arr[j]+" ");
		}

	}

}
