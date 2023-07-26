package Exercice_5_4boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * n,i,s sont des entier
		 * 
		 * 	debut du programme 
		 * Ecrire "entrez un nombre"
		 * lire n 
		 * s = 0
		 * pour i=1; i<=n 
		 * s= s+i
		 * fin du pour 
		 * ecrire 
		 * 
		 */

		
		//Variables
		int n,i,s = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre un nombre : ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			s = s+i;
					
		}
	
		System.out.println( "le resultat est " + s);
		sc.close();
	
	
	}
}
