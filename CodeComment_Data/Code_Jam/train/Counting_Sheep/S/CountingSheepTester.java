package methodEmbedding.Counting_Sheep.S.LYD1188;

import java.io.File;
import java.io.FileNotFoundException;

//***********************************
//
// Bill Toth's CountingSheep
// for Google Code Jam 2016
// Problem 1 (CountingSheep)
//
//***********************************

public class CountingSheepTester {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File(args[0]);//take in file
		CountingSheep t = new CountingSheep(inputFile);//parse it
		t.evaluate();//evaluate it
	}

}
