import java.util.Scanner;

public class Ex02for문 {

	public static void main(String[] args) {
		
		
		/*
		 // 1. 1~100까지 중 3의 배수를 출력
		  
		for(int i=1;i <= 100;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		
		*/
		
		/*
		 // 2. 1~100까지 중 3의 배수 && 5의 배수
		 
		for(int i=1;i <= 100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
		
		*/
		
		// 3. 한 개의 자연수 --> 배수 10개 출력
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		
		System.out.print("자연수를 입력하세요 : ");
		number = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.print(i * number+"    ");
		}
		
	
	}

}
