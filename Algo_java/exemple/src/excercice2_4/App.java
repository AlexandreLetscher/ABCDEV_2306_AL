package excercice2_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 /*
		  * 
		  */
//Variable 
		int a;
		
		Scanner sc = new Scanner(System.in); // ouverture du scanner
		
		System.out.println(" Saisir l'annee : ");
		a = sc.nextInt();
		
	
	// Calcul
		
	if ((a % 4 == 0 && a != 100) || a % 400 == 0) {
		System.out.println( "est une a anne bissextille ");
	}
	else {
		System.out.println(" n'et pas pas une annee bissextille ");
	}
		
		sc.close();

	}

}
