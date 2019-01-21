package gameRPG;

import java.text.MessageFormat;

public class Player {
	public int health;
	public int maxhealth;
	public int attack;
	public int[] abilities;
	
	public Player(int health, int attack) {
		this.health = health;
		this.maxhealth = health;
		this.attack = attack;
		this.abilities = new int[10];
		
		for (int i = 0;i < abilities.length;i++) {
			abilities[i] = -1;
		}
		abilities[0] = 0;
		abilities[1] = 1;
	}
	public Enemy[] playerTurn(Enemy[] enemies) {
		this.printStats();
		Story.print("Your options:");
		Abilities abi = new Abilities();
		
		int i = 0;
		while (abilities[i] >= 0) {
			i++;
		}
		String[] abiinfo = new String[i];
		for (int j = 0;j < abiinfo.length;j++) {
			abiinfo[j] = abi.names[abilities[j]] + ": " + MessageFormat.format(abi.desc[abilities[j]], attack);
		}
		int abchoice = Game.printOptions(abiinfo) - 1;
		
		int enchoice;
		if (abi.target[abchoice] == 1) {
			String[] eninfo = new String[enemies.length];
			for (int j = 0;j < eninfo.length;j++) {
				eninfo[j] = enemies[j].type + " (";
				eninfo[j] = eninfo[j] + + enemies[j].health + "/" + Integer.valueOf(enemies[j].attack) + ")";
			}
			enchoice = Game.printOptions(eninfo) - 1;
		}
		else {
			enchoice = -1;
		}
		Enemy[] doneEnemies = enemies;
		String printer;
		switch (abchoice) {
			case 0:
				doneEnemies[enchoice].health = doneEnemies[enchoice].health - attack;
				printer = "Player used " + abi.names[abchoice] + " on " + doneEnemies[enchoice].type;
				printer = printer + "[" + (enchoice + 1) + "]" + " for " + attack + " damage";
				Story.print("------------------------------------------------------");
				Story.print(printer);
				Story.print("------------------------------------------------------");
				break;
			case 1:
				health = Math.min(health + 40,maxhealth);
				printer = "Player used " + abi.names[abchoice] + " to heal for 40 health";
				Story.print("------------------------------------------------------");
				Story.print(printer);
				Story.print("------------------------------------------------------");
				break;
			default:
				health = health + 40;
		}
		return doneEnemies;
		
	}
	public void printStats() {
		Story.print("------------------------------------------------------");
		Story.print("Player: " + health + " health || " + attack + " attack");
		Story.print("------------------------------------------------------");
	}
}
