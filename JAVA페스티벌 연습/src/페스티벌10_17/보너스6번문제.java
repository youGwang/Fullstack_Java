package 페스티벌10_17;

public class 보너스6번문제 {

	public static void main(String[] args) {

		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	
	
	
	public static int powerN(int base, int n) {
		
		// base의 n제곱만큼
		int sum = 1;
		for(int i=1; i<=n ;i++) {
			sum = sum * base;	
		}
		return sum;
	}
}
