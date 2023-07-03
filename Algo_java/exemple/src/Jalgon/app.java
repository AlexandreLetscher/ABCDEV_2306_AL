package Jalgon;

import java.util.Scanner;



public class app {


	public static void main(String[] args) { 
		
		
		// information du contact 
	String prenom;
	String nom;
	int dept;
	String mail1;
	String mail2;
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println(" Saisir votre prénom : ");
	prenom = sc.nextLine();
	System.out.println("Saisir votre nom");
	nom = sc.nextLine();
	System.out.println("Saisir votre departement");
	dept = sc.nextInt();
	mail1 = prenom + "." +nom + dept + "@arfp.asso.fr";
	mail2 = nom + ".²" + dept + prenom + "@arfp.asso.fr";
	
	System.out.println("Mail1 : " + mail1 + "et Mail2 : " + mail2);
	
	
	sc.close();
	
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}


