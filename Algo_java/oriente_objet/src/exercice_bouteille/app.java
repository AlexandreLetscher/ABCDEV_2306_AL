package exercice_bouteille;

public class app {
	
	public static void main(String[] args ) {
		
		bouteille cristaline = new bouteille("Cristaline",1.25,1.5,false);
		boolean test1 = cristaline.fermer();
		boolean test2 = cristaline.ouvrir();
		boolean test3 = cristaline.viderTout();
		boolean test4 = cristaline.remplirtout();
		boolean test5 = cristaline.vider(0.9);
		boolean test6 = cristaline.remplir(0.6);
	}

}
