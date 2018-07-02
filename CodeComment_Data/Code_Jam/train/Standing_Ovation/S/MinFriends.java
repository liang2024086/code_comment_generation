package methodEmbedding.Standing_Ovation.S.LYD1410;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class MinFriends {
	
	private static String inputFileName = "C:\\Users\\nmeena\\Downloads\\A-small-attempt0.in";
	
	private static String outputFileName = "StandingOvation.out";
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		
		FileOutputStream fos = new FileOutputStream(new File(outputFileName));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		
		int testCases = Integer.parseInt(br.readLine());
		
		int testCnt = 1;
		
		while(testCases-- > 0){
			
			String inputStr = br.readLine();
			
			String[] inputChunks = inputStr.split(" ");
			
			int sMax = Integer.parseInt(inputChunks[0]);
			
			int standingcount = 0;
			
			int extraPersonsCnt = 0;
			
			for(int i=0; i<=sMax; i++){
				
				if( standingcount < i){
					
					extraPersonsCnt += i-standingcount;
					
					standingcount+= i-standingcount;
				}
				
				standingcount += (inputChunks[1].charAt(i)-48);
			}
			
			bw.write("Case #"+testCnt+": "+extraPersonsCnt);
			//System.out.println("Case #"+testCnt+": "+extraPersonsCnt);
			bw.newLine();
			testCnt++;
		}
		
		
		
		
		// close file at end.
		br.close();
		bw.close();
	}

}
