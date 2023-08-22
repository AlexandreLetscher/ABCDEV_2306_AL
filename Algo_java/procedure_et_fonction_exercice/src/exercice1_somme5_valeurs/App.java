package exercice1_somme5_valeurs;

import java.util.Scanner;

public class App {

	
		// TODO Auto-generated method stub
	/*
	 Fonction entier somme (entier a, entier b, entier c, entier d, entier e)
	 
	 	resultat est un entier 
	 	resultat <-- a+b+c+d+e
	 	return resultat	
	 	
	 Fin de fonction
	 
	 Variables 
	 
	 	nombre 1 est un entier 
	 	nombre 2 est un entier 
	 	nombre 3 est un entier 
	 	nombre 4 est un entier 
	 	nombre 5 est un entier
	 	addittion est un entier
	 	
	 Debut du programme 
	 
	 	ecrire " saisir le premier nombre "
	 	Lire <-- nombre 1
	 	ecrire " saisir nombre 2"
	 	Lire <-- nombre 2
	 	ecrire " saisir nombre 3"
	 	lire <-- nombre 3
	 	ecrire " saisir nombre 4"
	 	lire <-- nombre 4
	 	ecrire " Saisir nombre 5"
	 	lire <-- nombre 5
	 
	 	addition <-- somme(nombre1, nombre2, nombre3, nombre4, nombre5)
	 	Ecrire " le resultat de l'addition des 5 nombre est ", addition
	 	
	 	Fin du programme 
	 */

		
		public static int somme (int a, int b, int c, int d, int e)
		{
			int resultat;
			resultat = (a+b+c+d+e);
			return resultat;
		}
		public static void main(String[] args) 
		{
			// Variables :
			
			int nombre1, nombre2, nombre3, nombre4, nombre5, addition;
			
			Scanner sc = new Scanner(System.in); // ouverture du Scanner 
			
			
				 System.out.println("Saisir le 1er nombre : ");
				 nombre1 = sc.nextInt();
				 System.out.println("Saisir le 2eme nombre : ");
				 nombre2 = sc.nextInt();
				 System.out.println("Saisir le 3eme nombre : ");
				 nombre3 = sc.nextInt();
				 System.out.println("Saisir le 4eme nombre :");
				 nombre4 = sc.nextInt();
				 System.out.println("Saisir le 5eme nombre : ");
				 nombre5 = sc.nextInt();
				 
			
			System.out.println("Le resultat de l'addition des 5 nombres est : " + somme(nombre1,nombre2,nombre3,nombre4,nombre5));
		
			sc.close();	// fermeture du Scanner		 
			
	
	}

}
