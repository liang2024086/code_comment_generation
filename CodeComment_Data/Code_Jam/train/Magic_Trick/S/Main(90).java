package methodEmbedding.Magic_Trick.S.LYD1988;


import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<TestCase> testCases = FileReaderWriter.getTestCases();
		
		for(int i = 1; i <= testCases.size(); i++){
			String result = "Case #"+i+": ";					
			result += Executor.execute(testCases.get(i-1));
			FileReaderWriter.writeOneResult(result);
		}

	}

}
