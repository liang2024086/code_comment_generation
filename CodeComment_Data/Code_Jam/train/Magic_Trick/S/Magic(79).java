package methodEmbedding.Magic_Trick.S.LYD1982;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Magic {

	public static void main(String[] args) throws IOException {
		String fileName = "A-small-attempt0.in";
		String outFileName = "output.txt";
		Scanner s = null;
		try {
			s = new Scanner(new BufferedReader(new FileReader(fileName)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter b = null;
		try {
			b = new BufferedWriter(new FileWriter(outFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int cases = s.nextInt();
		
		Set<Integer> seen = new HashSet<Integer>();
		
		for (int i = 0; i < cases; i++) {
			seen = new HashSet<Integer>();
			int row1 = s.nextInt();
			
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (j == row1 - 1) {
						seen.add(s.nextInt());
					} else {
						s.nextInt();
					}
				}
			}
			
			int row2 = s.nextInt();
			int matches = 0;
			int matched = 0;
			
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (j == row2 - 1) {
						int number = s.nextInt();
						if (seen.contains(number)) {
							matches++;
							matched = number;
						}
					} else {
						s.nextInt();
					}
				}
			}
			
			if (matches == 0) {
				b.append(String.format("Case #%d: Volunteer cheated!\n", i + 1));
			} else if (matches == 1) {
				b.append(String.format("Case #%d: %d\n", i + 1, matched));
			} else {
				b.append(String.format("Case #%d: Bad magician!\n", i + 1));
			}
			
		}
		b.close();
	}
	
}
