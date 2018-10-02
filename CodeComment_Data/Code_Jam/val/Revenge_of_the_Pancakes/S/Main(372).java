package methodEmbedding.Revenge_of_the_Pancakes.S.LYD941;


import java.util.*;

public class Main {
	public static void main(String[] args) {
		int SOTC = 1; 
		
		FileUtilities infile = new FileUtilities("B-small-attempt0.in", "B-out.txt");
		
		List<String> input = infile.read();
		
		int size = infile.getSize();
		
		if (size != input.size()/SOTC) {
			System.out.println("Sorry! Size of input did not match up.");
		}
		
		List<String> output = new ArrayList<>();
		
		for (int i = 0; i < input.size(); i += SOTC) {
			TestCase testCase = new TestCase(input.get(i));
			output.add("Case #" + (i/SOTC+1) + ": " + testCase.run());
		}
		
		infile.write(output);
	}
}
