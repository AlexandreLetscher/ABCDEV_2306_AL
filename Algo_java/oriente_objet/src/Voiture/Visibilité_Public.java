package Voiture;

public class Visibilité_Public {
	
	private String marque;
	private double prix;
	
	public Visibilité_Public()
	{
		this.marque = " renault";
		this.prix = 0;
	}
	
// Creation des setters
	
	public void steMarque(String marque)
	{
		this.marque = marque;
	}
	
	public void setPrix( double Prix)
	{
		this.prix = Prix;
	}
	
	
	// Creation des getters
	
	public String getMarque()
	{
		return marque;
	}
	
	public double getPrix()
	{
		return prix;
	}
	
	public void afficher()
	{
		System.out.println(" La marque de la voiture est :" + this.marque);
		System.out.println(" Le prix de la voiture est de  : " + this.prix + " Euros"+" \n");
	}

	
		
	}

