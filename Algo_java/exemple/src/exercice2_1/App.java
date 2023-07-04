package exercice2_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner (System.in);
		
	// Saisir l'age
		System.out.println("Saisir l'age");
		age = sc.nextInt();
		
		if(age <1)
		{
			System.out.println("Vous n'etes pas encore nee");
		}
		else if(age  <18)
		{
			System.out.println("Vous etes  mineur");
		}
		else
		{
			System.out.println("Vous etes majeur");
		}
		
		sc.close();
		
	}
	
}

		



