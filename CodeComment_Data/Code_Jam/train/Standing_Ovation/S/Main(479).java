package methodEmbedding.Standing_Ovation.S.LYD808;

import java.io.FileNotFoundException;


public class Main {

	//Si -> shyness level of one person
	//Si = 0 -> immediatly stands up to clap
	//Si = 2 -> waits for at least 2 people
	public static void main(String[] args) 
	{
		try {
			CustomFileReader cfr = new CustomFileReader("in.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
