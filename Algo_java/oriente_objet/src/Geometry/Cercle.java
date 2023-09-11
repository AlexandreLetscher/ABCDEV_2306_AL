package Geometry;

public class Cercle 
{

	public double rayon;
	public Point centre;
		public Cercle (Point point, double r)
		
	{	
			this.centre =point;
			this.rayon = r;			
	}
		public double perimetre()
		
	{	
			double pi = Math.PI;
			return 2*pi*rayon;
	}
		public double surface()
		
	{
			double pi = Math.PI;
			return pi*rayon*rayon;
	}
	public void testAppartenance(Point q)
	
	{
			Double dx=q.abscisse-this.centre.abscisse;
			Double dy=q.ordonnee-this.centre.ordonnee;
			Double distance=Math.sqrt(dx*dx+dy*dy);
		if(distance<=this.rayon)
			{
				System.out.println("Le point choisi apprtient au cercle");		
			}
		else
			{
				System.out.println("Le point choisi n'apprtient pas au cercle");		
			}
	}
	
	public void afficherCercle()
	{
		System.out.println(" Le rayon du cercle est " + this.rayon);
		System.out.println(" Le centre du cercle eest le point ayant pour abscisse = "+ this.centre.abscisse + " ayant pour ordonnee " + this.centre.ordonnee);
	}
	


}
