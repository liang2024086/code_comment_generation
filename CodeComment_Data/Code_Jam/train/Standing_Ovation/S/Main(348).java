package methodEmbedding.Standing_Ovation.S.LYD2007;


import java.util.ArrayList;

public class Main {
	public static void main(String argv[]){
		System.out.println("In Main Class>>>>>>");
		try{
			InputReader in = new InputReader("C:/System Development/CodeJAM/Problem1/src/com/google/codejam/input.txt");
			ArrayList<char[]> processedInput = null;
			processedInput = in.processInputFile();
			ProblemSolver ps = new ProblemSolver();
			ArrayList<String> res = ps.compute(processedInput);
			OutputGenerator out = new OutputGenerator(res);
			out.createOutput();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
