package gameRPG;

public class Fight {
	public int turn;
	public Enemy[] enemies;
	
	public Fight(Enemy[] enemies) {
		this.turn = 0;
		this.enemies = enemies;
	}
	public static Boolean enemiesAlive(Enemy[] enemies) {
		boolean alive = false;
		for(int i = 0;i<enemies.length;i++) {
			alive = alive || (enemies[i].health > 0);
		}
		return alive;
	}
	public boolean doFight() {
		Player player = new Player(100,50);
		
		while ((player.health > 0) && (enemiesAlive(enemies))) {
			player.playerTurn(enemies);
			
			for (int i = 0;i<enemies.length;i++) {
				if (enemies[i].health > 0) {
				player.health = player.health - enemies[i].chooseAttack();
				}
			}
		}
		
		if (player.health > 0) {
			Story.print("You won!");
		}
		else {
			Story.print("You died!");
		}
		return (player.health > 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
