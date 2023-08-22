package exercice_1_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * 		declaration des varaiables 
		 			rayon est un entier 
		 			aire est un double 
		 			volume est un entier 
		 		declaration d'une constante 
		 			pi est un reel
		 			
		 			debut du programme 
		 		 
		 		 ecrire "saisir le rayon "
		 		 	lire <-- rayon 
		 		 
		 		 calcul 
		 			aire = 4*pi*rayon^2
		 			volume = 4/3*pi*rayon^3
		 		 
		 		 ercire "le resultat de l'aire est ", aire 
		 		 
		 		 ecrire "le resultat du volume est ", volume
		 		 
		 		  fin du programme 
		 
		 */
		
		
		
		
		//declaration des variables 
	 double rayon, aire, volume;
	 
	// declaration des constantes 
	 
	 final double pi = Math.PI;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println(" Saisir le rayon : ");
	 rayon = sc.nextDouble();
	 
	 // calcul
	 
	 aire = 4*pi*Math.pow(rayon,2);
	aire = Math.round(aire*100.0)/100.0;
	 
	volume = 4/3d*pi*Math.pow(rayon,3);
	 volume = Math.round(volume*100.0)/100.0;
	 
	 System.out.println("l'aire est de : " + aire + " et le volume est de : " + volume);
	 
	 
	 sc.close();
	 
	}

}
