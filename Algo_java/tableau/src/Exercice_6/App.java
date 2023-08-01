package Exercice_6;

public class App {

	

	public static void main(String[] args) {
		
		int [] tab1 = {4,8,7,12};
		int [] tab2 = {3,6};
		int tempo, signal = 0, resultat =0 ;
		int j;
		
		
		for (int i=0; i < tab2.length; i++){
		for ( j=0; j< tab1.length; j++) {
			System.out.print(tab2[i] + " * "+ tab1[j]);
			String signeAffiche = (signal < (tab2.length * tab1.length)-1)? " + " : " = ";  
		signal++;
		System.out.print(signeAffiche);
		tempo = tab2[i]*tab1[j];
		resultat += tempo;
			
		}	
		}
		
		
		
		System.out.println(resultat);
	}
}

	

