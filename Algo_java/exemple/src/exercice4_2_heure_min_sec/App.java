package exercice4_2_heure_min_sec;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		
		
		
		//Variables 
		int h;
		int m;
		int s;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Saire l'heure : ");
		h = sc.nextInt();
		System.out.println(" Saisir les minutes : ");
		m = sc.nextInt();
		System.out.println(" Saisir les secondes : ");
		s = sc.nextInt();
		s = s + 1;
		
		// debut du si 
		if (s == 60)
		{
			s=0;
			m=m+1;
		}
		if (m == 60)
		{
			m=0;
			h=h+1;
		}
		if (h == 24)
		{
			h=0;
		}
		 System.out.println("Dans une seconde il sera " + h + " heures " + m + " minutes et " + s + " secondes ");
		 
		 sc.close();
			 
	}

}
