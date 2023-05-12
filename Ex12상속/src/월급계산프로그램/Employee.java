package 월급계산프로그램;

public abstract class Employee {
	
	protected String empno;
	protected String name;
	protected int pay;
	
	// protected(접근제한자) : 상속관계에 있는 클래스들은 접근이 가능하도록 도와주는 접근제한자
	//                  ----> 상속관계가 아닌 클래스는 접근이 불가능하도록 하는 제한자
	
	
	// 생정자 : 매개변수가 있는
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	
	// 기능
	// getMoneyPay, 리턴타입 같다
	// return하고있는 결과값이 다르다 ---> {body}가 다르다.
	public abstract int getMoneyPay();
	// print, 리턴타입, {}도 같다
	public String print() {
		return empno + " : " +name+" : "+pay;
	}
	// 상속관계에서 부모클래스가 생성자를 가지고 있으면
	// 자식클래스에 super();가 있어야한다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Regular(정규직), PartTime(알바), Temp(비정규직)
	// 클래스가 가지고 있는 공통적인 필드/기능(메서드) 작성
	
	
	// 그리고 상속 시켜주자!
	// ---> Main을 실행했을 때 문제가 없으면 성공!
	
	// 생성자는 그대로 두고 ---> 생성자도 상속시켜주고싶으면?
	// 참고 : super(); <--- 부모 클래스의 생성자를 지칭
	// 캡슐화 x
	 
	
}
