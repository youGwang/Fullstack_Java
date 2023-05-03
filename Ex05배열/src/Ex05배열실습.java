import java.util.Scanner;

public class Ex05배열실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 크기가 5인 정수형 데이터를 정장할 수 있는 배열생성
		// -> 그 배열의 참조값(주소값)을 저장할 레퍼런스 변수 선언
		int[] score = new int[5];
	
		
		for(int i=0;i<score.length;i++) {
			System.out.print(i+1 +"번쨰 입력>> ");
			score[i] = sc.nextInt();
		}
		
		System.out.print("입력된 점수 : ");
		//일반 for문
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}
		
		//확장 for문(for~each문)
		// : 배열, List 구조에서 쓰일 수 있는 반복문
		//for(배열의 0번인덱스에 있는 값부터 임시로 저장할 변수:배열의 레퍼런스변수이름)
		for(int a:score) {
			System.out.print(a+" ");
		}
		
		int max = score[0]; //내가 지금까지 본 점수중에 최고점수
		int min = score[0]; //내가 지금까지 본 점수중에 최저점수
		int sum = 0; //누적합
		for(int a:score) {
			//sum = sum+a;
			sum += a;
			if(max<a) { //최고점수
				max = a;
			}
			if(min>a) {
				min = a;
			}
		}
		System.out.println("\n최고점수 : "+max);
		System.out.println("최저점수 : "+min);
		System.out.println("총합 : "+sum);
		System.out.printf("평균 : %.2f",sum/(double)score.length);
	}

}
