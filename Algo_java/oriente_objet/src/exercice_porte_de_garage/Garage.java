package exercice_porte_de_garage;

public class Garage {
private String marque = " ";
private boolean estOuverte;
private boolean estVerouiller;
private int degresOuverture;
private int degresMax = 100;
private int degresMin = 0;


	public Garage( String _marque, boolean _estOuverte, boolean _estVerouiller, int _degresOuverture, int _degresMax, int _degresMin)
	{
		this.marque = _marque;
		this.estOuverte = _estOuverte;
		this.estVerouiller = _estVerouiller;
		this.degresOuverture = _degresOuverture;
		this.degresMax = _degresMax;
		this.degresMin = _degresMin;
	}
		public boolean ouvrir()
		{
			if(!this.estVerouiller && !this.estOuverte)
			{
				this.estOuverte = true;
						return true; 
			}
			else
			{
				return false;
			}
			
		}
			public boolean fermer()
			{
				if(!this.estVerouiller && this.estOuverte)
				{
					this.estOuverte = false;
						return true;
				}
					else
				{
					return false;
				}
			}
			
			public boolean ouvrirPartiellement(int degresOuvrable)
			{
				if(!this.estVerouiller && !this.estOuverte)
				{
					if (degresOuvrable >= 0)
					{
						if (this.degresOuverture + degresOuvrable < degresMax)
						{
							this.degresOuverture += degresOuvrable;
							this.estOuverte=true;
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
				}else {
					return false;
				}

		}
		
			public boolean fermerPartiellement( int degresFermable)
			{
				if (this.estOuverte)
				{
					if (degresFermable <= degresMax)
					{
						if(this.degresOuverture - degresFermable >= degresMin)
							
						{
							this.degresOuverture -= degresFermable;
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
			
		
}

