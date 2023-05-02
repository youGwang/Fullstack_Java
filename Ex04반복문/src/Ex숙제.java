import java.util.Scanner;

public class Ex숙제 {

	public static void main(String[] args) {
		
		// in ----> console에 입력
		// out ---> console에 출력
		
		// 1. 입력하는 도구가져오기
		Scanner sc = new Scanner(System.in);
		// 2. 현재몸무게 : --> 출력문
		// 오른쪽에 입력받기
		System.out.print("현재 몸무게  : ");
		int now = sc.nextInt();
		// 3. 목표몸무게 : --> 출력문
		// 오른쪽에 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		// 4. 출력문
		// 오른쪽에 입력받기
		// 4번은 반복이 된다 ----> 목표뭄무게에 도달할때까지 반복
		int week = 1;
		
		
		while(true) {
			
			System.out.print( week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			
			week++;
			//현재 몸무게 = 현재 몸무게 - 감량 몸무게
			now = now - minus; // now -= minus
			// 종료조건
			// : now가 목표몸무게에 도달했는지 (작거나 같은지) : while문을 종료
			if(now <= goal) {
				break;
			}
		}
		
		// 5. 출력문
		System.out.println(now + "kg 달성!! 축하합니다!!");
		
		

	}

}
