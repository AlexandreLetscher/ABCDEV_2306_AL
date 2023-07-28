package Exercice_2;

public abstract class App {

	public abstract void main1(String[] args);
		public static void main(String[] args) {
			char[] tab2 = new char[6];
			
			tab2[0] = 'a';
			tab2[1] = 'e';
			tab2[2] = 'i';
			tab2[3] = 'o';
			tab2[4] = 'u';
			tab2[5] = 'y';
			
			for(int i = 0; i < tab2.length; i++)
			{
				System.out.print(tab2[i]+" ");
			}
	}

}
