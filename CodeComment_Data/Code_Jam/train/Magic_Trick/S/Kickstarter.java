package methodEmbedding.Magic_Trick.S.LYD1561;


import java.io.File;

public class Kickstarter {

	private static final String SOLUTION_FILE_NAME_EXTENSION = ".solution";

	public static void main(String[] args) throws Exception {

		String taskName = args[0];
		String inputFileName = args[1];

		File inputFile = new File(inputFileName);

		String outputFileName = inputFileName + SOLUTION_FILE_NAME_EXTENSION;
		File outputFile = new File(outputFileName);
		outputFile.createNewFile();

		Task task = (Task) Class.forName(taskName).newInstance();
		task.exec(inputFile, outputFile);

	}

}
