package 페스티벌10_17;

public class Ex12번문제 {

	public static void main(String[] args) {
		int[][] N = new int[5][5];
		
		
		int num = 1;
		for(int i=0;i<N.length;i++) {
			for(int j=0;j<N[i].length;j++) {
				N[j][i] = num++; 
			}
		}
		
		
		for(int i=0;i<N.length;i++) {
			for(int j=0;j<N[i].length;j++) {
				System.out.print(N[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
