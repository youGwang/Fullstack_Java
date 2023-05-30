package 페스티벌10_17;

public class Ex03번문제 {

	public static void main(String[] args) {
	int sum = 0;
	
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				sum = sum + -i;
				System.out.print(-i+" ");
			}else {
				sum = sum + i;
				System.out.print(i+" ");
			}
		}
		System.out.print("\n결과 : "+sum);
	}

}
