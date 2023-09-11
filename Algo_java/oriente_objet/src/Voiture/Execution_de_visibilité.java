package Voiture;

public class Execution_de_visibilité 
{


	public static void main(String[] args) {
		
		Visibilité_Public maVoiture = new Visibilité_Public();
		
		maVoiture.steMarque("Audi");
		maVoiture.afficher();
		maVoiture.setPrix(17500);
		maVoiture.afficher();
	}

}
