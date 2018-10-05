package methodEmbedding.Magic_Trick.S.LYD327;

import java.io.*;
import java.util.*;

public class MagicTrick {

	public static void main(String[] args) throws IOException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int caseNum = 1;
		PrintWriter writer = new PrintWriter("MagicTrick.txt", "UTF-8");
		//writer.println("The first line");
		//writer.println("The second line");
		
		for(int numTest = t; numTest > 0;numTest--){
			
			int[] row1 = new int[4];
			int[] row2 = new int[4];
			
			int rowToSave = scan.nextInt()-1;
			for(int y = 0; y < 4;y++){
				if(rowToSave == y){
					row1[0] = scan.nextInt();
					row1[1] = scan.nextInt();
					row1[2] = scan.nextInt();
					row1[3] = scan.nextInt();
				}
				else{
					scan.nextInt();
					scan.nextInt();
					scan.nextInt();
					scan.nextInt();
				}
			}
			//System.out.println(rowToSave);
			rowToSave = scan.nextInt()-1;
			//System.out.println(rowToSave);
			for(int y = 0; y < 4;y++){
				if(rowToSave == y){
					row2[0] = scan.nextInt();
					row2[1] = scan.nextInt();
					row2[2] = scan.nextInt();
					row2[3] = scan.nextInt();
				}
				else{
					scan.nextInt();
					scan.nextInt();
					scan.nextInt();
					scan.nextInt();
				}
			}
			ArrayList<Integer> matchs = new ArrayList<Integer>();
			for(int x = 0; x < 4;x++){
				//System.out.println(row1[x] + " : " + row2[x]);
				if(row1[x] == row2[0]){
					matchs.add(row1[x]);
					//break;
				}
				else if(row1[x] == row2[1]){
					matchs.add(row1[x]);
				}
				else if(row1[x] == row2[2]){
					matchs.add(row1[x]);
				}
				else if(row1[x] == row2[3]){
					matchs.add(row1[x]);
				}
			}
			if(matchs.size() == 1){
				writer.println("Case #" + caseNum + ": " +matchs.get(0));
			}
			else if(matchs.size() == 0){
				writer.println("Case #" + caseNum + ": Volunteer cheated!");
			}
			else if(matchs.size() > 1){
				writer.println("Case #" + caseNum + ": Bad magician!");
			}
			caseNum++;
		}
		writer.close();

	}

}
