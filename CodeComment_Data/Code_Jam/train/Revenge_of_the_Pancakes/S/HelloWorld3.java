package methodEmbedding.Revenge_of_the_Pancakes.S.LYD930;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld3 {
	private static String inputFileName = "/Users/Combo/Downloads/B-small-attempt0.in";
	private static String outputFileName = "/Users/Combo/Downloads/output2small.txt";
	private static Charset charset = Charset.forName("UTF-8");
	
	public static void main(String[] args) {
		List<String> fileContent = null;
		try {
			fileContent = Files.readAllLines(
					Paths.get(inputFileName),
					charset);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int noOfCase = Integer.parseInt(fileContent.get(0));
		
		List<String> outputLines = new ArrayList<String>();
		Path outputFiles = Paths.get(outputFileName);
		
		for (int i=0;i<noOfCase;i++) {
			String pancakes = ((String)fileContent.get(i+1));
			char[] pancakesStack = pancakes.toCharArray();
			int count = 0;
			char lastPancakes = '+';
			for (int j = pancakesStack.length - 1; j >= 0; j--) {
				char currentCake = pancakesStack[j];
				if (currentCake!=lastPancakes) {
					count++;
					lastPancakes = currentCake;
				}
			}
			System.out.println("Case #"+(i+1)+": "+count);
			outputLines.add("Case #"+(i+1)+": "+count);
		}
		try {
			Files.write(outputFiles, outputLines, charset);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	

}
