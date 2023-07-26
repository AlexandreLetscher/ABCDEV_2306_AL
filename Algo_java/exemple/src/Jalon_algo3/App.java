package Jalon_algo3;

import java.util.Scanner;

public class App {

	

	public static void main(String[] args) {
		
		/*
		  Variables 
		  n, i, r est un entier 
		   ecrire " saisire un nombre entre 1 et 10"
		   lire n 
		    
		   pour i=0,i<=10,i++
		   ecrire 
		   
		 */

		// variables
		int n,i,resultat;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" saisir un nombre entre 1 et 10 : ");
		n = sc.nextInt();
		
		for (i=0;i<=10;i++)
		{
			resultat = i * n;
			System.out.println(  i + " x " + n + " = "+ resultat);
			
		
		}
		
		
		sc.close();
	}

}
