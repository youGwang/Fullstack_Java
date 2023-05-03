import java.util.Scanner;

public class Ex07배열실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arrStr = {1,4,3,2,1}; //실제답
		int[] arr = new int[5]; //사용자가 입력한 답 저장
		
		System.out.print("==채점하기==\n");
		System.out.print("답을 입력하세요\n");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1 + "번답 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("정답확인\n");
		
		int sum = 0; //총점 저장
		//입력한 답과 실제답 이 같으면 O 출력, 다르면 X출력
		for(int i=0;i<arrStr.length;i++) {
			if(arrStr[i] == arr[i]){//같을 경우
				System.out.print("O ");
				sum = sum + 20;
			}else {//다를경우
				System.out.print("X ");
			}
		}
		System.out.print("총 점 : "+sum);
	
	}

}
