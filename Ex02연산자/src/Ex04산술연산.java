import java.util.Scanner;

public class Ex04산술연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        /* System.out.print("초를 입력하세요:");
        int time = sc.nextInt();
        
        int si = time/(60*60);
        int bun = time/60-(si*60);
        int c = time%60;
        System.out.println(si + "시간, " + bun + "분, " + c + "초입니다.");
        sc.close();
        */
		
		//선생님 방법으로 시분초 구하기
		int input = sc.nextInt(); //초 입력
		//3723초 -> 1시(3600초) 2분(60초) 3초
		
		
		int hour = input/3600;
		int min = input%3600/60;
		int sec = input%60;
		System.out.println(hour + "시간, " + min + "분, " + sec + "초입니다.");
		
	}

}
