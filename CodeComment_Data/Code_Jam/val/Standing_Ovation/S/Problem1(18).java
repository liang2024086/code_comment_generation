package methodEmbedding.Standing_Ovation.S.LYD1312;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Problem1 {
 
	public static void main(String[] args) {
 
		BufferedReader br = null;
 
		try {
 
			String line;
 
			br = new BufferedReader(new FileReader("input.txt"));
			
			line = br.readLine();
			int T = Integer.valueOf(line);
			
			for(int t=0;t<T;t++){
				line = br.readLine();
				String temp[] = line.split(" ");
				int Smax = Integer.valueOf(temp[0]);
				String N = temp[1];
				
				int noOfPeople[] = new int[Smax+1];
				
				for(int m=0;m<=Smax;m++){
					
					noOfPeople[m]=N.charAt(m)-'0';
					
				}
				
				int noOfFriends = 0;
				int noOfStanding = 0;
				noOfStanding = noOfPeople[0];
				for(int m=1;m<=Smax;m++){
					if(noOfStanding<m){
						noOfFriends = noOfFriends+(m-noOfStanding);
						noOfStanding = m;
					}
					noOfStanding = noOfStanding+noOfPeople[m];
				}
				
				System.out.println("Case #"+(t+1)+": "+noOfFriends);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
	
}
