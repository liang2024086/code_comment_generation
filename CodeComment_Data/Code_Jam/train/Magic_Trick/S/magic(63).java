package methodEmbedding.Magic_Trick.S.LYD940;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class magic {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
		String line = line = br.readLine();
		Integer n = Integer.parseInt(line);
		for (int i = 0; i < n; i++) {
			int fg = Integer.parseInt(br.readLine());
			ArrayList<String[]> rows1 = new ArrayList<String[]>();
			rows1.add( br.readLine().split(" "));
			rows1.add(  br.readLine().split(" "));
			rows1.add(  br.readLine().split(" "));
			rows1.add(  br.readLine().split(" "));
			
			String[] guess1 = rows1.get(fg-1);
			
			int sg = Integer.parseInt(br.readLine());
			ArrayList<String[]> rows2 = new ArrayList<String[]>();
			rows2.add( br.readLine().split(" "));
			rows2.add(  br.readLine().split(" "));
			rows2.add(  br.readLine().split(" "));
			rows2.add(  br.readLine().split(" "));
			
			String[] guess2 = rows2.get(sg-1);
			
			int count = 0;
			String card = "";
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (guess1[j].equals(guess2[k])) {
						card = guess1[j];
						count++;
					}
				}
			}
			if (count == 0) {
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			
			} else if (count == 1) {
				System.out.println("Case #"+(i+1)+": " + card);
			} else {
				System.out.println("Case #"+(i+1)+": Bad magician!");
			}
			
		}
		br.close();
		
	}
}
