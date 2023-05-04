
public class Ex4행6열배열복습 {

	public static void main(String[] args) {

		//배열 생성, 레퍼런스 변수 선언
		int[][] arr = new int[4][6];
		
		int num = 21;
		//21~ 숫자로 배열 초기화
		for(int i=0;i<arr.length;i++) { //총 4개의 1차원 배열을 다룰 수 있도록 함
			for(int j=0;j<arr[i].length;j++) { //1개의 1차원 배열을 다룰 수 있음(6칸)
				arr[i][j] = num++;
			}
		}
		//출력
		for(int i=0;i<arr.length;i++) { //총 4개의 1차원 배열을 다룰 수 있도록 함
			for(int j=0;j<arr[i].length;j++) { //1개의 1차원 배열을 다룰 수 있음(6칸)
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
