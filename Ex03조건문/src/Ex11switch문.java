import java.util.Scanner;

public class Ex11switch문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(1~12) 입력 : ");
		int month = sc.nextInt();
		
		
		
		//java 15 이상부터는 case 1,2,12 : <- 가능
		switch(month) {
		case 1 :
		case 2 :
		case 12 :
			System.out.println(month+ "월은 겨울입니다.");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println(month+"월은 봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month+"월은 여름입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month+"월은 가을입니다.");
			break;
		default :
			System.out.println("잘못된 값입니다");
		}
	}

}
