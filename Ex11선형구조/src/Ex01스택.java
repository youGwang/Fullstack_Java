import java.util.Stack;

public class Ex01스택 {

	public static void main(String[] args) {

		//1. 스택 생성
		Stack<String> st = new Stack<String>();
		
		//2. 요소 삽입 (push)
		st.push("Hello");
		st.push("Hi");
		st.push("java");
		
		//3. 가장 마지막에 들어간 요소 확인(top에서 제일 가까운 요소)
		System.out.println(st.peek());
		
		//4. 특정 요소의 위치 확인
		System.out.println(st.search("Hello"));//3
		System.out.println(st.search("Hi"));  //2
		System.out.println(st.search("java")); //1
		
		//5. 요소 삭제 pop
		String e = st.pop();
		System.out.println(e); //마지막에 있는 자바가 반환
		
		//6. Stack이 비어있느지 확인
		// empty -> 비어있으면 true, 요소가 하나라도 있으면 -> false
		System.out.println(st.empty());
		
		
		/*
		스택의 활용
		1) 웹 브라우저 뒤로가기(방문기록)
		2)ctrl+z(이전 상태로 돌아가기) : 가장 나중에 수정한 내역부터 되돌림
		3) 역순 문자열 만들기 : 맨 끝의 문자열부터 차례대로 다룸
		4) 후위 표기법 계산
		5) 재귀적 알고리즘
		*/
		
		
	}

}
