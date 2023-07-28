package Exercice_fibonacci;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		
		// declaration des variables
		int position=2,nb; 
		long nbprecedent=0,nbcourant=1,nbsuivant;
	String resultat ="\t0\n\t1";
	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de nombres a la suite de Fibonacci souhaitez-vous affiché :");
		nb=sc.nextInt();
		
		if(nb >2)
		{
			while (position< nb)
			{
				nbsuivant = nbprecedent + nbcourant;
				resultat = resultat+"\n\t" + nbsuivant;
				nbprecedent = nbcourant;
				nbcourant = nbsuivant;
				position = position +1;	
			}
		}
		else 
		{
			nb=2;
		}
		
		System.out.print("les "+nb+" premiers nombre de la suite de Fibonacci sont : \n" + resultat + " \n "+"\t" + nb +" nombres affiches");
		
		
			
		
		sc.close();
	}

}
