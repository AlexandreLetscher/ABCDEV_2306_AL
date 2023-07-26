package Exercice_2_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables 
		 a et b est un entier
	Debut du programme
		 
		 Ecrire "saisir un nombre "
		 lire <-- a
		 Ecrire " saisir un nombre "
		 fffffgffffgfglire <-- b
		 
		 debut de si
		 
		 	si a = b 
		 	ecrire a "=" b
		 	sinon si a > b
		 	ecrire a">"b
		 	sinon a<b
		 	ecrire a "<"b
		 
		 fin de si
	fin du programme 
		  
		 */

		//variables 
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre ");
		a = sc.nextInt();
		System.out.println(" saisir un nombre");
		b = sc.nextInt();
		
		if (a==b)
		{
			System.out.println(a +" est egal à "+ b);
		}
		else if (a>b)
		{
			System.out.println(a+" est plus grand que "+b);
		}
		else
		{
			System.out.println(a + " est plus petit que "+ b);
		}
		
		sc.close();
		
	}

}
