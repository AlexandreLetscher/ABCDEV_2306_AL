package corrigé_jalonObjet2;

public class Article 
{

	// les attributs 
	
	private String reference;
	private String designation;
	private double prixHT;
	private static double tauxTVA;
	
	// the constructor by default
	
	public Article()
	{
		this.reference = "inconnu";
		this .designation = "inconnu";
		this.prixHT = 0;
	}
	
	
	// the constructor with parameter
	
	public Article (String _reference, String _designation, double _prixHT)
	{
		this.reference = _reference;
		this.designation = _designation;
		this.prixHT = _prixHT;
	}
	
	//*******Getter******
	
	public String getreference()
	{
		return this.reference;
	}
	
	public String getdesignation()
	{
		return this.designation;
	}
	public double getprixHT()
	{
		return this.prixHT;
	}
	private double getTauxTVA()
	{
		return tauxTVA;
	}
	
	
	//********Setters******
	
	
	public void setReference(String _reference)
	{
		this.reference = _reference;
	}
	public void setdesignation (String _designation)
	{
		this.designation = _designation;
	}
	public void setPrixHT(double _prixHT)
	{
		this.prixHT = _prixHT;
	}
	public static void setTauxTVA(double _tauxTVA)
	{
		tauxTVA = _tauxTVA;
		
	}
	public double calculerPrixTTC()
	{
		return prixHT + (this.prixHT*tauxTVA/100);
	}
	public String afficherArticle()
	{
		return "Reference : "+this.getreference()
						+"\nDesignation : "+this.getdesignation()
						+"\nPrix HT : "+this.getprixHT()+ " euros"
						+"\nTaux TVA : "+ this.getTauxTVA()+ " % "
						+"\nPrix TTC : "+ Math.round(this.calculerPrixTTC()*100.00)/100.00 + " euros ";
						
	}
	
	
}
	
	
	
	
