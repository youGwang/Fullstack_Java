package Model;

public class Archer extends Character {
	
	private BowVO equippedItem;
	public Archer(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void itemUse(ItemVO item) {
		// TODO Auto-generated method stub
		System.out.println("아처 아이템 사용");
		// A instanceof B => A객체가 B 클래스에 속하면 true, 아니면 false.
		if(item instanceof BowVO) {
			this.equipped
		}
	}

	@Override
	public void itemUnUse() {
		// TODO Auto-generated method stub
		System.out.println("아처 아이템 해제");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("아처 공격");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("아처 정보");
	}

	@Override
	public void itemUse() {
		// TODO Auto-generated method stub
		
	}

}