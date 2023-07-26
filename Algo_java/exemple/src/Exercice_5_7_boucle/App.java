package Exercice_5_7_boucle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
int i = 0,n = 1,nombre = 1,position = 1;
		 
		
		Scanner sc = new Scanner(System.in);
		
		while (n!=0)
		{
			System.out.println("entrez un nombre et mettre un 0 pour finir le programme  ");
			n=sc.nextInt();
			i = i+1;
			
			
			if (i == 1 || n > nombre)
			{
				nombre = n;
				position = i;
			}	
		}
		System.out.println("fin du programme ");
		System.out.println( "le plus grand nombre est " + nombre+" et il a ete inserer en position " + position);
		
		sc.close();

	}

}
