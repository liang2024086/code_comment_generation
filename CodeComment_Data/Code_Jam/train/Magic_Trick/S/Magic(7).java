package methodEmbedding.Magic_Trick.S.LYD190;

import java.util.*;

public class Magic {

	public static void main(String args[]) {
		int k = 0;
		Scanner input = new Scanner(System.in);
		String s = new String("");
		String s2 = new String("");
		int tt = Integer.parseInt(input.nextLine());
		int[] flag=new int[tt];
		int x[] = new int[tt];
		int c = 0;
		for(c=0;c<tt;c++) {
			s="";
			s2="";
			k = 0;
			int a = Integer.parseInt(input.nextLine());
			int[][] card = new int[4][4];

			for (int i = 0; i < 4; i++) {
				s += input.nextLine();
				s += " ";
			}
			String[][] array=new String[tt][];
			
					array[c]=s.split(" ");
			for (int i = 0; i < 4; i++) {

				for (int j = 0; j < 4; j++) {

					card[i][j] = Integer.parseInt(array[c][k]);
					if (k < array[c].length) {
						k++;
					}
				}
			}

			k = 0;
			int[][] card2 = new int[4][4];
			int b = Integer.parseInt(input.nextLine());
			for (int i = 0; i < 4; i++) {
				s2 += input.nextLine();
				s2 += " ";
			}
			String[][] array2=new String[tt][];
			array2[c] = s2.split(" ");
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					card2[i][j] = Integer.parseInt(array2[c][k]);
					if (k < array2[c].length) {
						k++;
					}
				}
			}
			System.out.println("First cards");
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					System.out.print(""+card[i][j]+"\t");
				}
				System.out.println("");
			}
			System.out.println("Second cards");
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					System.out.print(""+card2[i][j]+"\t");
				}
				System.out.println("");
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++)
					if (card[a - 1][i] == card2[b - 1][j]) {
						x[c] = card[a - 1][i];
						flag[c]++;
					}

			}
			
			System.out.println("Hello"+flag[c]+"and"+c+"and "+a +","+b);
		}
		
		for(int i=0;i<tt;i++){
			if (flag[i] == 1)
				System.out.println("Case #" + (i+ 1) + ": " + x[i]);
			if (flag[i] > 1)
				System.out.println("Case #" + (i + 1) + ": Bad magician!");
			if (flag[i] == 0)
				System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
		}

	}
}
