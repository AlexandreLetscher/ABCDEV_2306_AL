package exercice_bouteille;

public class bouteille {
	
	// attributs
	private final double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String nom;
	
	// constructeur par defaut
	
	public bouteille()
	{
		nom = " ";
		contenanceEnL = 0.9;
		capaciteEnL = 1;
		estOuverte = true;
	}

	
	public bouteille(String _nom, double _constanceEnL, double _capaciteEnL, boolean _estOuverte)
	{
		this.nom = _nom;
		this.contenanceEnL = _constanceEnL;
		this.capaciteEnL =_capaciteEnL;
		this.estOuverte = _estOuverte;
	}
	public boolean ouvrir()
	{
		if(!this.estOuverte)
		{
			this.estOuverte =true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean fermer()
	{
		if(this.estOuverte)
		{
			this.estOuverte = false;
			return  true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean viderTout()
	{
		if(this.estOuverte)
		{
			if(this.contenanceEnL > 0)
			{
				this.contenanceEnL = 0;
				return true;
			}
			else
			{
				return false;
			}
		}
		return estOuverte;
	}
		
	 public boolean remplirtout()
	{
		if(this.estOuverte)
		{
			this.contenanceEnL = this.capaciteEnL;
			return true;
		}
	 else
	 {
		 return false;
	 }
	}	
		public boolean vider(double quantite)
		{
			if(this.estOuverte)
			{
				if(quantite > 0)
				{
					if(this.contenanceEnL - quantite >= 0)
					{
						this.contenanceEnL = this.contenanceEnL - quantite;
						return true;
					}
					else
					{
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}


		
		
		public boolean remplir (double quantite)
		{
			{
				if( this.estOuverte)
				{
					if(quantite >= 0)
					{
						if(this.contenanceEnL+quantite <=1.5) {
							return true;
						}
						else 
						{
							return false;
						}
					}
						else 
						{
							return false;
						}
			}
		}
			return estOuverte;
		
		
			
		
		
		
	
	 
	
}
}

