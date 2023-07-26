package exercice_5_3_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		
		/*
		 * 	Variables
		 * n est un entier 
		 * i est un entier
		 * i <-- 1
		 * 	Debut du programme
		 * 
		 * 
		 * 
		 */
		
		//Variables
		int n;
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ecrire un nombre");
		n = sc.nextInt();
		i =1;
		
		System.out.println("Les 10 nombres suivants sont : ");
		
		while (i<=10)
		{	
			System.out.println( n + i );
			i = i + 1;	
		}
		 
		 
		 
		 sc.close();
	}

}
