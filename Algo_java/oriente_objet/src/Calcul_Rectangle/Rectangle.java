package Calcul_Rectangle;

public class Rectangle 
{

	public double longueur;
	public double largeur;
	public int numero;
	
	
	public Rectangle ( double  lon, double larg, int num)
	{
	this.longueur = lon;
	this.largeur = larg;
	this.numero = num;
	}

	
	public double surface()
	{
		return this.longueur*this.largeur;
	}
	
	
	public double perimetre()
	{
		return 2*(this.longueur + this.largeur);
	}
	
	
	public void afficher()
	{
		System.out.println(" la surface du rectangle "+this.numero+" est de :"+ this.surface() );
		System.out.println(" le perimetre du rectangle "+this.numero+" est de :" + this.perimetre()+"\n");
	}

}
