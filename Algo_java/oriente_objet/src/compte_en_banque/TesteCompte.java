package compte_en_banque;

public class TesteCompte 
{

	public static void main(String[] args) 
	{
		
Compte monCompte = new Compte(250);
		
		monCompte.afficher();
		monCompte.deposer(20);
		monCompte.afficher();
		monCompte.retirer(30);
		monCompte.afficher();
		monCompte.deposer(30);
		monCompte.afficher();
		monCompte.retirer(69);
		monCompte.afficher();

	}

}
