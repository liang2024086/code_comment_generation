package methodEmbedding.Magic_Trick.S.LYD527;

import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int casos = (sc.nextInt())+1;
		int [][] arranjo1 = new int [4][4];
		int [][] arranjo2 = new int [4][4];
		int row1, row2;
		int iguais;
		int numeroIgual = 0;
		
		for (int i = 1; i < casos; i++) {
			iguais = 0;
			row1 = (sc.nextInt())-1;
			for (int arranjos1 = 0; arranjos1 < 4; arranjos1++) {
				for (int monte1 = 0; monte1 < 4; monte1++) {
					arranjo1[arranjos1][monte1] = sc.nextInt();
					
				}
				
			}
			
			row2 = (sc.nextInt())-1;
			for (int arranjos2 = 0; arranjos2 < 4; arranjos2++) {
				for (int monte2 = 0; monte2 < 4; monte2++) {
					arranjo2[arranjos2][monte2] = sc.nextInt();
					
				}
				
			}
			
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
					if (arranjo1[row1][j] == arranjo2[row2][j2]) {
						numeroIgual = arranjo1[row1][j];
						iguais++;
						
					}
					
				}
				
			}
			
			switch (iguais) {
			case 0:
				System.out.println("Case #"+i+": Volunteer cheated!");
				break;
			
			case 1:
				System.out.println("Case #"+i+": "+numeroIgual);
				break;

			default:
				System.out.println("Case #"+i+": Bad magician!");
				break;
			}
			
		}

	}

}
