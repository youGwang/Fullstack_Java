package 이중for문;

public class Ex01이중for문 {

	public static void main(String[] args) {
		
		System.out.println("====구구단====\n");
		
		for(int i=2;i<10;i++) {
			System.out.println("---- "+i+"단 ----");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		// 지역변수 vs 전역변수
		// 지역변수 : 특정 영역(scope)에서만 사용할 수 있는 변수
		// 전역변수 : 클래스 전체에서 사용할 수 있는 변수
		// 특정영역을 구분하는 방법 : {영역}
		
	}

}
