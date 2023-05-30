package 페스티벌문제;

import java.util.Scanner;

public class Ex대소문자구별없이구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력하는 도구 가져오기

		// a ~ z : 26개
		// 알파벳 빈도수가 저장될 int[26] 배열을 하나 만들어주자
		int[] alphabet = new int[26];

		// nextLine() : Enter를 칠떄까지 문자열을 리턴
		// next() : space를 칠때까지 문자열을 리턴
		// 출력문 : 입력 (s)
		System.out.print("==== 알파벳 빈도수 구하기 ====\n입력>> ");
		String s = sc.nextLine();

		// Helloworld
		// 띄어쓰기, 대문자 ---> 소문자
		// replace(" ","").toLowerCase(); --> 대문자를 소문자로 반환
		s = s.replace(" ", "").toLowerCase();
		// helloworld
		// 문자열(s) ---> 문자(char):쪼개 ---> 아스키코드(int)
		// charAt을 사용해서 빈도수 구하기
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); // charAt --> String으로 저장된 문자열 중에서 한 글자만
									// 선택해서 char타입으로 변환해준다
			alphabet[c - 97]++;
		}
		// charAt(index) ---> 아스키코드(int)
		// a: 97 ~ z:122
		//
		// a : 0인덱스에 값이 +1
		// b : 1인덱스에 값이 +1
		// s.length() 반복 횟수!

		// 출력하기 ~ 빈도수가 저장되어있는 배열 출력
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println((char) (i + 97) + ":" + alphabet[i]);
		}
	}

}
