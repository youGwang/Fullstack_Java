package 메서드;

public class Ex12메서드 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		
		System.out.println(cal(num1, num2, op));
	}

	  // cal 메서드가 가진 기능
	 // + op (+, -, *, /)
	 // 만약에 +가오면, 더한 결과값을 돌려주고,
	 // 만약에 -가오면, 뺀 결과값을 돌려주면됩니다.
	public static int cal(int num1, int num2, char op) {
		
		// op가 어떤 연산자인지 판단해서 결과값을 보내줘야한다.
		if(op == '+') {
			return num1 + num2;
		}else if(op == '-') {
			return num1 - num2;
		}else if(op == '*') {
			return num1 * num2;
		}else {
			return num1/num2;
		}
		
	}
}
