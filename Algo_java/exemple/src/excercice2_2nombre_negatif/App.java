package excercice2_2nombre_negatif;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		/*
		 *  Variables 
        n est un reel
    
    Debut du programme 


        Ecrire " Saisir le nombre"
        Ecrire <-- n

            Debut du si 
                si n>0
                ecrire " ce nombre est positif 
                sinon ecrire "ce nombre est negatif"

                si n=0
                ecrire "ce nombre est positif"

            fin du si 
    
    fin du programe

		 */
		
		//Variables 
		
			double n;
		
			Scanner sc = new Scanner(System.in);
		
			System.out.println(" Saisir le nombre ");
			n = sc.nextDouble();
		
		// Debut du si 
		
			if (n > 0)
			{
				System.out.println( n + " est positif ");
			}
			else if (n<0)
			{
				System.out.println( n + " est negatif");
			}
			else
			{
				System.out.println(" ce nombre est egal a 0 ");
			}
			
			sc.close();
			

	}

}
