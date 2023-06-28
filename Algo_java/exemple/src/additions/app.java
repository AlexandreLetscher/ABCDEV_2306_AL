package additions;

import java.util.Scanner;

// Ceci est un commentaire sur une seule ligne

/*
 * ceci est un
 * commentaire
 * sur plusieurs ligne
 */

/*
 * variables 
nombre1 est un entier
nombre2 est un entier
resultat est un nombre réel 

début du programme
Ecrire "saire le premier nombre"
lire <-- nombre1
Ecrie "saisir le deuxieme nombre"
lire <-- nombre 2
Resultat <-- nombre 1 + nombre 2 /2
Ecrire " la moyenne du nombre1 et nombre2 est", resultat
fin du programme
 */

public class app {

	public static void main(String[] args) {
		// declaration des variables 
		int nombre1;
		int nombre2;
		int resultat;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Saisir le 1er nombre");
		nombre1 = sc.nextInt();
		System.out.println("Saisir le 2eme nombre");
		nombre2 = sc.nextInt();
		resultat = nombre1 + nombre2;
		
		System.out.println("Le resultat de l'addition de "+ nombre1 +" et "+ nombre2 + " est " + resultat);
		
		sc.close();
		
		
		
		
		
		
		

	}

}
