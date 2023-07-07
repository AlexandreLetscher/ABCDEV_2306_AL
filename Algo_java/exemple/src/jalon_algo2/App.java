package jalon_algo2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Variables
		
	String etudiant;
	boolean etude;
	String jour;
	boolean queljour;
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Etes vous etudiant \nOui= O  \tNon=N  ");
	etudiant = sc.next();
	
	if(etudiant.equals("O")||etudiant.equals ("o"))
	{
		etude = true;
	}
	else
	{
		etude = false;
	}
	
	System.out.println(" Quel jour est il \njeudi = Jeudi \tmercredi= Mercredi ");
	jour = sc.next();
	
	if(jour.equals("jeudi")  || jour.equals("mercredi") )
	{
		queljour = true;
	}
	
	else
	{
		queljour = false;
	}
	
	if (etude && queljour == true) 
	{
			System.out.println(" vous avez le droit a une reduction le jeudi de 20% et de 50% le mercredi");
	}
	
	else
		System.out.println(" Vous n'avez le droit a aucun reduction ");
	
	
	
	
	 sc.close();
	 
	

	}

}
