package 이중for문;

public class Ex07별찍기 {

	public static void main(String[] args) {
	
		for(int j = 1 ; j<=5 ; j++) {
			//j : 1 2 3 4 5
			for(int i =1; i<= 5-j; i++) {
				System.out.println(" ");
			}
			for(int i = 1;i <= j;i++) {
				System.out.println("*");
			}
			System.out.println("");
		}
	
	
	
	
	}
}
