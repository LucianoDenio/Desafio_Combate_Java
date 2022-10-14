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
		System.out.println("Vida inicial: ");
		int lifeInitial = sc.nextInt();
		System.out.print("Ataque: ");
		int atk = sc.nextInt();
		System.out.print("Defesa: ");
		int def = sc.nextInt();
		
		firstHero = new Champion(heroName, lifeInitial, atk, def);
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		heroName = sc.nextLine();
		System.out.println("Vida inicial: ");
		lifeInitial = sc.nextInt();
		System.out.print("Ataque: ");
		atk = sc.nextInt();
		System.out.print("Defesa: ");
		def = sc.nextInt();
		
		secondHero = new Champion(heroName, lifeInitial, atk, def);
		
		
		sc.close();

	}

}
