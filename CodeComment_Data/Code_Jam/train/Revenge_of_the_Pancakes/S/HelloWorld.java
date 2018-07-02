package methodEmbedding.Revenge_of_the_Pancakes.S.LYD202;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	private static String inputFileName = "/Users/Combo/Downloads/B-small-attempt0.in.txt";
	private static String outputFileName = "/Users/Combo/Downloads/output.txt";
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
			boolean somethingWrong = false;
			int count = 0;
			do {
				somethingWrong= false;
				for (int j=pancakesStack.length-1;j>=0;j--) {
					char currentCake = pancakesStack[j];
					if (somethingWrong || currentCake=='-') {
						pancakesStack[j] = (currentCake=='-'?'+':'-');
						somethingWrong = true;
					}
				}
				count++;
			} while (somethingWrong);
			System.out.println("Case #"+(i+1)+": "+(count-1));
			outputLines.add("Case #"+(i+1)+": "+(count-1));
		}
		try {
			Files.write(outputFiles, outputLines, charset);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	

}
