package enoncé_2_perimetre;

import java.util.Scanner;

public class App {

	
		/* 
		 FONCTION reel calcul ( reel a, reel b, reel c)
		 	periemetre est un reel ((p/2-a)(p/2-b)(p/2-c))1/2​
		 	retourne perimetre
		 
		 VARIABLES 
		 	a est un reel 
		 	b est un reel 
		 	c est un reel
		 
		 DEBUT du programme 
		 	ecrire "Saisire le coté a 
		 	lire a 
		 	ecrire "Saire le coté b "
		 	lire b 
		 	ecrire " saisir le coté c "
		 	lire c 
		 
		 	ecrire " le perimetre du triangle est",periemetre (a+b+c)
		 
		 Fin du programme 
		 */
		
	public static void calculperimetre( double a, double b, double c)
	{
		Scanner sc = new Scanner(System.in);
		double perimetre;
		perimetre = (a+b+c);
		double aire;
		aire =Math.pow(((perimetre/2-a)*(perimetre/2-b)*(perimetre/2-c)),1/2);
		System.out.println("le perimtre est : " +perimetre+ " l'aire du triangle " + aire);
	}
	

		public static void main(String[] args) 
		{
			double a,b,c;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" Saisir le coté a");
			a = sc.nextDouble();
			System.out.println(" Saisir le coté b ");
			b = sc.nextDouble();
			System.out.println(" Saisir le coté c");
			c = sc.nextDouble();
			
			
			 calculperimetre(a,b,c);
		
			
		
			sc.close();
	}

}
