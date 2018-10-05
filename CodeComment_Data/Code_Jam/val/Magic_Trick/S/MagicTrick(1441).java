package methodEmbedding.Magic_Trick.S.LYD1934;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MagicTrick {
	public static void main(String[] args) throws IOException{
        File f = new File("A-small-attempt1.in");
        BufferedReader input = new BufferedReader(new FileReader(f));
        BufferedWriter output = new BufferedWriter(new FileWriter("A-small-attempt1.out"));
		int caseNum = Integer.parseInt(input.readLine());
		for(int i=1; i<=caseNum; ++i){
			int[][] grid1 = new int[4][4];
			int[][] grid2 = new int[4][4];
			int row1=0, row2=0, cardNum=0;
			row1=Integer.parseInt(input.readLine());
			for(int j=0; j<4; ++j){
				String tmpString = input.readLine();
				String[] tmpStrings = tmpString.split("\\s+");
				for(int k=0; k<4; ++k){
					grid1[j][k]=Integer.parseInt(tmpStrings[k]);
				}
			}
			row2=Integer.parseInt(input.readLine());
			for(int j=0; j<4; ++j){
				String tmpString = input.readLine();
				String[] tmpStrings = tmpString.split("\\s+");
				for(int k=0; k<4; ++k){
					grid2[j][k]=Integer.parseInt(tmpStrings[k]);
					if(j==row2-1){
						for(int p=0; p<4; ++p){
							if(grid1[row1-1][p]==grid2[j][k]){
								if(cardNum==0)
									cardNum=grid2[j][k];
								else
									cardNum=-1;
							}
						}
					}
				}
			}
			if(cardNum==0)
				output.write("Case #"+i+": Volunteer cheated!\n");
			else if(cardNum==-1)
				output.write("Case #"+i+": Bad magician!\n");
			else
				output.write("Case #"+i+": "+cardNum+'\n');
		}
		input.close();
		output.close();
	}
}
