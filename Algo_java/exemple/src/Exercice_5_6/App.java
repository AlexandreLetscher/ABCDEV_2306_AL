package Exercice_5_6;

import java.util.Scanner;


/*
 n,i,nombre sont des entiers 
 
 debut du programme 
 pour i=1, i<=20,i++
 ecrire " entrez un nombre "
 lire n
 si i =1 ou n> nombre alors
 ecrire " le plus grand nombre est", nombre, " ila ete inserer en position", position
 fin du si 
 fin du programme
 */




public class App {

	
	public static void main(String[] args) {
		
		int i,n,nombre = 0,position = 0;
		 
		
		Scanner sc = new Scanner(System.in);
		
		for (i=1;i<=20;i++)
		{
			System.out.println("entrez un nombre ");
			n=sc.nextInt();
			
			if (i == 1 || n > nombre)
			{
				nombre = n;
				position = i;
			}
			
			
		}
		
		
		
		System.out.println( "le plus grand  nombre est " +nombre+" et il a ete inserer en position  " + position);
		sc.close();
	}

}
