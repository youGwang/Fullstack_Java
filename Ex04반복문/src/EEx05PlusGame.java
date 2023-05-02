import java.util.Random;
import java.util.Scanner;

public class EEx05PlusGame {

	public static void main(String[] args) {
		  // 1. 랜덤, 입력하는 도구 가져오기
	      Random rd = new Random();
	      Scanner sc = new Scanner(System.in);
	      // 2. 출력문 ---> 한번만
	      System.out.println("===PLUS GAME===");
	      
	      // 틀린 횟수 저장하는 변수
	      int cnt = 0;
	      
	      while(true) {
	      
	      // 3. 랜덤한 숫자 2개를 가져온다
	      int num1 = rd.nextInt(50)+1;
	      int num2 = rd.nextInt(50)+1;
	      // 출력 4 + 8 = 
	      System.out.print(num1+"+"+num2+"=");
	      // 답을 입력받는다
	      int answer = sc.nextInt();
	      // 입력한 답 == 실제답 ---> s/f
	      if(answer == (num1+num2)) {
	    	  System.out.print("success");
	      }else {
	    	  cnt++;
	    	  if(cnt > 2) {
		    	  break;
		      }
	    	  // 틀렸다 ---> 틀린획수 +1
	    	  System.out.println("fail");
	    	  System.out.print("계속 하시겠습니까? >>");
	    	  String answer2 = sc.next();
	    	  if(answer2.equals("N")) {
	    		  break;
	    	  }
	      
	      }
	      // s ---> while문 처음으로 돌아간다
	      // f ---> 사용자한테 계속 할껀지 물어본다 
	      //       틀린 횟수도 +1
	      //      사용자가 N/Y를 입력한다
	      //       Y : while문 처음으로 돌아간다
	      //      N : break;
	      
	      // 사용자가 틀린 횟수가 3번 이상이 되면 break;
	      
	      }
	}

}
