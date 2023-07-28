                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               package exercice_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int i,somme = 0,n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int tab[]= new int[n+1];
		
		for (i=0; i<tab.length;i++)
		{
			somme = somme + tab[i];
		}
		System.out.println(" Somme des elements du tableau : "+ somme);
		
		sc.close();
	}

}
