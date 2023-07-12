package exercice2_1;

import java.util.Scanner;

/*
 * 		VARIABLES

		age est un entier 

Debut du programme 
    			"ecrire votre age"
    			Lire <-- age 
		Debut Si 
    	Si
   			a <1

		Alors
    		Ecrire " vous etes pas encore nee"
		Sinon si 
    		a<18
		Alors
    		ecrire "vous etes mineur"

		Sinon 
    		Ecrire "vous etes majeur"

		Fin si 

fin du programme 

 */

public class App {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner (System.in);
		
	// Saisir l'age
		System.out.println("Saisir l'age");
		age = sc.nextInt();
		
		if(age <1)
		{
			System.out.println("Vous n'etes pas encore nee");
		}
		else if(age  <18)
		{
			System.out.println("Vous etes  mineur");
		}
		else if (age >99 )
		{
			System.out.println("Vous etes  mort ");
		}
		else
		{
			System.out.println("Vous etes majeur");
		}
		
		sc.close();
		
	}
	
}

		



