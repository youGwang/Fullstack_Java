package 월급계산프로그램;

public class TempEmployee extends Employee{
	//월급 계산 프로그램 만들기
	/*
	String empno; //사번
	String name; //이름
	int pay; //연봉
	*/
	
	// 생성자
	public TempEmployee(String empno,String name, int pay) {
		super(empno,name,pay);
	}

	@Override
	public int getMoneyPay() {
		return pay/12;
	}

	
	/*
	// getMoneyPay(리턴타입 : int) ---월급
	public int getMoneyPay() {
		return pay/12;
	}
	
	// print (리턴타입 : String)
	public String print() {
		return empno+" : "+name+" : "+pay;
	}
	*/
}
