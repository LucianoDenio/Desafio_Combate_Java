package aplication;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}


	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}


	public int getAttack() {
		return attack;
	}


	public int getArmor() {
		return armor;
	}


	
	
	
	
}
