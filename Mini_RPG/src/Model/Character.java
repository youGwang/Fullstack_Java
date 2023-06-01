package Model;

public abstract class Character extends Creature {

	public Character(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}
	
	
	public abstract void itemUse();
	public abstract void itemUnUse();


	public void itemUse(ItemVO item) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
