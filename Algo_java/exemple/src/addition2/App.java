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
		double nombre3;
		double nombre4;
		double resultat;
		
		Scanner sc;
		sc = new Scanner(System.in); // Création d'un nouveau scanner
		
		System.out.println("Saisir le premier nombre"); // Ce qui va apparaitre dans la commande
		nombre1 = sc.nextDouble(); // Nombre que je vais taper
		System.out.println("Saisir le deuxieme nombre");// ce qui va apparaitre dans la commande
		nombre2 = sc.nextDouble(); // nombre que je vais taper
		System.out.println("Saisir le Troisieme nombre");
		nombre3 =sc.nextDouble();
		System.out.println("Saisir le Quatrieme nombre");
		nombre4 = sc.nextDouble();
		
		resultat = (nombre1 + nombre2 + nombre3 + nombre4)/2;
		resultat = Math.round(resultat*100.0) /100.0;
		
		
		System.out.println("la moyenne est de " + resultat);
		
		sc.close();// fermeture du scanner
		
		
		
		
	}

}
