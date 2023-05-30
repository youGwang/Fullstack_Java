package 페스티벌10_17;

import java.util.Random;

public class Ex18번문제 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] lo = new int[6];
		
		
		for(int i=0;i<lo.length;i++) {
			lo[i] = rd.nextInt(45)+1;
			for(int j = 0 ; j<i;j++) {
				if(lo[i]==lo[j]) {
					i--;
					break;
				}
			}
		}
		
		
		
		for(int i=0;i<lo.length;i++) {
			System.out.println("행운의숫자 : "+lo[i]);;
		}
		
		
	}

}
