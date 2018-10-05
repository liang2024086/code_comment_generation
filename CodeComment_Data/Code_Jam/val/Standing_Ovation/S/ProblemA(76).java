package methodEmbedding.Standing_Ovation.S.LYD647;

import java.io.*;

public class ProblemA {
	public static void main(String[] args) {
		String[] inputs = null;
		int T = 0;
					
		try {
			BufferedReader reader = new BufferedReader(new FileReader("inputA.txt"));
			String line = reader.readLine();
			T = Integer.parseInt(line);
			inputs = new String[T];
			line = reader.readLine();
			for(int i = 0; i < T; i++) {
				inputs[i] = line;
				line = reader.readLine();
			}
		}
			catch(Exception e) {
				System.out.println("Most likely input.txt not found.");
			}
			
		try {
			FileWriter writer = new FileWriter("outputA.txt");
			for(int i = 0; i < T; i++) {
				int max = Integer.parseInt(inputs[i].substring(0, 1));
				int[] values = new int[max+1]; 
				int friends = -1;
				boolean works = false;
				
				for(int j = 0; j < max+1; j++) {
					values[j] = Integer.parseInt(inputs[i].substring(2+j, 3+j));
				}
				
				while(works == false) {
					int sum = values[0];
					int n = 0;
					friends++;
					while(n+1 <= max && friends+sum >= n+1) {
						sum+= values[n+1];
						n++;
					}
					if(n == max) {
						works = true;
					}
				}
				writer.write("Case #" + (i+1) + ": " + friends);
				writer.write("\n");
			}
		
		writer.close();
		}
		catch(IOException e) {
			System.out.println("This shouldn't happen.");
		}
	}
}
