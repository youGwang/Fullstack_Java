import java.util.Random;
import java.util.Scanner;

public class Ex06숫자맞추기게임 {

	public static void main(String[] args) {
		// 1. 기능들 가져오기
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		// ctrl + shift + o : 한꺼번에 import 단축키
		
		// 2. 출력문 ---> 1번만
		System.out.println("======1부터 100 사이 숫자 맞추기 게임!======");
		
		// 랜덤한 숫자 한개 ---> 답 : 한번만 실행
		int num = rd.nextInt(100)+1;
		
		// 반복이 되어지는 부분!!
		// 3. 출력문 : 입력
		// 입력한 값이 랜덤 숫자와 일치하는지 판단
		
		/*
		제어문 - 조건문, 반복문
		개발자가 원하는 방향으로 컴파일을 진행하기 위해
		조건문 : 판단
		if, if - else , if else if 문, + switch
		반목문 : 프로그램 개발자는 코드를 최소로 작성하는데 목표
		while, do - while/////, for문
		
		while(조건식){
				실행코드
			} ---> break; continue; 사용가능
		
		사용자가 언제 1을 입력해서 종료할 지 모름
		
		do{
				적어도 한번은 실행시킬 코드
			}while(false)
		break; continue; 사용가능	
			
			
		*/
		
		
		while(true) {
			System.out.print("1과 100사이의 정수를 입력하세요 >>");
			int answer = sc.nextInt();
			
			if(num > answer) {
				System.out.println("더 큰 수로 다시 시도 해보세요");
				continue;
			}else if(num < answer) {
				System.out.println("더 작은 수로 다시 시도 해보세요");
				continue;
			}else if(num==answer) {
				System.out.println(num+" 정답입니다!!");
				break;
			}
			
		}
	
	
	
	
	
	}

}
