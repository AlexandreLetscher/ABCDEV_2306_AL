package excercice_3poussin;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Variables
		 * n1 est un entier
		 * 
		 * debut du programme 
		 * 	ecrire "le nombre" 
		 *  <-- n1
		 *  
		 *  debut du si 
		 *  si n1=6 ou n1 == 7
		 *  alors 
		 *  ecrire "vous etes dans les poussins 
		 *  sinon si n1=8 ou n1=9
		 *  alors 
		 *  ecrire " vous etes dans les pupilles"
		 *  sinon si n1=10 ou n1=11
		 *  alors 
		 *  ecrire " vous etes dans les minimes"
		 *  sinon si n1<6
		 *  alors ecrire " il n'y a pas de section pour les moins de 6 ans "
		 *  
		 *  sinon
		 *  ecrire " vous etes dans les cadets 
		 *  
		 *  fin du programme
		 * 
		 * 	
		 */
		
		//Variables 
			int n1; //âge
			
			Scanner sc = new Scanner(System.in); // ouverture du scanner
			
			System.out.println(" Entrer l'age : ");
			n1 = sc.nextInt();
			
			
			
			 // Debut du si
			
			
			if ((n1 == 6) || (n1 == 7))
			{
				System.out.println(" Vous etes dans les poussins ");
			}
			else if ((n1 == 8) || (n1 == 9))
			{
				System.out.println(" Vous etes dans les pupilles ");
			}
			else if ((n1 == 10) || (n1 == 11))
			{
				System.out.println(" Vous etes dans les minimes ");
			}
			else if ((n1 < 6))
			{
				System.out.println(" Il n'y a pas de categorie pour les enfants de moins de 6 ans  ");
			}
			else
			{
				System.out.println(" Vous etes dans cadets ");
			}
			
			sc.close(); // fermeture du scanner
			
	}

}
