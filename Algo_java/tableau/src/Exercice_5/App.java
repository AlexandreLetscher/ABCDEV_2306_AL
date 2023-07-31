package Exercice_5;

public class App {

	public static void main(String[] args) {
			int [] tab1 = {4,8,7,9,1,5,4,6};
			for(int i = 0; i < tab1.length; i++)
			{
				System.out.print(tab1[i]+"  ");
			}
			
			System.out.println(" ");
			
			int [] tab2 = {7,6,5,2,1,3,7,4};
			for(int i = 0; i < tab2.length; i++)
			{
				System.out.print(tab2[i]+"  ");
			}
			
			
			System.out.println("   ");
			int [] tab3 = new int [8];
			for (int i = 0; i < tab3.length; i++)
			{
			tab3[i] = tab1[i] + tab2[i];
			System.out.print(tab3[i] + "-");
			}
			
	}

}
