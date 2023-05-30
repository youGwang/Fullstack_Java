package 페스티벌문제;

public class Ex77곱하기곱하기 {

	public static void main(String[] args) {
		int sum = 0;
		int j = 77;
		
		for(int i=1;i<=77;i++) {
			sum = sum + (j * i);
			j--;
		}
		System.out.println("\n결과 : "+sum);
	}

}
