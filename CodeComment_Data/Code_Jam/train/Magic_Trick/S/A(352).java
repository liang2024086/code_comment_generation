package methodEmbedding.Magic_Trick.S.LYD177;

import java.util.*;
import java.io.*;

public class A {

	public static void main(String[] args) throws IOException {
		String inF = "A-small-attempt1.in", temp;
		String outF = "out.txt";
		FileWriter wr=new FileWriter(outF); // Setting up output buffer
		BufferedWriter bw = new BufferedWriter(wr);
		PrintWriter outFile = new PrintWriter(bw);
		FileReader fr = new FileReader(inF);
		BufferedReader br = new BufferedReader(fr);
		String d2 = " ";
		int[][] x = new int[4][4];
		int[][] y = new int[4][4];
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int ans_row = Integer.parseInt(br.readLine());
			for(int index = 0; index<4 ; index++){
				temp = br.readLine();
				StringTokenizer tokens = new StringTokenizer(temp, d2);
				for(int index2 = 0; index2<4 ; index2++) {
					x[index][index2] = Integer.parseInt(tokens.nextToken());
				}
			}
			// Second time
			int ans_2 = Integer.parseInt(br.readLine());
			for(int index = 0; index<4 ; index++){
				temp = br.readLine();
				StringTokenizer tokens = new StringTokenizer(temp, d2);
				for(int index2 = 0; index2<4 ; index2++) {
					y[index][index2] = Integer.parseInt(tokens.nextToken());
				}
			}
			// Find result
			int result =0, test =0;
			for(int s = 0 ; s<4 ; s++){
				for(int r = 0 ; r<4; r++){
					if(x[ans_row-1][s] == y[ans_2-1][r]){
						result = x[ans_row-1][s];
						test++;
						}
				}
			}
			if (test==0)
				outFile.println("Case #" + (i+1) + ": Volunteer cheated!");
			if (test == 1)
				outFile.println("Case #" + (i+1) + ": " + result);
			if (test>=2)
				outFile.println("Case #" + (i+1) + ": Bad magician!");
			}
		
		br.close();
		outFile.close();
	}
}
