package 페스티벌문제;

public class Ex1부터100까지계산 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<101;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				sum = sum + i;
			}else if(i%2==0) {
				System.out.print(-i+" ");
				sum = sum + -i;
			}
		}
		System.out.println("\n결과 : "+sum);
	}

}
