package methodEmbedding.Magic_Trick.S.LYD1462;

import java.io.*;
import java.util.*;

/*
 * Kirsten Erich (kirstenaerich)
 * Google Code Jam 2014
 * Magic Trick - https://code.google.com/codejam/contest/2974486/dashboard
 * magictrick.java
 * 12 April 2014
 */

public class magictrick {
	
	public static void main(String args[]) throws NumberFormatException, IOException{

		int test_cases = 10;
		int first_row, second_row = 0;
		Vector<String> first_arrange = new Vector<String>();
		Vector<String> second_arrange = new Vector<String>();
		String oneLine = null;
		String token = null;
		StringTokenizer strtok;
		int match_ct = 0;
		int match_idx = 0;
		String response = null;
		
		File file = new File("C:/Users/Kirsten/Downloads/A-small-attempt1.in");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		
		test_cases = Integer.parseInt(reader.readLine());
		
		int ct = 1;
		while (ct <= test_cases){
			// *** FIRST ROW *** //
			first_row = Integer.parseInt(reader.readLine());
			for (int a = 0; a < first_row; a++){
				oneLine = reader.readLine();
			}
			strtok = new StringTokenizer(oneLine, " ");
			for (int b = 0; b < 4; b++){
				token = strtok.nextToken();
				first_arrange.add(token);
			}
			for (int c = first_row; c < 4; c++){
				reader.readLine();
			}
			// *** SECOND ROW *** //
			second_row = Integer.parseInt(reader.readLine());
			for (int d = 0; d < second_row; d++){
				oneLine = reader.readLine();
			}
			strtok = new StringTokenizer(oneLine, " ");
			for (int e = 0; e < 4; e++){
				token = strtok.nextToken();
				second_arrange.add(token);
			}
			for (int f = second_row; f < 4; f++){
				reader.readLine();
			}
			
			// *** CHECK ROWS *** //
			for (int idx = 0; idx < 4; idx ++){
				if ( second_arrange.contains(first_arrange.elementAt(idx)) ){
					match_ct++;
					match_idx = idx;
				}
			}
			
			if (match_ct == 0){
				response = "Volunteer cheated!";
			}
			else if (match_ct == 1){
				response = first_arrange.elementAt(match_idx);
			}
			else if (match_ct > 1){
				response = "Bad magician!";
			}
			
			match_ct = 0;
			match_idx = 0;
			
			first_arrange.clear();
			second_arrange.clear();
			
			System.out.println("Case #" + ct + ": " + response);
			ct++;
		} // while
		
		reader.close();
		
	} // main

} // magictrick
