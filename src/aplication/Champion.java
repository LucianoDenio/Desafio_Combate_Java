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
	
	public void champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		if(this.armor < attack) {
			this.life -= (attack - this.armor);
		}
		else this.life -= 1;	
	}
	
	
	
	
}
