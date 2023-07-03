package Additions5;
import java.util.Scanner;

public class app {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Variable
    Somme est un reel 
    Interet est un reel 
    Annees est un entier
    Isimple est un reel 
    Icomposer est un reel 
Debut du programme
    Ecrire "Saisir la somme"
    Ecrire "saisir l'Interet"
    Ecrire "Saisir l'Interet
    Lire <-- interet 
    Ecrire " Saisir le nombre d'annees"
    Lire <-- Annees 
    Isimple <-- Somme *(1+ Annees* Interet)
    Icomposer <-- somme *(1+Interet)
    Ecrire "l'interet simple ", Tsimple" et l'interet composer est ",Tcomposer
Fin du programme



*/
// Variables 
		
		double somme;
		double interet;
		int annees;
		double isimpl;
		double icomp;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisir la somme");
		somme = sc.nextDouble();
		System.out.println("Saisir l'interet");
		interet = sc.nextDouble();
		System.out.println("Saisir le nombre d'annees");
		annees = sc.nextInt();
		
		// Calcul interet 
		
		isimpl = somme*(1+annees*interet/100);
		icomp = somme*Math.pow(1+(interet/100),annees);
		icomp = Math.round(icomp*100.0) /100.0;
		
		System.out.println("L'interet simple vaut " + isimpl + " L'interet compose vaut " + icomp);
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	
	}

}
