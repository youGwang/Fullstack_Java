import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.print("JAVA 점수 입력: ");
		double java = sc.nextDouble();
		System.out.print("WEB 점수 입력: ");
		double web = sc.nextDouble();
		System.out.print("ANDROID 점수 입력: ");
		double android = sc.nextDouble();
		System.out.println("합계 : "+(java+web+android));
		double result = (java + web + android)/3;
		String resultS = String.format("%.2f",result);
		System.out.print("평균 : "+resultS);
		
		printf 사용법 : System.out.printf("평균 : %.2f",(java+web+android)/3.0)
		
		*/ 
		
		 

		Scanner scanner = new Scanner(System.in);
        System.out.print("초를 입력하세요:");
        int time = scanner.nextInt();
        
        int si = time/(60*60);
        int bun = time/60-(si*60);
        int c = time%60;
        System.out.println(si + "시간, " + bun + "분, " + c + "초입니다.");
        scanner.close();
		 
		
        
        
	}

}
