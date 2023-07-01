import java.util.Scanner;

public class Ex02if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		
		if(number%3==0 || number%5==0) {
			System.out.println("3 또는 5의 배수 입니다.");
		}
		else {
			System.out.println("3 또는 5의 배수가 아닙니다.");
		}
	}

}  
