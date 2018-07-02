package methodEmbedding.Magic_Trick.S.LYD2094;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Jam_1 {
	public static void main(String[] args) {
		BufferedReader reader;
		ArrayList<String> input = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader("A-small-attempt2.in"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				input.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String output = "";
		int numCase = 1;

		for(int ii = 0; ii < input.size() - 1; ii += 10, numCase++) {
			int rowIndex1 = Integer.parseInt(input.get(ii + 1));
			int rowIndex2 = Integer.parseInt(input.get(ii + 6));
			String row1 = input.get(ii + 1 + rowIndex1);
			String row2 = input.get(ii + 6 + rowIndex2);

			//			System.out.println(row1 + "\n" + row2);
			String prefix = "Case #";

			String[] split1 = row1.split(" ");
			String[] split2 = row2.split(" ");
			String response = "";
			int matches = 0;

			for(int jj = 0; jj < 4; jj++) {
				for(int kk = 0; kk < 4; kk++) {
					if(split1[jj].equals(split2[kk])) {
						matches++;
						response = split1[jj];
					}
				}
			}

			if(matches == 1) {
				output += prefix + numCase +  ": " + response + "\n";
			} else if(matches > 1){
				output += prefix + numCase + ": Bad magician!\n";
			} else if(matches == 0)  {
				output += prefix + numCase + ": Volunteer cheated!\n";
			}

		}

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
			out.write(output);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//		System.out.println(output);
	}
}
