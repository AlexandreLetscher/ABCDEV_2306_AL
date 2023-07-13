package exercice5_reprographie;

import java.util.Scanner;

public class App {
	
	
	/*
	 * Enoncé du probleme.
	 * 
	 * Un magasin de reprographie facture 0,10 € les dix premières photocopies, 0,09 € les vingt suivantes et 0,08 
€ au-delà. Ecrivez un algorithme qui demande à l’utilisateur le nombre de photocopies effectuées et qui 
affiche la facture correspondante.
	 */
	
	/*
	 * PSEUDO CODE
	 * 
	 * Variables 
	 * 
	 * 		n1 est un entier 
	 * 		prix est un reel
	 * 
	 * debut du programme 
	 * 		si 	n1<= a 10
	 * 			alors 	(10*0,10)
	 * 		sinon si  	n1 <= 30
	 * 			alors 	(20*0,09) + (n1 -10) *0,10
	 * 		sinon  n1 >30
	 * 			alors prix =(10*0,01) + (20*0,9) + (n1-30)* 0;08
	 * 
	 * fin du programme
	 */

	public static void main(String[] args) {
		

		
		//Variables
		
		int n1;
		double prix;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Saisir le nombre de photocopie : ");
		n1 = sc.nextInt();
		if (n1<=10)
		{
			prix =   (10*0.10);
		}
		else if (n1 <= 30)
		{
			prix = (20*0.09) + (n1 -10)*0.10;
		}
		else 
		{
			prix = (10*0.1) + (20*0.9) + (n1-30)*0.08;
		}
		
		System.out.println("Le prix totale est de  " + prix + " euros. " );
		sc.close();
	}

}
