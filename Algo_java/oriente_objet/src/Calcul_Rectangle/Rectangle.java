package Calcul_Rectangle;

public class Rectangle 
{

	public double longueur;
	public double largeur;
	
	
	public Rectangle ( double  lon, double larg)
	{
	this.longueur = lon;
	this.largeur = larg;
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
		System.out.println(" la surface du rectangle est de :"+ this.surface());
		System.out.println(" le perimetre du rectangle est de :" + this.perimetre());
	}

}
