package exerci_4_annee_bissextille;

import java.util.Scanner;

public class App {
	
	public static boolean annee (int a) 
	{
		
	
	boolean  bissextille;
	
		if ((( a% 4 == 0) && ( a%100 != 0)) || ( a%400 == 0)) {
		bissextille =  true;
		}
		
		else	
		{
			bissextille = false;
		}
		return bissextille;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.println("         Saisir l'annee ");
		a = sc.nextInt();
		
		if (annee(a)) {
			System.out.println("          L'annee "+ a + " est bissextille");
			
		}
		else {
			System.out.println("             L'annee "+a+" n'est pas bissextille");
		}
		
		sc.close();

	}

}
