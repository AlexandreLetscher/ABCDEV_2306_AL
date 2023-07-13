package exercice_6_Zorglub_impot;

import java.util.Scanner;



public class App {
	/* 
	 * Enonce du probleme:
	 * 
	 * Les habitants de Zorglub paient l’impôt selon les règles suivantes :
• les hommes de plus de 20 ans paient l’impôt
• les femmes paient l’impôt si elles ont entre 18 et 35 ans
• les autres ne paient pas d’impôt
Le programme demandera donc l’âge et le sexe du Zorglubien, et se prononcera donc ensuite sur le fait 
que l’habitant est imposable
	 */
	
	/* 
	 * VARIABLES :
	 * 		sex est une chaine de caractere 
	 * 		age est un entier 
	 * 		
	 * 
	 * debut du programme 
	 * 
	 * Entrer le sex (M/F)
	 * lire <-- sex 
	 * entrer age 
	 * lire <-- age 
	 * 
	 * debut de si 
	 * 	si
	 * 		sex = M et age >20
	 * 		ecrire " vous etes imposable" 
	 * 	sinon si 
	 * 		sex = F et ( age >18 et age <35)
	 * 		ecrire "vous etes   imposable"
	 * 	sinon 
	 * 		ecrire "vous n'etes pas imposable"
	 * 
	 * fin du si 
	 * fin du programme
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		String sex;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Saisire le sex : f ou F = feminin et M ou m = masculin  ");
		sex = sc.next();
		System.out.println(" Saisir l'age :");
		age = sc.nextInt();
		
		
		if ((sex.equals("M") || sex.equals("m")) && age >20)
		{
			
				System.out.println(" Vous etes imposable");
			
		}
		else if ((sex.equals("F")|| sex.equals("f")) &&  age >18  &&  age <35)
		{
			
				System.out.println(" Vous etes imposable ");
			
		}
		else 
		{
				System.out.println(" Vous n'etes pas imposable ");
		}
		
		sc.close();
	}

	
	}


