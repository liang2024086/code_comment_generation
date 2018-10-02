package methodEmbedding.Speaking_in_Tongues.S.LYD995;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Translator translator = new Translator();
		Solver solver = new Solver(translator);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Integer testCaseCount = Integer.parseInt(reader.readLine());
		for (Integer testCaseNumber = 1; testCaseNumber <= testCaseCount; testCaseNumber++) {
			solver.solve (testCaseNumber, reader.readLine());
		}
	}

}
