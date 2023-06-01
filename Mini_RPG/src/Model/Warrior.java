package Model;

public abstract class Warrior extends Character implements Defensible{

	public Warrior(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.println("전사 방어");
	}
	
	public void itemUes() {
		System.out.println("전사 아이템 사용");
	}
	
	
	public void itemUnUes() {
		System.out.println("전사 아이템 해제");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("전사 공격");
	}


	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("전사 정보");
	}

	
	
	
}
