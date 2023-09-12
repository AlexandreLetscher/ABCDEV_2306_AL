

package exercice_porte_de_garage;

public class App {

	public static void main(String[] args) {
		
		Garage maPorte1 = new Garage("Aludoor", true, false, 25, 100, 0);
		Garage maPorte2 = new Garage("Bricot depot", false, false, 0, 100, 0);
		
		boolean test1 = maPorte1.ouvrir();
		boolean test2 = maPorte2.ouvrir();
		boolean test3 = maPorte1.fermer();
		boolean test4 = maPorte2.fermer();
		boolean test5 = maPorte1.ouvrirPartiellement(65);
		boolean test6 = maPorte2.ouvrirPartiellement(50);
		boolean test7 = maPorte1.fermerPartiellement(50);
		boolean test8 = maPorte2.fermerPartiellement(50);
	}	

}
