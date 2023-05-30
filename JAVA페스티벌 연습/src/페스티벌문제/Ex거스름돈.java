package 페스티벌문제;

import java.util.Scanner;

public class Ex거스름돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int a = sc.nextInt();
		

		
	
		 if(a>=10000) {
							System.out.println("잔돈 : "+a); 
							System.out.println((a/10000>0)?"만원 : "+ a/10000 +"개" : "만원 : 0개" );
							a = a%10000;
							System.out.println((a/5000>0)?"오천원 : "+ a/5000 +"개" : "오천원 : 0개" );
							a = a%5000;
							System.out.println((a/1000>0)?"천원 : "+ a/1000 +"개" : "천원 : 0개" );
							a = a%1000;
							System.out.println((a/500>0)?"오백원 : "+ a/500 +"개" : "오백원 : 0개" );
							a = a%500;
							System.out.println((a/100>0)?"백원 : "+ a/100 +"개" : "백원 : 0개" );
		 	}else if(a>=5000) {
					 		System.out.println("잔돈 : "+a); 
							System.out.println((a/5000>0)?"오천원 : "+ a/5000 +"개" : "오천원 : 0개" );
							a = a%5000;
							System.out.println((a/1000>0)?"천원 : "+ a/1000 +"개" : "천원 : 0개" );
							a = a%1000;
							System.out.println((a/500>0)?"오백원 : "+ a/500 +"개" : "오백원 : 0개" );
							a = a%500;
							System.out.println((a/100>0)?"백원 : "+ a/100 +"개" : "백원 : 0개" );
		 	}else if(a>=1000) {
					 		System.out.println("잔돈 : "+a); 
							System.out.println((a/1000>0)?"천원 : "+ a/1000 +"개" : "천원 : 0개" );
							a = a%1000;
							System.out.println((a/500>0)?"오백원 : "+ a/500 +"개" : "오백원 : 0개" );
							a = a%500;
							System.out.println((a/100>0)?"백원 : "+ a/100 +"개" : "백원 : 0개" );
		 	}else if(a>=500) {
					 		System.out.println("잔돈 : "+a); 
							System.out.println((a/500>0)?"오백원 : "+ a/500 +"개" : "오백원 : 0개" );
							a = a%500;
							System.out.println((a/100>0)?"백원 : "+ a/100 +"개" : "백원 : 0개" );
		 	}else {
					 		System.out.println("잔돈 : "+a); 
							System.out.println((a/100>0)?"백원 : "+ a/100 +"개" : "백원 : 0개" );
		 	}
				
		
		
		
		
		
		
		

	}

}
