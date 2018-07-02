package methodEmbedding.Magic_Trick.S.LYD2073;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.Object;

public class magic_trick {

	public static void main(String[] args) {
		
		String grid1Line="",grid2Line="";
		int totaltestCases=0;
		int field1[][], field2[][];
		StringTokenizer tk1, tk2;
		field1 = new int[4][4];
		field2 = new int[4][4];
		int rowChoice1;
		int rowChoice2;
		
		try {
			//BufferedReader inputStream = new BufferedReader(new FileReader("A-large.in"));
			BufferedReader inputStream = new BufferedReader(new FileReader("input"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			
			totaltestCases = Integer.parseInt(inputStream.readLine());

			for(int testcases = 0; testcases < totaltestCases; testcases ++){
				rowChoice1 = Integer.parseInt(inputStream.readLine())-1;

				for(int i=0; i<4; i++){
					grid1Line = inputStream.readLine();
					tk1 = new StringTokenizer(grid1Line," ");
					for(int j=0; j<4; j++){
						field1[i][j] = Integer.parseInt((tk1.nextToken()));
					}
				}
				
				rowChoice2 = Integer.parseInt(inputStream.readLine())-1;

				for(int i=0; i<4; i++){
					grid2Line = inputStream.readLine();
					tk2 = new StringTokenizer(grid2Line," ");
					for(int j=0; j<4; j++){
						field2[i][j] = Integer.parseInt((tk2.nextToken()));
					}
				}
				
				int lastAnswer = -1;
				int answersFound = 0;
				for(int i=0 ; i < 4; i++){
					for(int j=0; j< 4; j++) {

						if(field1[rowChoice1][i] == field2[rowChoice2][j]){
							lastAnswer = field1[rowChoice1][i];
							answersFound++;
						}
					}
				}
				
				if(answersFound > 1){
					writer.write("Case #" + (testcases+1) + ": Bad magician!");
					writer.newLine();
				}else if(answersFound == 0){
					writer.write("Case #" + (testcases+1) + ": Volunteer cheated!");
					writer.newLine();
				}else{
					writer.write("Case #" + (testcases+1) + ": " + lastAnswer);
					writer.newLine();
				}
				
			}//read new testcases
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main
}
