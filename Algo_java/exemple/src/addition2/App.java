package addition2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * variables 
nombre1 est un entier
nombre2 est un entier
resultat est un nombre réel 

début du programme
Ecrire "saisir le premier nombre"
lire <-- nombre1
Ecrie "saisir le deuxieme nombre"/*
lire <-- nombre 2
Resultat <-- nombre 1 + nombre 2 /2
Ecrire " la moyenne du nombre1 et nombre2 est", resultat
fin du programme
		 */
	//	declaration des variables
		
		double nombre1;
		double nombre2;
		double resultat;
		
		Scanner sc;
		sc = new Scanner(System.in); // Création d'un nouveau scanner
		
		System.out.println("premier nombre"); // Ce qui va apparaitre dans la commande
		nombre1 = sc.nextDouble(); // Nombre que je vais taper
		System.out.println("deuxieme nombre");// ce qui va apparaitre dans la commande
		nombre2 = sc.nextDouble(); // nombre que je vais taper
		resultat = (nombre1 + nombre2)/2;
		resultat = Math.round(nombre1 + nombre2*100.0) /100.0;
		
		System.out.println("la moyenne de " + nombre1 + " et " + nombre2 + " vaut " + resultat);
		
		sc.close();// fermeture du scanner
		
		
		
		
	}

}
