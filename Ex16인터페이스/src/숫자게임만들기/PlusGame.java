package 숫자게임만들기;

import java.util.Random;

public class PlusGame implements OperatorGame{
	Random rd = new Random();
	private int answer;
	private int operator;

	@Override
	public int random(int difficult) {
		  // 랜덤한 수를 하나 생성해서 리턴
		  int num;
	      
	      if(difficult == 1) {
	         num = rd.nextInt(10)+1;
	      }else if(difficult == 2) {
	         num = rd.nextInt(100)+1;
	      }else if(difficult == 3) {
	         num = rd.nextInt(1000)+1;
	      }else {
	         num = rd.nextInt(10000)+1;
	      }
	      return num;
	}

	@Override
	public String getQuizMsg(int difficult, int operator) {
		  // 랜덤한 숫자 두개를 출력해서 문자열로 돌려주는 기능
	      int num1 = random(difficult);
	      int num2 = random(difficult);
	     
	      String quiz;
	      
	      if(operator == 1) {
	         answer = num1 + num2;
	         quiz = num1 + " + " + num2 + " = ";
	         return quiz;
	      }else if(operator == 2) {
	         answer = num1 - num2;
	         quiz = num1 + " - " + num2 + " = ";
	         return quiz;
	      }else if(operator == 3) {
	         answer = num1 * num2;
	         quiz = num1 + " * " + num2 + " = ";
	         return quiz;
	      }else if(operator == 4) {
	         answer = num1 / num2;
	         quiz = num1 + " / " + num2 + " = ";
	         return quiz;
	      }else {
	         quiz = "올바른 숫자를 입력하세요";
	         return quiz;
	      }

	}

	@Override
	public boolean checkAnswer(int ans) {
	      if(ans == answer) {
	         return true;
	      }else {
	         return false;
	      }
	}


	   
	
	
	
}
