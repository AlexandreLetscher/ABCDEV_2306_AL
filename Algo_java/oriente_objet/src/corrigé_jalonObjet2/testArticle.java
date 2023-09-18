package corrigé_jalonObjet2;

import java.util.Scanner;

public class testArticle {

	public static void main(String[] args) 
	{
		
			Scanner sc = new Scanner(System.in);
			
			Article Article1 = new Article();
			Article Article2 = new Article("1236","Ps5",450.65);
			Article Article3 = new Article("369fgfg","samsung",1536);
			
				double tauxTVA;
			
			System.out.println("Saisir le taux de TVA ");
			tauxTVA = sc.nextDouble();
				if (tauxTVA>100)
				{
					
					System.out.println("Ressasisez les pourcentages de 0 à 100 % !!!!!");
					tauxTVA=sc.nextDouble();
					
				}
				
			
			Article.setTauxTVA(tauxTVA);
			
			System.out.print("\n"+Article1.afficherArticle()+"\n\n");
			System.out.print(Article2.afficherArticle()+"\n\n");
			System.out.print(Article3.afficherArticle()+"\n\n");
			
			
	}

}

	
