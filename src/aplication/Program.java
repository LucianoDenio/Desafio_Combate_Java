package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Attack: ");
		int attack = sc.nextInt();
		System.out.print("Armor: ");
		int armor = sc.nextInt();
		sc.nextLine();
		
		Champion champion1 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Attack: ");
		attack = sc.nextInt();
		System.out.print("Armor: ");
		armor = sc.nextInt();
		
		Champion champion2 = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.print("Quantos turnos vão ser: ");
		int turn = sc.nextInt();
		
		for (int i=0;i<turn;i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			
			System.out.println("Resultado do turno "+(i+1));
			System.out.print(champion1);
			System.out.println(champion2);
			
			if((champion1.getLife() <= 0) || champion2.getLife() <=0) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
