package additions3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Variables
rayon est un reel 
aire est un reel 
volume est un reel

Constantes
Pi est un reel

Debut du programme 
Ecrire "saisir le rayon"
lire <-- rayon
aire <--4*pi*rayon*2
volume <-- 4/3*pi rayon^3
Ecrire "L'aire de la sphere est ",aire, " le volume de la sphere", volume
fin du programme  
 */
		// Declaration des variables 
		
		double rayon, volume, aire;

		final double pi = Math.PI; // declaration d'une constante

Scanner sc = new Scanner (System.in);



	System.out.println("Saisir le rayon");
	rayon = sc.nextDouble();

	// calcul de l'aire
	aire = 4*pi*Math.pow(rayon,2);
	aire = Math.round(aire*100.0) /100.0;

	System.out.println(" l'aire de la sphere est de  " + aire);
	
	
	 
	// calcul du volume
	
	

	volume = 4/3d*pi*Math.pow(rayon, 3);
	volume = Math.round(aire*100.0) /100.0;
	

	System.out.println(" le volume de la sphere est de  " + volume);


	sc.close();















	
	} 
	

}
