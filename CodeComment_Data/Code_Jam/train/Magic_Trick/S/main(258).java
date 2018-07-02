package methodEmbedding.Magic_Trick.S.LYD899;

/**
 * Google Code Jam 2014
 * Qualification Round
 * Problem A
 *
 * Author: MC van der Bank
 * Date: 2014/04/12
 *
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;


public class main
{
	public static void main(String[] args)
	{
		if(args.length == 0) {
			System.out.println("Invalid argument. Usage: 'main inputfile' ");
			return;
		}
		
		Writer writer = null;
		try	{
			FileReader file = new FileReader(args[0]);
			BufferedReader reader = new BufferedReader(file);
			
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("GCJ_Q_A_output.txt"), "utf-8"));
			
			//Get test cases
			int T = Integer.parseInt(reader.readLine());
			
			//Do each case
			for(int t=1; t<=T; t++) {
				int answer;
				String row1 = "", row2 = "";
				
				//Get first answer
				answer = (Integer.parseInt(reader.readLine()) - 1);
				
				//Get row
				for(int r=0; r<4; r++) {
					if(answer == r) {
						row1 = reader.readLine();
					}
					else {
						reader.readLine();
					}
				}
				
				//Get second answer
				answer = (Integer.parseInt(reader.readLine()) - 1);
				
				//Get row
				for(int r=0; r<4; r++) {
					if(answer == r) {
						row2 = reader.readLine();
					}
					else {
						reader.readLine();
					}
				}

				//Get individual numbers
				String nums1[] = row1.split(" ");
				String nums2[] = row2.split(" ");

				//Iterate through rows and look for matches
				int matches = 0;
				String card = "";
				for(int i=0; i<4; i++) {
					for(int j=0; j<4; j++) {
						if( Integer.parseInt(nums1[i]) == Integer.parseInt(nums2[j]) ) {
							card = nums1[i];
							matches++;
						}
					}
				}
				
				//Check results, and write to file
				if(matches == 0) {
					//No matches, cheated
					writer.write("Case #"+Integer.toString(t)+": Volunteer cheated!\n");
				} else if(matches == 1) {
					//Single card found
					writer.write("Case #"+Integer.toString(t)+": "+card+"\n");
				} else if(matches > 1) {
					//Bad magician
					writer.write("Case #"+Integer.toString(t)+": Bad magician!\n");
				}	
			}
		}
		catch(IOException e){}
		
		finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}
}
