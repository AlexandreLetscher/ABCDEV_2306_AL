package exercice_8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int n=-1,i,nmax = 0  ,position =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" entrer une valeur : ");
		n = sc.nextInt();
		
		
		int [] tab1 = new int [n];
		
		for (i=0; i<n; i++)
		{
			System.out.println(" entrer un nombre : ");
			tab1[i] = sc.nextInt();
			
			for (i=0;i<n-1;i++)
			{
			if (nmax < tab1[i]);
			}
			nmax =tab1[i];
			i = position;
			position++;
		}
		
			
			System.out.println(" La valeur la plus grande est "+ nmax + " et il est en position " + position );
			
			sc.close();
		}

		
		
		
	}



