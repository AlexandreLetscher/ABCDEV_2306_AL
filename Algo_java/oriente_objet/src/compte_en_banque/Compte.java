package compte_en_banque;

	
	public class Compte 
	{
		double solde;
		
		public Compte(double _solde) 
		{
			this.solde = _solde;
		}
		
		public void deposer(double _somme)
		{
			this.solde += _somme;
		}
		
		public void retirer(double _somme) 
		{
			this.solde -= _somme;
		}
		
		public void afficher()
		{
			System.out.println(" Le solde de votre compte est a : " + this.solde + " euros ");	
				
		}
	}
