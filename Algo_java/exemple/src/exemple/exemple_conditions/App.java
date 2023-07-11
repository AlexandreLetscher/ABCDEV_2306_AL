package exemple.exemple_conditions;

import java.util.Scanner;

/*
 * VARIABLES
 * 
 * 		nombre1 est un entier
 * 
 * Debut du pregramme
 * 
 * 		Ecrire "Saisir un nombre entier"
 * 		Lire <-- nombre1
 * 
 * Debut Si
 * 
 * 		Si
 * 			nombre1 est egal a 20
 * 
 * 		Alors 
 * 			Ecrire "le nombre est egal a 20
 * 
 * 		Sinon si 
 * 			nombre est egal a 15
 * 
 * 		Alors
 * 			Ecrire "Le nombre est egal à 15"
 * 
 * 		Sinon 
 * 			Ecrire "Le nombre n'est pas egale a 20 et n'est pas egal a 15"
 * 
 * 		Fin Si 
 * 
 * 		Fin du programme
 * 
 */


public class App {

	public static void main(String[] args) {
		

		int nombre1;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entier : ");
		nombre1 = sc.nextInt();
		
		if(nombre1 == 20)
		{
			System.out.println("Le nombre saisi est egale a 20");
		}
		else if(nombre1 == 15)
		{
			System.out.println("Le nombre saisi est egale a 15");
		}
		else
		{
			System.out.println("Le nombre saisi est ni egale a 20 et ni egale à 15");
		}
		
		sc.close();
		
	}
	
}
