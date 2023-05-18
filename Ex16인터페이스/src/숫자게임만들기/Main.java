package 숫자게임만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> members = new ArrayList<Member>();
		
		
		// 개발자2
		// : 사용자가 보여질 부분이 들어갈 곳
		// 뷰~
		// GameDummy game = new GameDummy();
		// PlusGame game = new PlusGame();
		
		
		System.out.print("====회원가입====\n");
		System.out.print("닉네임을 입력하세요 : ");
		String nickName = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.next();

		Member member = new Member(nickName, pw);
		members.add(member);

		boolean Log = false;
		while (!Log) {
			System.out.print("====로그인====\n");
			System.out.print("닉네임을 입력하세요 : ");
			String inputNickName = sc.next();
			System.out.print("비밀번호를 입력하세요 : ");
			String inputPw = sc.next();

			for (Member a : members) {
				if (a.getNickName().equals(inputNickName) && a.getPw().equals(inputPw)) {
					System.out.println(inputNickName + "님 게임 난이도/종류를 선택해주세요!");
					Log = true;
					break;
				}
			}

			if (Log == false) {
				System.out.println("로그인에 실패 하셨습니다.");
			}

		}

		PlusGame game = new PlusGame();

		System.out.println("[1]초급 [2]중급 [3]고급 [4]지옥");
		int difficult = sc.nextInt();

		System.out.println("[1]더하기 [2]빼기 [3]곱하기 [4]나누기");
		int operator = sc.nextInt();
		
		
		int count = 0;
		while (true) {
			System.out.println(game.getQuizMsg(difficult, operator)+" ");
			int ans = sc.nextInt();

			if (game.checkAnswer(ans)) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("틀렸습니다!");
				count++;
			}
		
			
			if(count > 4 ) {
				System.out.println();
				break;
			}
			
		
		}

	}

}
