package exemple_Procedure;

import java.util.Scanner;

public class App {

	public static void disBonjour()
	{
		System.out.println("Bonjour !!!");
	}

	public static void disBonjourPrenom(String prenom)
	{
		System.out.println("Bonjour "+prenom);
	}

	public static void main(String[] args) {

		disBonjour();

		String saisie;
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir votre prenom :");
		saisie = sc.next();

		disBonjourPrenom(saisie);

		sc.close();

	}

}
