package exercice_5_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		//variables
		int n=0;
		
		Scanner sc = new Scanner(System.in);
		
		
			 
			 while (n<10 || n>20)
		{
			System.out.println(" Entrez un nombre entre 10 et 20 : ");
			 n = sc.nextInt();
		
			 if (n<10)
			 {
				 System.out.println("plus grand que " + n);
			 }
			 else if (n>20) 
			 {
				 System.out.println("plus petit que " + n);
			 }
			 else
			 {
				 System.out.println(n + " est entre 10 et 20 ");
			 }
		}
			 
			 
			 sc.close();
	}

}
