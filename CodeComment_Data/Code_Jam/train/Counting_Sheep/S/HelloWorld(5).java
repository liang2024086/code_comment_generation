package methodEmbedding.Counting_Sheep.S.LYD899;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	private static String inputFileName = "/Users/Combo/Downloads/A-small-attempt1.in.txt";
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
			//int credit = Integer.parseInt(fileContent.get(i*3+1));
			//int noOfItem = Integer.parseInt(fileContent.get(i*3+2));
			int item = Integer.parseInt(fileContent.get(i+1)+"");
			//System.out.println("Credit:"+credit+", noOfItem:"+noOfItem+", Items:");
			/*int[] itemsInt = new int[items.length];
			for (int p=0;p<items.length;p++) {
				String itemStr = items[p];
				//System.out.print(itemStr+",");
				itemsInt[p] = Integer.parseInt(itemStr);
			}*/
			
			
				String answer = null;
				int firstNumber = item;
				if (firstNumber==0) {
					answer = "INSOMNIA";
				} else {
					int seens[] = new int[] {0,0,0,0,0,0,0,0,0,0};
					int totalSeens = 0;
					int loop=0;
					int currentNumber=0;
					do {
						loop++;
						currentNumber = firstNumber*loop;

						String analyst = currentNumber+"";
						for (int k=0; k<analyst.length();k++) {
							int seensValue = Integer.parseInt(analyst.charAt(k)+"");
							if (seens[seensValue]!=1) {
								seens[seensValue]=1;
								totalSeens++;
							}
						}
					} while (totalSeens<10);
					answer= currentNumber+"";
				}
				System.out.println("Case #"+(i+1)+": "+answer);
				outputLines.add("Case #"+(i+1)+": "+answer);

		}
		try {
			Files.write(outputFiles, outputLines, charset);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	

}
