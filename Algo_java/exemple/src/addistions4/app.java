package addistions4;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Variables
    Rayon est reel
    Angle est un reel
    Aire est un reel
Constantes
    Pi est un reel 
Debut du programme
    Ecrire "Saisir le rayon"
    Lire <-- Rayon
    Ecrire "saisir l'angle"
    Lire <-- Angle
    Aire <-- (Pi*rayon^2*Angle)/360
    Ecrire "l'aire du secteur circulaire est ",Aire
Fin du programme
		 */
		
		
		// Variables
		
		double rayon;
		double angle;
		double aire;
		
		
		
		
		
		
		
		// Constante
		
		final double pi = Math.PI;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Saisir le rayon ");
		rayon = sc.nextDouble();
		
		System.out.println("Saisir l'Angle");
		angle = sc.nextDouble();
		
		
		// L'aire du secteur circulaire
		
		aire = pi*Math.pow(rayon,2)*angle/360;
		aire = Math.round(aire*100.0) /100.0;
		System.out.println(" l'aire de la secteur circulaire est de " + aire);
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
