package exemple_Fonction;

public class App {

	public static int addition(int nombre1,int nombre2)
	{
		int resultat;

		resultat = nombre1 + nombre2;

		return resultat;
	}

	public static void main(String[] args) {

		int a = 56;
		int b = 5;
		int calcul;
		int c = 7;
		int d = 16;

		calcul = addition(a,b);

		System.out.println(calcul);

		calcul = addition(c,d);

		System.out.println(calcul);
	}

}
		
	


