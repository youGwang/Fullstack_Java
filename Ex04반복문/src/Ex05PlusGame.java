import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {

	public static void main(String[] args) {

		// 랜덤기능 사용하기!!
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		 // 1~50 랜덤한 숫자
		
		
		
		System.out.println("====PLUS GAME====");
		int count =0;
		
		
		while(true){
			int num = rd.nextInt(50)+1;
			int num1 = rd.nextInt(50)+1;
			int sum = 0;
			sum = sum + num + num1;
		System.out.print(num+"+"+num1+"=" );
		int number = sc.nextInt();

		if(number==sum) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
			
			
			++count;
				if (count == 3) {
				
				System.out.println("3번의 기회가 끝났습니다 종료합니다.");
				break;
					}
			System.out.print("계속 하시겠습니까? >>");
			String Fail = sc.next();
			 if(Fail.equals("N")){
						
						System.out.print("종료합니다");
						break;
					}
				
					
				}
			}
	}

}
