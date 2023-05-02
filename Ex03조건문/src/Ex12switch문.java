import java.util.Scanner;

public class Ex12switch문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		
	
		System.out.print("--메뉴--\n1.콜라(1800원) 2. 파워에이드(2000원) 3.탄산수(1200원) >>");
		int a = sc.nextInt();
		
		int col = 1800;
		int power = 2000;
		int tan = 1200;
		
		int b,c,d= 0;
		b = money - col;
		c = money - power;
		d = money - tan;
		
		
		//조건이 2~3개 인경우 -> if
		//조건이 그 이상인경우 -> switch
		
		switch(a) {
		case 1 : if(b>=0) {
							System.out.println("잔돈 : "+b); 
							System.out.println((b/1000>0)?"천원 : "+ b/1000 : "천원 : 0" );
							b = b%1000;
							System.out.println((b/500>0)?"오백원 : "+ b/500 : "오백원 : 0" );
							b = b%500;
							System.out.println((b/100>0)?"백원 : "+ b/100 : "백원 : 0" );
		}
				 else {
					 	System.out.println("돈이 부족해요 ㅠㅡㅠ");
				 }
		
					break;
		case 2 : if(c>=0) {
							System.out.println("잔돈 : "+c); 
							System.out.println((c/1000>0)?"천원 : "+ c/1000 : "천원 : 0" );
							c = c%1000;
							System.out.println((c/500>0)?"오백원 : "+ c/500 : "오백원 : 0" );
							c = c%500;
							System.out.println((c/100>0)?"백원 : "+ c/100 : "백원 : 0" );   }
				 else {
					 	System.out.println("돈이 부족해요 ㅠㅡㅠ");
				 }
				 break;
		case 3 : if(d>=0) {
							System.out.println("잔돈 : "+d);
							System.out.println((d/1000>0)?"천원 : "+ d/1000 : "천원 : 0" );
							d = d%1000;
							System.out.println((d/500>0)?"오백원 : "+ d/500 : "오백원 : 0" );
							d = d%500;
							System.out.println((d/100>0)?"백원 : "+ d/100 : "백원 : 0" );     }
				 else {
					 	System.out.println("돈이 부족해요 ㅠㅡㅠ");
				 }
			     break;
		}
		
		
	}

}
