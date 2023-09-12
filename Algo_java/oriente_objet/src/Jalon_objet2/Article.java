package Jalon_objet2;

public class Article 
{
	public String reference;
	public String designation;
	double prixHT;
	double  tauxTVA;
	double resultat;
	double prixTTC;
	
	
		public Article ( String ref, String design, double pHT, double TVA, double TTC)
		{
			this.reference = ref;
			this.designation = design;
			this.prixHT = pHT;
			this.tauxTVA = TVA;	
			this.prixTTC = TTC;
		}
	
	// Constructor par default
		
	public Article() 
		{
			this.reference = "alex";
			this.designation = "Abcdev";
			this.prixHT = 550;
			this.tauxTVA = 10;
			this.prixTTC = 0;
		}

		public double calculprixTTC()
		{
			return this.prixTTC =  this.prixHT+(this.prixHT*this.tauxTVA/100);
		}
	
		public void AfficherArticle()
		{
		System.out.println("L'article avec comme reference : " + this.reference + " son prix TTC est de : " + this.prixTTC + "euros"+ "\n");
		}

}
