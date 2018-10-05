package methodEmbedding.Speaking_in_Tongues.S.LYD1230;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String inputPath = args[0];
		String outputPath = args[1];
		
		List<String> inputLines = IOUtils.readFile(inputPath);
		inputLines.remove(0);
		
		Map<Integer, String> casesResult = new HashMap<Integer, String>();
		SpeakingTongues solution = new SpeakingTongues();
		
		int caseNum = 1;
		for(String text: inputLines) {
			String result = solution.translate(text);
			casesResult.put(caseNum, result);
			caseNum++;
		}
		
		IOUtils.writeFile(outputPath, casesResult);
	}

}
