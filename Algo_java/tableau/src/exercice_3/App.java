package exercice_3;

import java.util.Scanner;

/*
 * 
 */



public class App {

	public static void main(String[] args) {
		int positif=0,negatif=0,n,i,nb;
	
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Entrer un nombre de valeur ");
		n = sc.nextInt();
		
		
		int tab[] = new int [n];
		for(i=0; i<n; i++)
		{
			System.out.println(" Entrer un nombre " + (i+1) + " :");
			tab[i]=sc.nextInt();
			if (tab[i]>=0)
			{
				positif++;
			}
			else
			{ 
				negatif++;
			}
		}
		
		System.out.println(" nombre de valeurs positives : " + positif);
		System.out.println(" nombre de valeur negatives : " + negatif);
			
		sc.close();

	}

}
