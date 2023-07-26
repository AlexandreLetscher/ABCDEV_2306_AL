package Exercice_5_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.
		 * 
		 * 
		 * PSEUDO CODE 
		 * 
		 * 	variables
		 * 		n=0 est un entier 
		 * 
		 * 		debut du programme 
		 *  		tant que n<1 ou n>3
		 *  		ecrire " entrer un nombre entre 1 et 3"
		 *  			si n>1 ou n<3
		 *  			ecrire " vous avez trouvé bravo "
		 *  		fin tant que 
		 * 				 fi si 
		 * 		 fi du programme 
		 * 
		 */
		
		
		
		
		
		
		//Variables
		int n=0;
		
		
		 Scanner sc = new Scanner(System.in); // ouverture du scanner
		 
		 
		 
		 while (n<1 || n>3)
		 {
			 System.out.println(" Entrez un nombre entre 1 et 3 : ");
			 n = sc.nextInt(); 
		 }
		 if (n<1 || n>3)
		 {
			 System.out.println(" vous avez trouve BRAVO");
		 }
		
		 
		 sc.close();
		 
	}

}
