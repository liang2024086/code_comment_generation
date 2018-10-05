package methodEmbedding.Magic_Trick.S.LYD971;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MagicTrick {
	public static void main(String args[]) {
		String in1 = "", in2 = "", in3 = "", in4 = "", in5 = "", in6 = "", in7 = "",
				in8 = "";
		int testCases=0;
		int row1 = 0, row2 = 0;
		int matrix1[][] = new int[4][4];
		int matrix2[][] = new int[4][4];
		try {
			BufferedReader bf = new BufferedReader(new FileReader("git.txt"));
			 testCases = Integer.parseInt(bf.readLine());
			for (int j = 0; j < testCases; j++) {
				row1 = Integer.parseInt(bf.readLine());
				in1 = bf.readLine();
				in2 = bf.readLine();
				in3 = bf.readLine();
				in4 = bf.readLine();
				
				String strArray1[] = in1.split(" ");
				String strArray2[] = in2.split(" ");
				String strArray3[] = in3.split(" ");
				String strArray4[] = in4.split(" ");

				for (int i = 0; i < 4; i++) {
					matrix1[0][i] = Integer.parseInt(strArray1[i]);
					matrix1[1][i] = Integer.parseInt(strArray2[i]);
					matrix1[2][i] = Integer.parseInt(strArray3[i]);
					matrix1[3][i] = Integer.parseInt(strArray4[i]);
				}
				row2 = Integer.parseInt(bf.readLine());
				in5 = bf.readLine();
				in6 = bf.readLine();
				in7 = bf.readLine();
				in8 = bf.readLine();
				
				
				String strArray5[] = in5.split(" ");
				String strArray6[] = in6.split(" ");
				String strArray7[] = in7.split(" ");
				String strArray8[] = in8.split(" ");

				for (int i = 0; i < 4; i++) {
					matrix2[0][i] = Integer.parseInt(strArray5[i]);
					matrix2[1][i] = Integer.parseInt(strArray6[i]);
					matrix2[2][i] = Integer.parseInt(strArray7[i]);
					matrix2[3][i] = Integer.parseInt(strArray8[i]);
				}
				int row11 = --row1;
				int row22 = --row2;
				int counter = 0;
				int card = 0;
				int selected = 0;
				for(int i=0;i<4;i++){
					card = matrix1[row11][i];
					for(int k=0;k<4;k++){
						if(card == matrix2[row22][k]){
							counter++;
							selected = card;
						}
						
					}
					
				}
				if(counter == 0){
					System.out.println("Case #"+(1+j)+": "+"Volunteer cheated!");
				}
				else if(counter == 1){
					System.out.println("Case #"+(1+j)+": "+selected);
					
				}
				else{
					System.out.println("Case #"+(1+j)+": "+"Bad magician!");
					
				}
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
}
