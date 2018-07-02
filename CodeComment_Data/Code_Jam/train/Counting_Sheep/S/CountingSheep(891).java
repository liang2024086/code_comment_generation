package methodEmbedding.Counting_Sheep.S.LYD1009;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		
		int[] n;
		ArrayList<String> output = new ArrayList<>();
		ArrayList<Character> numbers = new ArrayList<>();
		try {
			Scanner input = new Scanner(new File(args[0]));
			int tempBase;
			int cases = input.nextInt();
			for (int i=0; i<cases; i++) {
				tempBase = input.nextInt();
				numbers.clear();
				for (int j=0; j<10; j++)
					numbers.add(Character.forDigit(j, 10));
				for (int j=1; j<=100 && numbers.size() != 0; j++) {
					String check = Integer.toString(j*tempBase);
					for (int k=0; k<check.length(); k++){
						if (numbers.indexOf(check.charAt(k)) != -1)
							numbers.remove(numbers.indexOf(check.charAt(k)));
					}
					if (numbers.isEmpty())
						output.add("Case #" + (i+1) + ": " + check);
				}
				if (!numbers.isEmpty())
					output.add("Case #" + (i+1) + ": INSOMNIA");
			}
			input.close();
			
			PrintStream outputFile = new PrintStream(new File("out.txt")); 
			for (String line: output)
				outputFile.println(line);
			outputFile.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
