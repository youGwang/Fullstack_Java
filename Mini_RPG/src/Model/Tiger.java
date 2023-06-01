package Model;

public class Tiger extends Monster{

	public Tiger(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("호랑이 공격");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("호랑이 정보");
	}

}
