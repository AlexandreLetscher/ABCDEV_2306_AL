package Exercice3_1_jeux_fourchette;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * L'ordinateur «choisit» aléatoirement un nombre mystère(entier compris entre 0 et 100). Le joueur essaie de le deviner. Lors de chaque essai, l'ordinateur affiche la «fourchette» dans
		 *  laquelle se trouve le nombre qu'il a choisi. Le choix du nombremystèresera simulé par génération d'un nombre aléatoire:
		 *  N <--RANDOM(0,100).Lorsque l'utilisateur a trouvé le nombre mystère, le programme affiche "Bravo vous avez trouvé en X essais".
		 * Variables
		 * 
		 */
		
		// Variables
		
		int min = 0;
		int max = 100;
		int nb;
		int nombreAleatoire;
		int essai;
		int entre;
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
	

		System.out.println(" entrez le nombre ");
		nb = sc.nextInt();
		
		
		
		

sc.close();
	}

}
