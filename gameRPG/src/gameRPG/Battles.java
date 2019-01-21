package gameRPG;

public class Battles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean win;
		Fight fight0 = new Fight(battle0());
		win = fight0.doFight();
		if (win) {
			Fight fight1 = new Fight(battle1());
			fight1.doFight();
		}
	}
	public static Enemy[] battle0() {
		Enemy[] enemies = new Enemy[3];
		enemies[0] = new Enemy("Goblin",100,10);
		enemies[1] = new Enemy("Mage",200,15);
		enemies[2] = new Enemy("Goblin",100,10);
		return enemies;
	}
	public static Enemy[] battle1() {
		Enemy[] enemies = new Enemy[5];
		enemies[0] = new Enemy("Mage",60,5);
		enemies[1] = new Enemy("Mage",60,5);
		enemies[2] = new Enemy("Mage",60,5);
		enemies[3] = new Enemy("Mage",60,5);
		enemies[4] = new Enemy("Mage",60,5);
		return enemies;
	}

}
