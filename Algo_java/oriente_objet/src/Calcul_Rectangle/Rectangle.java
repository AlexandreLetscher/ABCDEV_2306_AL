package Calcul_Rectangle;

public class Rectangle 
{

	public double longueur;
	public double largeur;
	public int numero;
	
	
	public Rectangle ( double  _lon, double _larg, int _num)
	{
	this.longueur = _lon;
	this.largeur = _larg;
	this.numero = _num;
	}

	
	public double surface()
	{
		return this.longueur*this.largeur;
	}
	
	
	public double perimetre()
	{
		return 2*(this.longueur*this.largeur);
	}
	
	
	public void afficher()
	{
		System.out.println(" La surface du rectangle "+this.numero+" est de : "+ Math.round(this.surface()*100.0)/100.0 );
		
		System.out.println(" Le perimetre du rectangle "+this.numero+" est de : " + Math.round(this.perimetre()*100.0)/100.0+"\n");
	}

}
