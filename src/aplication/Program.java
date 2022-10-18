package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Champion;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Champion firstHero, secondHero;
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String heroName = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeInitial = sc.nextInt();
		System.out.print("Ataque: ");
		int atk = sc.nextInt();
		System.out.print("Armadura: ");
		int def = sc.nextInt();
		System.out.println();
		
		firstHero = new Champion(heroName, lifeInitial, atk, def);
		
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		heroName = sc.nextLine();
		System.out.print("Vida inicial: ");
		lifeInitial = sc.nextInt();
		System.out.print("Ataque: ");
		atk = sc.nextInt();
		System.out.print("Armadura: ");
		def = sc.nextInt();
		System.out.println();
		
		secondHero = new Champion(heroName, lifeInitial, atk, def);
		

		System.out.print("Quantos turnos você Deseja executar ?");
		int turn = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i < turn+1 && (firstHero.getLife() > 0 && secondHero.getLife() > 0) ; i++ ) {
			firstHero.takeDamage(secondHero);
			secondHero.takeDamage(firstHero);
			
			System.out.println("Resultado do turno " + i);
			System.out.println(firstHero.status()); 
			System.out.println(secondHero.status());
			System.out.println();
			
		}
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
