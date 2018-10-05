package methodEmbedding.Standing_Ovation.S.LYD878;


import java.util.List;

public class StandingOvation {

	public static void main(String[] args) {
		InputReader reader = new InputReader();
		List<String> readFile = reader.readFile("resources/A-small-attempt.in");
		
		InputBuilder builder = new InputBuilder();
		int[] out = builder.build(readFile);
		
		OutputBuilder output = new OutputBuilder();
		String finalMessage = output.build(out);

		System.out.println(finalMessage);
	}
}
