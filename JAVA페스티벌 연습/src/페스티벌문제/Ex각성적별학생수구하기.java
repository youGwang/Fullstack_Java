package 페스티벌문제;

public class Ex각성적별학생수구하기 {

	public static void main(String[] args) {
		String s = "A,A,B,C,D,A,C,D,D,D,F";
		// 문제와 같이 문자열 s 하나 만들어주기
		// "A,A,B,C,D,A,C,D,D,D,F"
		
		// 문자열을 쪼개는 메서드 : split() 
		
		// 쪼개진 문자열이 담길 배열을 하나 만들어주기 : 크기를 정해줘도 되고
		// split한 문자열을 바로 배열에 초기화시키는 것도 가능
		String[] arr = s.split(",");
		// 각 성적별 학생 수가 저장될 공간을 만들어 주기(변수)
		//System.out.println(arr[0]);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		// 0번인덱스 : A,B,C,D,F? 판단 성적별 학생수 변수에 +1을 누적!
		// ...
		// 10번 인덱스 :  A,B,C,D,F? 판단 성적별 학생수 변수에 +1을 누적!
		
		
		for(int i=0;i<arr.length;i++) {
				if(arr[i].equals("A")) {
				a++;
			}else if(arr[i].equals("B")) {
				b++;
			}else if(arr[i].equals("C")) {
				c++;
			}else if(arr[i].equals("D")) {
				d++;
			}else{
				f++;
			}
		
		}
		
		
		
		//결과값 출력하기
		System.out.println("A : "+a+"명");
		System.out.println("B : "+b+"명");
		System.out.println("C : "+c+"명");
		System.out.println("D : "+d+"명");
		System.out.println("F : "+f+"명");
	}

}
