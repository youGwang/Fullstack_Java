package 페스티벌10_17;

import java.util.Random;

public class Ex10번문제 {

	public static void main(String[] args) {
		int[] arr = new int[8];
		Random rd = new Random();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = rd.nextInt(100)+1;
		}
		System.out.print("배열에 있는 모든 값 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int max = 0;
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}else if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.print("\n가장 큰 값 : "+max);
		System.out.print("\n가장 작은 값 : "+min);
		
		
	}

}
