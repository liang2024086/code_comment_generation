package methodEmbedding.Standing_Ovation.S.LYD547;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//ghGH
public class ProblemA {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		//BufferedReader in = new BufferedReader(new FileReader("A-small.in"));
		FileWriter fw = new FileWriter("A-small.out");
		/*
		 * BufferedReader in = new BufferedReader(new FileReader("A-large.in"));
		 * FileWriter fw = new FileWriter("A-large.out");
		 */
		int N = new Integer(in.readLine());
		for (int cases = 1; cases <= N; cases++) {
			int friendsReq = 0;
			String row[] = in.readLine().split("\\s");
			int sMax = Integer.parseInt(row[0]);
			String sLevel = row[1];
			
			int clapped = 0;
			for (int shyLevel = 0; shyLevel <= sMax; shyLevel++) {
				int audCount = Integer.parseInt(Character.toString(sLevel.charAt(shyLevel)));
				if((audCount!=0) && (clapped < shyLevel)){
					friendsReq += shyLevel - clapped;
					clapped+=(shyLevel - clapped);
				}
				clapped +=audCount;
				//System.out.println("i :"+ shyLevel +" audCount :"+audCount +" totalAudCount:"+clapped +" fR :"+ friendsReq);
			}
			//System.out.println("smax: "+sMax+ " sLevel :"+sLevel+" Freinds req :"+ friendsReq);
			fw.write("Case #" + cases + ": " + friendsReq + "\n");
		}
		fw.flush();
		fw.close();
	}

}
