package exercice2_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		/*
		 * Variables 
    a est un entier 
    b est un entier 
    
Debut du programme
    Ecrire " Saisir le nombre a"
    Lire <-- a
    Ecrire " Saisir le nombre b"
    Lire <-- b

Debut Si
    Si 
        a==b
        Ecrire "a=b"
    Sinon si 
        a<b
        Ecrire a "<" b
    Sinon 
        a>b
        Ecrire b "<" a

 Fin du programme
		 */

		// Variables
		
		int a;
		int b;
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Saisir le nombre a");
		 a = sc.nextInt();
		 System.out.println("Saisir le nombre b");
		 b =  sc.nextInt();
		 
		 // calcul 
		 
		 if(a == b) {
			 System.out.println(a + "=" + b);
		 }
		 else if(a < b) {
			 System.out.println(a + "<" + b);
		 }
		 else {
			 System.out.println(b + "<" + a ); 
		 }
		  
		 sc.close();
	}

}
