package methodEmbedding.Standing_Ovation.S.LYD15;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class StandingOvation {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\suruchi sahay\\Desktop\\A-output.txt"));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		int Tcase = 1;
		line = br.readLine();
		while(line != null) {
			String[] input = line.split(" ");
			int smax = Integer.parseInt(input[0]);
			String smaxValues = input[1];
			char[] charArray = new char[smax+1];
			charArray = smaxValues.toCharArray();
			int inviteFriends =0;
			int noOfPeopleStanding = 0;
			int FirstValue = (int) charArray[0] - (int) '0';
			if (FirstValue == 0){
				inviteFriends += 1; 
				noOfPeopleStanding +=1;
			}
			else {
				noOfPeopleStanding += FirstValue;
				inviteFriends = 0;
			}
			for (int i = 1; i < smaxValues.length(); i++){
				int value = (int) charArray[i] - (int)'0';
				if (noOfPeopleStanding >= i ) {
					noOfPeopleStanding += value;
						
					
				}
				else {
					inviteFriends += 1;
					noOfPeopleStanding = noOfPeopleStanding+1+value;
				}
				
			}
			
			//bw.flush();
			//System.out.println(inviteFriends);
			line = br.readLine();
			bw.write("case #"+Tcase+": "+inviteFriends);
			//bw.write(inviteFriends);
			bw.newLine();
			Tcase += 1;
		}
		bw.close();
	}
}
