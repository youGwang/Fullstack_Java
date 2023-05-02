import java.util.Scanner;

public class Ex03while문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0; //지금까지 입력한 모든 수의 합 저장
		int odd = 0; // 홀수 개수
		int even = 0; // 짝수 개수
		 
		 while(true) {
			 input = sc.nextInt();
			 //sum = sum + input
			 if(input==-1) {
				 break; //만나는 순간 반복문 나감!
			 }
			 if(input%2==1) { //홀수
				 odd++;
				 System.out.println("홀수");
				
			 }else { //나머지가 0일 때 -> 짝수
				 ++even;
				 System.out.println("짝수");
			 }
			 sum += input;
		 }
		 System.out.println("누적결과 : "+sum);
	
	
	
		
		/*
		while(input>=0) {
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			if(input<0) {
				System.out.println("누적결과 :"+sum);
				break;	
			}
			sum = sum + input;
		}
		
		*/
		 
		 
		 
		 /*
		 while(true) {
			 input = sc.nextInt();
			 if(input==-1) {
				 break;
			 }
			 sum += input;
		 }
		 System.out.println("누적결과 : "+sum);
	
	
	*/
	
	
	
	}
}
