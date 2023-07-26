package Exercice_3_2_Barnabe_course;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 *Enonce :
		 *
		 *
		 * Barnabé fait ses courses dans plusieurs magasins.
Dans chacun, il dépense 1 € de plus que la moitié de ce qu’il possédait en entrant. 
Dans le dernier magasin, il dépense le solde.
Barnabé dépense au moins 1 € dans chaque magasin.
Soit S un nombre entier représentant la somme dont il disposait au départ (S > 1 euro). 
Représenter l’algorithme permettant de trouver le nombre de magasins dans lesquels il a acheté.

		 */

		
		
		int s,magasin = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Saissisez la somme Que Barnabe a :");
		s = sc.nextInt();
		
		if (s >=1)
		{
			while (s>0)
			{
				if (s-(s/2+1)>=0)
					s-=(s/2)+1;
				else 
				{
					
					s=0;
					
				}
				magasin ++;
			}
		}
		
		System.out.println(" Barnabe est alle dans " + magasin +" magasin");
		sc.close();
	}

}
