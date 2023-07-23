
public class Ex03배열실습 {

	public static void main(String[] args) {

		//1. 크기가 10인 배열 생성 원하는 값으로 초기화
		// {}
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		 
		
		//2. 배열의 값 중 홀수만 출력, 홀수가 몇개인지 출력
		System.out.print("배열 홀수 : ");
		int count = 0; // 홀수 개수 카운팅
		for(int i=0;i<array.length;i++) {
			
			if(array[i]%2 !=0) {
				System.out.print(array[i]+" ");
				count++;    // count += 1;
			}
		}
		
		System.out.println("\n총 개수 : " +count +"개");
	
	
	}

}
