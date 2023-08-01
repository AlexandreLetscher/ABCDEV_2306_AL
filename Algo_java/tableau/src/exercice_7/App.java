package exercice_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int n,i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" entre le nombre de valeur que vous voulez ");
		n = sc.nextInt();
		
		
		
		int [] tab2 = new int [n];
		int[] tab = new int [n];
		for (i=0;i<n;i++)
		{
			System.out.println(" entrer un nombre ");
			tab[i]=sc.nextInt();
		}
		
		for (i=0;i< tab2.length;i++)
		{
			tab2[i]= tab[i]+1;
			
			
			System.out.print(tab2[i] + "  " );
		}
		
		System.out.println(" le resultat est ");

	sc.close();
	}
}


