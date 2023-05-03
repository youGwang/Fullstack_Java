package 메서드;

public class Ex13메서드 {

	public static void main(String[] args) {
		int base = 3;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인: "+ result);
	
		// 매개변수 : 2개 int
		// 리턴타입 : int
		// base의 n승
		// base의 n번 곱한 결과값
		
		
		double result2 = Math.pow(5, 2);
		System.out.println(result2);
		
	}

	
	
	/**제곱수 구하기*/ // -> 메서드 설명 적는법!
	public static int powerN(int base, int n) {
		
		// base를 n번 곱하는 걸 반복
		int sum=1;
		for(int i=1;i<=n;i++) {
			// n번 반복하는 for문
			sum = sum * base;
		}
		return sum;
	}
	
	
}
