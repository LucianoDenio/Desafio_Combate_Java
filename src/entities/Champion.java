package entities;

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

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public void takeDamage(Champion other) {
	    if (this.armor >= other.attack) {
	        this.life = Math.max(0, this.life - 1);
	    } else {
	        this.life = Math.max(0, this.life - (other.attack - this.armor));
	    }
	}

	
	public String toString() {
	    if (life > 0) {
	        return name + ": " + String.format("%d de vida%n", life);
	    } else {
	        return name + ": 0 de vida (morreu)";
	    }
	}


}
