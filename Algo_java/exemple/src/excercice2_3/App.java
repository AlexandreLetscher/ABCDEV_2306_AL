package excercice2_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 * a est un reel
b est un reel
c est un reel
Debut du programme
    Ecrire "Saisir le nombre a"
    Lire <-- a
     Ecrire " Saisir le nombre b"
    Lire <-- b
      Ecrire " Saisir le nombre c"
    Debut Si
        Si 
            a<b et b<c
            Ecrire a"<"b"<"c 
       
        Sinon si
            a<c et c<b
            Ecrire a"<"c"b
        Sinon si
            b<a et a<c
            b"<"a"<"c
        sinon si 
            b<c et c<a
            b"<"c"<"a
        sinon si 
            c<a et a<b
            c"<"a"<"b
        sinon 
            c<b et b<a
            c"<"b"<"a
Fin du programme
		 */

		// Variables

	double a;
	double b;
	double c;

	Scanner sc = new Scanner(System.in);

		System.out.println("Saisir le premier nombre : ");
		a= sc.nextDouble();
		System.out.println("Saisir le deuxieme nombre : ");
		b = sc.nextDouble();
		System.out.println("Saisir le troisieme nombre : ");
		c = sc.nextDouble();


	// calcul 

		if (a <= b && b <= c) 
		{
		System.out.println(a + "  " + b + "  " + c );
		}
		else if (a <= c && c <= b)
		{
			System.out.println(a + "  " + c + "  " + b );
		}

		else if (b <= c && c <= a)
		{
				System.out.println(b + "  " + c + "  " + a );
		}	

		else if (b <= a && a <= c )
		{
			System.out.println(b + " "+ a + "  " + c );
		}
		else if (c <= a && a <= b )
		{
			System.out.println(c + "  " + a + "  " + b );

		}

		else
		{
		System.out.println(c + "  " + b + "  " + a );	
		}

		sc.close();

	}

}
