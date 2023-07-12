package excercice2_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 /*
		  *  
    
 			Variables 
				annee est un entier

			Debut du programme
    			Ecrire " Saisir l'annee 
    			Lire <-- a 

    		Debut du si 
        		si 
            		a / 4 et non par 100 ou / 400
            		Ecrire "est une annee bissextille"

   	 			Sinon 
           	 		Ecrire " n'est pas une annee bissextille"

Fin du programme
		  */
		
		
		//Variable 
			int a;
		
			Scanner sc = new Scanner(System.in); // ouverture du scanner
		
			System.out.println(" Saisir l'annee : ");
			a = sc.nextInt();
		
	
		// Calcul
		// Debut Si
		
			if ((( a% 4 == 0) && ( a%100 != 0)) || ( a%400 == 0)) 
			{
				System.out.println( "est une a anne bissextille ");
			}
			else 
			{
				System.out.println(" n'et pas pas une annee bissextille ");
			}
		
			sc.close(); // fermeture du scanner 

	}

}