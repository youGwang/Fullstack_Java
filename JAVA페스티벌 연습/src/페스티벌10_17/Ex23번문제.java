package 페스티벌10_17;

public class Ex23번문제 {

	public static void main(String[] args) {
		int[][]arr = new int[5][5];
		int[][]array = new int[5][5];
		
		int num = 1;
		
		System.out.print("원본\n");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = num;
				System.out.print(arr[i][j]+"\t");
				num++;
			}
			System.out.println("");
		}
		
		System.out.print("\n90도 회전\n");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				array[i][j] = arr[j][4-i];
				System.out.print(array[i][j]+"\t");
				num++;
			}
			System.out.println("");
		}
	}

}
