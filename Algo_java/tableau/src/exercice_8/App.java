package exercice_8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int n=-1,i,nmax = 0,position;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" entrer une valeur : ");
		n = sc.nextInt();
		
		
		int [] tab1 = new int [n];
		int [] tab2 =new int [n];
		
		
		
		
		
		for (i=0; i<n; i++)
		{
			System.out.println(" entrer un nombre : "+i+1);
			tab1[i] = sc.nextInt();
			for (i=1;i<nmax;i++)
			{
				nmax=i;
			}
			
			if (tab1[i]>tab2[nmax])
			{
				nmax=i;
			}
			
			System.out.println(" element le plus grand est " +tab2[nmax]);
			System.out.println(" Position de cette element "+ nmax);
		}

		
		sc.close();
		
	}

}
