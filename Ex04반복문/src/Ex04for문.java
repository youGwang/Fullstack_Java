import java.util.Scanner;

public class Ex04for문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수 입력 : ");
		int number = sc.nextInt();
		System.out.print(number+"의 약수는 ");
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.print("입니다!");
		
		// 약수의 특징
		// 1. 자기보다 큰 수를 약수로 가지고 있지 않음
		// 2. 모든 숫자들의 가장 작은 약수는 1
		// +32 : 1 2 4 8 16 32
		// 24 : 1 2 3 4 6 8 12 24
		// 3. 자기 자신의 절반 ~ 자기자신 사이에 약수는 존재하지 않는다
		
	}

}
