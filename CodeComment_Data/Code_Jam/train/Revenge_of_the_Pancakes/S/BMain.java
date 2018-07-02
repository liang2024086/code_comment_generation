package methodEmbedding.Revenge_of_the_Pancakes.S.LYD121;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BMain {

	public static void main(String[] args) {
		String inputFileName = args[0];
		String outputFileName = args[1];
		BufferedReader reader = null;
		File outputfile = new File(outputFileName);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outputfile);
		} catch (FileNotFoundException e1) {
			System.err.println("Output file not found");
			System.exit(1);
		}

		DataOutputStream dos = new DataOutputStream(fos);
		try {
			reader = new BufferedReader(new FileReader(inputFileName));

			String numberOfCasesStr = reader.readLine(); // Number of cases
			int numberOfCases = Integer.valueOf(numberOfCasesStr); // Default:
																	// number of
																	// cases
			for (int i = 0; i < numberOfCases; i++) {
				System.out.println("Case #" + (i+1));
				// Read Case
				StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
				
				// Solve Case
				String result = new String();
				String stack = tokenizer.nextToken();
				List<String> condensedStack = new ArrayList<>();
				String currentSide = null; 
				for (int j = 0; j < stack.length(); j++) {
					String side = String.valueOf(stack.charAt(j));
					if (currentSide == null || !currentSide.equals(side)) {
						condensedStack.add(side);
						currentSide = side;
					} 
				}
				
				boolean end = false;
				while (!end && condensedStack.size() > 0) {
					int j = condensedStack.size() - 1;
					String lastSide = condensedStack.get(j);
					if (lastSide.equals("+")) {
						condensedStack.remove(j);
					} else {
						end = true;
					}
				}
				result = String.valueOf(condensedStack.size());
				
				try {
					dos.writeBytes("Case #" + (i+1) + ": " + result + "\n");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
