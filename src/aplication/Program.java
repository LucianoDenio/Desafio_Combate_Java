package aplication;

import java.util.Locale;
import java.util.Scanner;


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
		
		secondHero = new Champion(heroName, lifeInitial, atk, def);
		
		System.out.println("Quantos turnos você Deseja executar ?");
		int turn = sc.nextInt();
		
		for(int i = 0; i < turn && (firstHero.getLife() > 0 && secondHero.getLife() > 0) ; i++ ) {
			firstHero.takeDamage(secondHero);
			secondHero.takeDamage(firstHero);
			
			System.out.println("Resultado do turno " + i);
			System.out.println(firstHero.status(firstHero)); 
			System.out.println(secondHero.status(secondHero));
			
			System.out.println("Resultado do turno " + i);
			firstHero.status(firstHero);
			secondHero.status(secondHero);
		}
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
