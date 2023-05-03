import java.util.Scanner;

public class Ex08배열실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		
		
		String[] input_id = {""};
		String[] input_pw = {""};
	
		
		
		int count = 0 ;
		while(true) {
			System.out.print("1.회원가입 2.로그인 3.종료\n");
			int number = sc.nextInt();
			if(number == 1) {
				if(count<id_array.length) {
				System.out.print("===회원가입===\n");
					System.out.print("id 입력 : ");
					id_array[count] = sc.next();
					System.out.print("pw 입력 : ");
					pw_array[count] = sc.next();
					System.out.print("가입성공\n");
					count++;
				}else {
					System.out.println("회원수가 가득찼어요");
				}
			}else if(number == 2) {
				System.out.print("===로그인===\n");
				System.out.print("id 입력 : ");
				String id = sc.next();
				System.out.print("pw 입력 : ");
				String pw = sc.next();
				
				
			}else if(number == 3) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
		}
		
		
	}

}
