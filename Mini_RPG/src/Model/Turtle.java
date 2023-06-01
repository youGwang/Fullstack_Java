package Model;

public class Turtle extends Monster implements Defensible{

	public Turtle(int hp, int op, int dp) {
		super(dp, dp, dp);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.println("거북이 방어");
	}


	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("거북이 공격");
	}


	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("거북이 정보");
	}

}
