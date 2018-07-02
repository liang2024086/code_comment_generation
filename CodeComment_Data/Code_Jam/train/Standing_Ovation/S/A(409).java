package methodEmbedding.Standing_Ovation.S.LYD1150;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class A {
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(new BufferedReader(new FileReader("a1.in")));
			System.setOut(new PrintStream(new FileOutputStream("a.out")));

			int cases = s.nextInt();


			for(int i = 0; i < cases; i++) {
				int maxShy = s.nextInt(), min_friends = 0;
				int audience_clap = 0; //keep track how many people will clap to decide how many friends needed
				String s1 = s.next();

				char[] test = s1.toCharArray();
				audience_clap = test[0] - '0'; //get number of people who will always clap

				//iterate thru the chararray to calculate how many to bring
				for(int j = 1; j < test.length; j++) {
					if(maxShy == 0) break; //someone will always chap

					//Get current shyness level, and number of people with that level of shyness
					int curr_shy_level = j, num_shy = test[j] - '0';
					if(num_shy > 0) {
						int num_add = curr_shy_level - audience_clap;
						min_friends += num_add > 0 ? num_add : 0; //get friends needed.
						audience_clap += num_add > 0 ? num_add + num_shy: num_shy;//update how many people will clap that aren't friends and people with curr shyness level
					}
				}

				System.out.printf("Case #%d: %d\n", i+1, min_friends);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
