package excercice2_3nombre_negatif;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 * Variables 
    n1 est entier
    n2 est un entier

debut du programme
    Ecrire " le nombre 
    <-- n1
    ecrire "le deuxieme nombre"
    <-- n2

Debut du si 
    si n1, n2 > 0
    ecrire " le nombre1 est positif
    sinon 
    Ecrire " le nombre est negatif "

fin du si 

fin du programme 
		 */
		
		//Variables
		
		int n1;
		int n2;
		
		Scanner sc = new Scanner(System.in);
		
		
		// Debut du programme
			System.out.println(" Saisir le premier nombre ");
			n1 = sc.nextInt();
			
			System.out.println(" Saisir le deuxieme nombre ");
			n2 = sc.nextInt();
			
		//Debut du si 
			
			if ((n1 > 0) && (n2 > 0))
			{
				System.out.println(" ce nombre est positif ");
			}
			else if ((n1 > 0)&& (n2 < 0))
			{
				System.out.println(" ce nombre est negatif");
			}
			else if ((n1<0) && (n2>0))
			{
				System.out.println(" ce nombre est negatif");
			}
			else 
			{
				System.out.println(" ce nombre est positif ");
			}

			sc.close();
	}

}
