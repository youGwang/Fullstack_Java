
public class Ex01이차원배열생성 {

	public static void main(String[] args) {
		
		
		int[][] arr = new int[3][5]; //배열생성시 크기 무조건 지정
		//일차원배열 3개 -> 5칸(길이 5)
		//레퍼런스배열 1개 -> 길이 3
		// -> 3행 5열 행렬 구조
		//int형 배열 -> 초기화를 하지않으면 기본 0
		
		arr[0][0] = 10;
		
		//arr[0] = 1; -> 레퍼런스 배열 초기화는 불가능
		System.out.println(arr[0][0]);
		
		char[][] charArr = {{'a','b','c'},{'d','e','f'}};
		System.out.println(charArr.length); //레퍼런스배열의 길이
											//일차원배열이 몇개? 2
		System.out.println(charArr[0].length); //일차원배열의 길이
		
		int num=1;
		int[][] arr2 = new int[5][5];
		
		
		for(int j=0;j<arr2.length;j++) { //반복
		for(int i=0; i<arr2[j].length ; i++) { //1차원배열 하나 초기화
										//1개의 행의 각 (실제)데이터를 다룬다.
			arr2[j][i] =  num++;
			}
		}
	
		for(int j=0;j<arr2.length;j++) { //반복
			for(int i=0; i<arr2[j].length ; i++) { //1차원배열 하나 초기화
				System.out.print(arr2[j][i]+"\t ");
				}
			System.out.println();
			}
	
		
		System.out.print("=============================================\n");
		
		
		//4행 6열 크기 2차원 배열, 21~ 출력
		int [][] arr4 = new int[4][6];
		
		int num2 = 21;
		
		for(int j=0;j<arr4.length;j++) { //반복
			for(int i=0; i<arr4[j].length ; i++) { //1차원배열 하나 초기화
											//1개의 행의 각 (실제)데이터를 다룬다.
				arr4[j][i] =  num2++;
				}
			}
		
		
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4[i].length;j++) {
				System.out.print(arr4[i][j]+"\t");
			}
			System.out.println();
		}
	
		System.out.print("=============================================\n");
		int [][] arr5 = new int[5][5];
		
		int num3 = 5;
		
		for(int j=0;j<arr5.length;j++) {
			for(int i=0; i<arr5[j].length ; i++) { 
											
				arr5[j][i] =  num3--;
				}
			num3 = num3+10;
		}
		
		
			
		for(int i=0;i<arr5.length;i++) {
			for(int j=0;j<arr5[i].length;j++) {
				System.out.print(arr5[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.print("=============================================\n");
		
		
		int [][] arr6 = new int[5][5];
		
		int num4 = 1;
		
		for(int j=0;j<arr6.length;j++) {
			for(int i=0; i<arr6[j].length ; i++) { 
				if(j%2==0) {
					//순차적(순방향) - 0,2,4
					arr6[j][i] =  num4++;
				}else {
					//역방향 - 1,3
					arr6[j][4-i] =  num4++;
				}
				
				
			}
			
		}
		
		
		
		for(int i=0;i<arr6.length;i++) {
			for(int j=0;j<arr6[i].length;j++) {
				System.out.print(arr6[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
