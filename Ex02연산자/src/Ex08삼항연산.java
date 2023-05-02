import java.util.Scanner;

public class Ex08삼항연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("노동시간을 입력하세요 : ");
		int a = sc.nextInt();
		int si = 9000;
		
		System.out.println(a<9 ? (int)(a*si) : (int)(72000+(a%8)*si*1.5) );
	
		*/
		
		System.out.print("일한 시간 : ");
		int work = sc.nextInt();
		
		//기본 시급 : 9000 //8~ (초과한 시간에 대해서만 1.5배)
		//8시간 이하 근무 : 9000* 일할 시간(work)
		//8시간 초과 근무 : 8*9000 + (일한 시간(work) - 8) * 9000 * 1.5
		
		//실수 -> 정수 형변환 절대 자동형변환 해주지 않음!
		//같은 크기더라도 실수가 표현범위가 더 넓기 때문에!
		
		int 기본시급 = 9000;
		
		double pay = (work>8) ? 8*기본시급+(work-8)*기본시급*1.5 : 기본시급*work;
		
		System.out.println("총 임금은 "+ (int)pay+ "원 입니다");  // 형변환 (int)
		System.out.printf("총 임금은 %.0f원 입니다",pay); // 소수점 자리 %.0f
	}

}
