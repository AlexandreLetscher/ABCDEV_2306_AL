package exercice4_heure;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

		 

		// Variables
		
		int h;
		int m;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir l'heure : ");
		h = sc.nextInt();
		
		System.out.println(" Saisir les minutes : ");
		m = sc.nextInt();
		m = m + 1;
		
		if (m == 60)
		{
			m = 00;
			h = h +1;
		}
		if   (h == 24)
		{
			h = 00;
		}
			System.out.println(" Dans une minute il sera " + h + " heure et" + m + " minute ");
		
		
			
			
		sc.close();
	

}
}
