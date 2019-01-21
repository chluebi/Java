
package gameRPG;

public class Enemy {
	public int health;
	public int maxhealth;
	public int attack;
	public String type;
	
	public Enemy(String type, int health, int attack) {
		this.type = type;
		this.health = health;
		this.maxhealth = health;
		this.attack = attack;
		System.out.println("Enemy: Type " + type + " " + attack + "/" + health);
	}
	public static void main(String[] args) {
		
	}
	public void takeDmg(int damage) {
		health = health - damage;
	}
	public Integer chooseAttack() {
		int damage;
		damage = 0;
		switch (type) {
			case "Goblin":
				damage = this.Strike();
				break;
			case "Mage":
				switch (Randnum(0,1)) {
					case 0:
						damage = this.Strike();
						break;
					case 1:
						damage = this.Heal();
						break;
				}
				break;
		}
		int damage2 = 0;
		return damage;
	}
	public Integer Randnum(int Min,int Max) {
		return Min + (int)(Math.random() * ((Max - Min) + 1));
	}
	private Integer Strike() {
		Story.print(this.type + " used Strike for " + attack + " damage.");
		return (int) attack;
	}
	private Integer Heal() {
		Story.print(this.type + " used Heal to heal for 30 health.");
		this.health = Math.min(this.health + 30,this.maxhealth);
		return 0;
	}
}
