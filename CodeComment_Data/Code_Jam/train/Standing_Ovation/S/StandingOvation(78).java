package methodEmbedding.Standing_Ovation.S.LYD418;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jeremy
 */
public class StandingOvation {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO code application logic here
		StandingOvation s = new StandingOvation();
	}
	
	public StandingOvation() throws FileNotFoundException, IOException{
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter pr = new PrintWriter("output.txt");
		BufferedWriter bw = new BufferedWriter(pr);
		
		int testCases = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCases; i++){
			int ans = 0;
			int standing = 0;
			
			String[] line = br.readLine().trim().split("\\s+");
			
			int max = Integer.parseInt(line[0]);
			String crowd = line[1];
			System.out.println(crowd);
			
			for (int shyness=0; shyness < max+1; shyness++){
				if (standing < shyness){
					ans+= shyness-standing;
					standing += shyness-standing;
				}
				System.out.println(crowd.substring(shyness, shyness +1));
				int addStanding = Integer.parseInt(crowd.substring(shyness, shyness+1));
				standing += addStanding;
			}
			
			bw.write(String.format("Case #%d: %d\n", i+1, ans));
		}
		bw.close();
	}
	
}
