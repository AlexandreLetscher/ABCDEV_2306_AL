package jalon_algo2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//Variables
		
	String etudiant;
	boolean etude;
	String jour;
	boolean queljour;
	int reduction;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Etes vous etudiant \nOui= O  \tNon=N  ");
	etudiant = sc.nextLine();
	
	if(etude.equals("O")   
	{
		etude = true;
	}
	else
	{
		etude = false;
	}
	
	System.out.println(" Quel jour est il \njeudi = J \tmercredi= M ");
	jour = sc.nextLine();
	
	if(queljour.equals(" J ")  &&  queljour.equals("M") )
	{
		queljour = true;
	}
	else
	{
		queljour = false;
	}
	
	if etude == true && queljour == true 
			System.out.println(" vous avez le droit a une reduction jeudi de 20% et de 50% le mercredi")
	
	
	
	
	 
	

	}

}
