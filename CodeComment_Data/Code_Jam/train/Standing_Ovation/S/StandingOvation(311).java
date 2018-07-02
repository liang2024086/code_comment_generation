package methodEmbedding.Standing_Ovation.S.LYD913;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class StandingOvation {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("prob.in")));
		int testCases = Integer.parseInt(br.readLine());
		PrintWriter pw = new PrintWriter(new FileWriter(new File("result.out")));
		for(int i=0;i<testCases;i++){
			String[] input = br.readLine().split(" ");
			int maxShyLevel = Integer.parseInt(input[0]);
			int[] totalShyLevel = new int[maxShyLevel+1];
			char[] shyChar = input[1].toCharArray();
//			System.out.println("case:" + (i+1));
			for(int c=0;c<shyChar.length;c++){
				totalShyLevel[c] = Character.getNumericValue(shyChar[c]);
//				System.out.println(totalShyLevel[c]);
			}
			int stoodUp = 0;
			int friendsRequired = 0;
			
//			System.out.println("maxShyLevel:" + maxShyLevel);
//			System.out.println("Strung: " + input[1]);
			for(int s=0;s<totalShyLevel.length;s++){
//				System.out.println("Total Shy LeveL: " + totalShyLevel[s]);
				if(s<=stoodUp){
					
					stoodUp += totalShyLevel[s];
				}else{
					if(totalShyLevel[s]>0){
						friendsRequired += (s-stoodUp);
						stoodUp += totalShyLevel[s] + friendsRequired;
					}
				}
//				System.out.println("Stood up:"  + stoodUp);
//				System.out.println("friendsReuqested:" + friendsRequired);
			}
			
			pw.println("Case #"+(i+1)+": "+friendsRequired);
		}
		pw.close();
	}
	
	

}
