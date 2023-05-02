import java.util.Scanner;

public class Ex06삼항연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		
		System.out.println((a>b)?"두 수의 차 : "+(a-b):"두 수의 차 : "+(b-a));
	
		String s = (a>b)? "두 수의 차 : "+(a-b):"두 수의 차 : "+(b-a);
		System.out.println(s);
		
		
	}

}
