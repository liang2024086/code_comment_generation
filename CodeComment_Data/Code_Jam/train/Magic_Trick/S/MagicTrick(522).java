package methodEmbedding.Magic_Trick.S.LYD2123;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		Writer fw = new FileWriter("output.txt");

		int cases = sc.nextInt();

		int row1, row2;

		int[][] field1 = new int[4][4];
		int[][] field2 = new int[4][4];

		for (int caseNum = 1; caseNum <= cases; caseNum++){
			row1 = sc.nextInt()-1;
			for(int r = 0; r<4; r++)
				for(int c = 0; c<4; c++)
					field1[r][c]=sc.nextInt();
			
			row2 = sc.nextInt()-1;
			for(int r = 0; r<4; r++)
				for(int c = 0; c<4; c++)
					field2[r][c]=sc.nextInt();
			int num = 0;
			for(int i : field1[row1]){
				for(int j : field2[row2]){
					if(num==0 && i==j)
						num = i;
					else if(num!=0 && i==j){
						num = -1;
					}
				}
			}
			
			switch(num){
			case 0:
				fw.append("Case #"+caseNum+": "+"Volunteer cheated!");
				break;
			case -1:
				fw.append("Case #"+caseNum+": "+"Bad magician!");
				break;
			default:
				fw.append("Case #"+caseNum+": "+num);
				break;
			}
			fw.append(System.getProperty("line.separator"));
		}
		fw.close();
		sc.close();
	}

}
