package excercice2_1positif_negatif;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		/*
		 * Variables 
    			n est un entier 
			Debut du programme
    			Ecrir "Saisir un nombre"
    			lire <-- n

    		Debut du si 
        		si
            n > 0
            Ecrire " Ce nombre est positif"

        sinon 
            ecrire " Ce nombre est negatif"
    fin du si 

fin du programme 
		 */
		
		 // Debut du programme
		
			// Variables
		
	
		double n;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		// Debut du si 
		
		System.out.println(" Saisir le nombre ");
		n = sc.nextDouble();
		
		//Debut du si 
		
			if (n > 0)
			{
				System.out.println( n + " est un nombre positif ");
			}
			else 
			{
				System.out.println( n + " est un nombre est negatif");
			}
			
		sc.close();
		

	}

}
