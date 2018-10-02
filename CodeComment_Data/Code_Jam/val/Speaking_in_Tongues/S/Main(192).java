package methodEmbedding.Speaking_in_Tongues.S.LYD1127;


import java.util.Scanner;

import qualif.io.ReadWrite;
import qualif.problem1.SpeakingInTongue;

public class Main {
	
	private static String pathToFile = "resource/";
	private static String fileName = "A-small";
	private static String outputName = "output";
	private static String googleInput = "inputGoogle.txt";
	private static String englishInput = "inputEnglish.txt";
	private static String filePath  = pathToFile + fileName + ".txt";
	private static String outputPath  = pathToFile + outputName + ".txt";
	
	public static void main(String[] arg){

		
		ReadWrite reader = new ReadWrite();
		SpeakingInTongue speakingInTongue = new SpeakingInTongue(reader.read(filePath));
		
		Scanner google = reader.read(pathToFile + googleInput);
		Scanner english = reader.read(pathToFile + englishInput);	
		speakingInTongue.initialiseMap(google, english);
		
		String[] outputs = speakingInTongue.process();
		reader.write(outputPath, outputs);
	}
	
	
}
