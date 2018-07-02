package methodEmbedding.Standing_Ovation.S.LYD515;

import java.io.*;
import java.util.*;
import java.math.*;

public class  StandingOvation{
	static int c;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("in.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("out.out"));
		int t = Integer.parseInt(br.readLine());
		for(c = 1; c <= t; c++){
			String line = br.readLine();
			String[] fields = line.split(" ");
			int maxShy = Integer.parseInt(fields[0]);
			int[] counts = new int[maxShy + 1];
			int[] totals = new int[maxShy + 1];
			for(int i = 0; i <= maxShy; i++){
				counts[i] = fields[1].charAt(i) - '0';
			}
			for(int i = 1; i <= maxShy; i++){
				totals[i] = totals[i - 1] + counts[i - 1];
			}
			int maxdif = 0;
			for(int i = 0; i <= maxShy; i++){
				int currdif = i - totals[i];
				if(currdif > maxdif){
					maxdif = currdif;
				}
			}
			bw.write("Case #" + c + ": " + maxdif + "\n");
		}
		br.close();
		bw.close();
	}


}
