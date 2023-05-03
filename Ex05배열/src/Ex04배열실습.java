import java.util.Random;

public class Ex04배열실습 {

	public static void main(String[] args) {
		
		//랜덤 객체
		//레퍼런스 변수
		Random rd = new Random();
		
		//배열을 랜덤값 초기화
		int[] arr = new int[10];
		//정수배열을 선언 기본값 0
		
		System.out.print("랜덤배열 수 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = rd.nextInt(20)+1;
			
			System.out.print(+arr[i]+" ");
		}
		
		
		
		
		int max = arr[0]; // 지금까지 본 숫자중에 가장 큰 숫자
		int min = arr[0]; // 지금까지 본 숫자중에 가장 작은 숫자
		for(int j=0;j<arr.length;j++) {
		
			if(arr[j]>max) { //최대값
				max = arr[j];
				}
			if(arr[j]<min) { //최소값
					min = arr[j];
				}
				
			}
	   
			System.out.println("\n가장큰수 : "+max);
			System.out.println("가장작은 : "+min);
	
	
	    }
		
	}


