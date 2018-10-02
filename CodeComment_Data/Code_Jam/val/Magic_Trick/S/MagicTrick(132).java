package methodEmbedding.Magic_Trick.S.LYD1144;

import java.io.*;
import java.util.ArrayList;

public class MagicTrick {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Wrong number of args.");
			return;
		}

		BufferedReader input;
		FileWriter output;
		
		try {
			input = new BufferedReader(new FileReader(args[0]));
			output = new FileWriter(args[1]);
			
			int testCases = Integer.parseInt(input.readLine());

			for (int i = 1; i <= testCases; i++) {
				
				int first = Integer.parseInt(input.readLine());
				
				ArrayList<Integer> firstRow = new ArrayList<Integer>(4);
				for (int j = 1; j <= 4; j++) {
					String line = input.readLine();
					if (j == first) {
						String[] lineSplitted = line.split(" ");
						for (int z = 0; z < lineSplitted.length; z++) 
							firstRow.add( Integer.parseInt(lineSplitted[z]) );
					}
				}

				int second = Integer.parseInt(input.readLine());

				ArrayList<Integer> secondRow = new ArrayList<Integer>(4);
				for (int j = 1; j <= 4; j++) {
					String line = input.readLine();
					if (j == second) {
						String[] lineSplitted = line.split(" ");
						for (int z = 0; z < lineSplitted.length; z++) 
							secondRow.add( Integer.parseInt(lineSplitted[z]) );
					}
				}

				firstRow.retainAll(secondRow);

				if (firstRow.size() == 1 ) 
					output.write("Case #"+i+": "+firstRow.get(0)+"\n");
				else if (firstRow.size() > 1) 
					output.write("Case #"+i+": Bad magician!\n");
				else 
					output.write("Case #"+i+": Volunteer cheated!\n");

			}

			input.close();
			output.close();

		} catch (IOException e) {
			System.out.println("IOException occurred");
			e.printStackTrace();
		}
		
	}
}
