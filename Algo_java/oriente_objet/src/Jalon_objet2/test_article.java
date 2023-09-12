package Jalon_objet2;

public class test_article {

	

	public static void main(String[] args) {
		
		Article monarticle1 = new Article("PS503210","Gaming",440,19.6,0 );
		Article monArticle2 = new Article("321SAM25","elecromenager", 700,19.6,0);
		Article articleTest = new Article();
		
			double test1 = monarticle1.calculprixTTC();
			monarticle1.AfficherArticle();
		
			double test2 = monArticle2.calculprixTTC();
			monArticle2.AfficherArticle();
			
			double test3 = articleTest.calculprixTTC();
			articleTest.AfficherArticle();
		

	}

}
