package methodEmbedding.Standing_Ovation.S.LYD780;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import logic.Logics;
import logic.Parser;
import model.CollectiveInput;
import fileReader.TextFileReader;
import fileReader.TextFileWriter;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
	//	TextFileReader tf = new TextFileReader("Input/input2.in");
		
		
		TextFileReader tf = new TextFileReader("Input/A-small-attempt1.in");
	
				
		CollectiveInput cInput = Parser.ParseInput(tf.getOutput());
		
	
		Logics.findAllFriends(cInput);
		
		
		TextFileWriter tw = new TextFileWriter("Output/output.txt");
		
		tw.writeFile(
				outputs.Output.output(cInput), "Output/output.txt");
				
	}

}
