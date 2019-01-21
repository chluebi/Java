package gameRPG;

public class Abilities {
	public String[] names;
	public String[] desc;
	public int[] target;
	
	public Abilities() {
		this.names = new String[2];
		this.names[0] = "Hit";
		this.names[1] = "Heal";
		
		this.desc = new String[2];
		this.desc[0] = "Deal {0} damage to an enemy";
		this.desc[1] = "Heal yourself for 40 health";
		
		this.target = new int[2];
		this.target[0] = 1;
		this.target[1] = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void useAbility(int ability, int enemy) {
		
	}

}
