
public class Ex02재귀함수 {

	public static void main(String[] args) {
		
		
		// 1 1 2 3 5 8 13 21 ...
		
		for(int i=1;i<=10;i++) {
			System.out.println(fibonacci(i));
		}
	}

	//피보나치 특정 항 값을 구하는 메서드
	public static int fibonacci(int num) {
								//num : 구하려고하는 숫자의 순서(항)
		int result = 0;
		if(num ==1 || num==2) {
			result = 1;
		}else if(num >= 3 ){
			// 첫번째 항 -> 1  => fibonacci(1)
			// 두번째 항 -> 1  => fibonacci(2)
			result = fibonacci(num-2) + fibonacci(num-1);
		}
		
		return result;
	}
	
}
