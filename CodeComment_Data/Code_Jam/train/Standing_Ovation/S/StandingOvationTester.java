package methodEmbedding.Standing_Ovation.S.LYD1856;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class StandingOvationTester {


	
	public static void main(String[] args) {
		Charset charset = Charset.defaultCharset();
		List<String> strings, outStrings;
		int numOfTestCases = 0;
		try {
			strings = Files.readAllLines(Paths.get("D:\\git\\r8\\hmi\\server\\src\\main\\java\\com\\siemens\\t3k\\hmi\\uicontrols\\trend\\util", "A-small-attempt0.in"), charset);
			numOfTestCases = Integer.parseInt(strings.get(0));
			outStrings = new ArrayList<>();
			for(int i = 1; i <= numOfTestCases; i++ )
			{
				int friends = 0;
				int numOfStand = 0;
				String[] maxShy = strings.get(i).split("\\s");
				char[] arr = maxShy[1].toCharArray();
				for(int j = 0; j < arr.length; j++) {
					int currShy = new Integer(arr[j]-48);
					if(numOfStand >= j)
					{
						numOfStand += currShy;
					}
					else
					{
						friends++;
						numOfStand = currShy + numOfStand + 1;
					}
				}
				outStrings.add("Case #"+i+": "+friends);
			}
			
			
		
			String content = "This is the content to write into file";
 
			File file = new File("D:\\git\\r8\\hmi\\server\\src\\main\\java\\com\\siemens\\t3k\\hmi\\uicontrols\\trend\\util\\out.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i < outStrings.size(); i++)
			{
				if(i == outStrings.size()-1)
					bw.write(outStrings.get(i));
				else
				bw.write(outStrings.get(i)+"\n");
			}
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
