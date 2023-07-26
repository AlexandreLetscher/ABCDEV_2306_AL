package Exercice_5_3_boucle_for;

import java.util.Scanner;

public class App {
	
	
	/*
	 * 
	 */

	public static void main(String[] args) {
		// Variables
		
		int n,i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Ecrire un nombre : ");
		n= sc.nextInt();
		
		System.out.println("Les 10 nombres suivants sont : ");
		
		for ( i = 1; i<=10; i++) // boucle for = pour
		{
			n = n + 1;
			System.out.print( n + " "); // pour que tout soit a la ligne 
		}
sc.close();
	}

}
