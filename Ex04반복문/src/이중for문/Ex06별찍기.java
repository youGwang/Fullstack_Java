package 이중for문;

public class Ex06별찍기 {

	public static void main(String[] args) {
		 	for(int i=0;i<=4;i++) {
			for(int j=4;j> i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int z=0;z<i;z++) {
				System.out.print("*");
			}
		 System.out.println(" ");
		 }

	}

}
