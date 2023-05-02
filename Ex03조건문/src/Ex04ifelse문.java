import java.util.Scanner;

public class Ex04ifelse문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 : ");
		int money = sc.nextInt();
		
		System.out.print("사람 명 수 : ");
		int human = sc.nextInt();
				
		if(money/human<10000) {
			System.out.println("10000원 미만 지불");
		}
		else {
			System.out.println("10000원 이상 지불");
		}
	}

}
