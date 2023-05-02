
public class Ex10치환 {

	public static void main(String[] args) {
		
		
		String left = "red";
		String right = "blue";
		
		String temp ; //임시 저장공간 선언 // 초기화를 안함!
		String temp1 = null ; //초기화를 함! -> reference type만 가능
		// int temp2 = null; 기본타입은 null로 초기화 x
		temp = left;
		left = right;
		right = temp;
		
		System.out.println(left); //blue
		System.out.println(right); //red
		

	}

}
