package methodEmbedding.Counting_Sheep.S.LYD699;


import java.util.*;

public class Main {
	public static void main(String[] args) {
		int SOTC = 1; 
		
		FileUtilities infile = new FileUtilities("A-small-attempt0.in", "A-out.txt");
		
		List<String> input = infile.read();
		
		int size = infile.getSize();
		
		if (size != input.size()/SOTC) {
			System.out.println("Sorry! Size of input did not match up.");
		}
		
		List<String> output = new ArrayList<>();
		
		for (int i = 0; i < input.size(); i += SOTC) {
			TestCase testCase = new TestCase(Integer.parseInt(input.get(i)));
			output.add("Case #" + (i/SOTC+1) + ": " + testCase.run());
		}
		
		infile.write(output);
	}
}
