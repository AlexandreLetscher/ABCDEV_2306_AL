package Exercice_5;

public class App {

	public static void main(String[] args) {
			int [] tab1 = new int [8];
			tab1[0] = 4;
			tab1[1] = 8;
			tab1[2] = 7;
			tab1[3] = 9;
			tab1[4] = 1;
			tab1[5] = 5;
			tab1[6] = 4;
			tab1[7] = 6;
			
			for(int i = 0; i < tab1.length; i++)
			{
				System.out.print(tab1[i]+" ");
			}
			
			System.out.println(" ");
			
			int [] tab2 = new int [8];
			tab2[0] = 7;
			tab2[1] = 6;
			tab2[2] = 5;
			tab2[3] = 2;
			tab2[4] = 1;
			tab2[5] = 3;
			tab2[6] = 7;
			tab2[7] = 4;
			
			for(int i = 0; i < tab2.length; i++)
			{
				System.out.print(tab2[i]+" ");
			}
			
			
			System.out.println(" ");
			int [] tab3 = new int [8];
			
		for (int i = 0; i < tab3.length; i++)
		{
			tab3[i] = tab1[i] + tab2[i];
			System.out.print(tab3[i] + " ");
		}
			
	}

}
