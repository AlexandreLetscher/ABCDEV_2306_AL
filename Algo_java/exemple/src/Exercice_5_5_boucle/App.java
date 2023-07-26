package Exercice_5_5_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int n,i,f=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Nombre de depart : ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			f = f*i;
					
		}
	
		System.out.println( "le resultat est " + f);
		
		
		sc.close();
		
		
	}
}
