package fonction_enoncé3_moyenne;

import java.util.Scanner;

public class App 
{

	
		// TODO Auto-generated method stub
		
		/*
		 FONCTION reel calcul (reel a, reel b)
		 	moyenne est un reel 
		 	moyenne <-- (a+b)/2
		 	retourne moyenne 
		 fin fonction
		 
		 Variables 
		  	nombre1 est un reel 
		  	nombre 2 est un reel 
		  	
		 Debut du programme 
		  	ecrire " Saisir un nombre "
		  	lire nombre 1
		  	ecrire "Saisir nombre 2"
		  	lire nombre 2
		  	
		  	Ecrire " la moyenne des 2 nombre est ", moyenne (nombre1,nombre2)
		 Fin du programme
		 */
	
	public static double calculMoyenne(double a, double b) 
	{
		
	double moyenne;
	moyenne = (a+b)/2;
	return moyenne;
	}
		
	public static void main(String[] args)
	{
		
		double nombre1, nombre2;
		
		Scanner sc = new Scanner(System.in);
				
				System.out.println("Saisir le premier nombre ");
				nombre1 = sc.nextInt();
				System.out.println("Saisir le deuxiemme nombre ");
				nombre2 = sc.nextInt();
				
		System.out.println(" La moyenne des 2 nombre est " + calculMoyenne(nombre1,nombre2));
				
		
		

	}

	}
