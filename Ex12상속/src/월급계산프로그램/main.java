package 월급계산프로그램;



public class main {

	public static void main(String[] args) {
		
		// RegularEmployee 사용하기
		RegularEmployee regular = new RegularEmployee("SMHRD001","홍길동",4000,400);
		
		System.out.println(regular.getMoneyPay());
		System.out.println(regular.print());
		
		
		// TempEmployee 사용하기
		TempEmployee temp = new TempEmployee("SMHRD002","박문수",3000);
		
		System.out.println(temp.getMoneyPay());
		System.out.println(temp.print());
		
		
		// PartTimeEmployee 사용하기
		PartTimeEmployee part = new PartTimeEmployee("SMHRD001","홍길동",10,10);
		
		System.out.println(part.getMoneyPay());
		System.out.println(part.print());
		
		
		
	}

}
