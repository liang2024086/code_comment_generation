package methodEmbedding.Speaking_in_Tongues.S.LYD332;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.springframework.util.Assert;

public class SpeakingInTongues {

	static Logger log = Logger.getLogger(SpeakingInTongues.class.getName());
	final static String inputFileName = "A-small-attempt0.in";
	final static String outputFileName = "A-small-attempt0.out";

	public static void main(String[] args) throws IOException {
		String pkgName = SpeakingInTongues.class.getPackage().getName().replaceAll("\\.", "/");
		String inputFile = "src/main/java/" + pkgName + "/" + inputFileName;
		String outputFile = "target/" + pkgName + "/" + outputFileName;
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		FileUtils.forceMkdir(new File("target/" + pkgName));
		PrintWriter writer = new PrintWriter(outputFile);
		int numCase = Integer.parseInt(reader.readLine());
		
		//char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', ' ', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', ' '}; 
		//char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'q', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'z'};
		char[] map = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		
		Assert.isTrue(map.length == 26);
		
		for(int _case = 1; _case <= numCase; ++_case) {
			String s = reader.readLine();
			writer.print("Case #" + _case + ": ");
			for (int i = 0; i < s.length(); ++i) {
				char c = s.charAt(i) == ' ' ? ' ' : map[s.charAt(i) - 'a'];
				writer.print(c);
			}
			writer.println();
		}
		
		reader.close();
		writer.close();
	}

}
