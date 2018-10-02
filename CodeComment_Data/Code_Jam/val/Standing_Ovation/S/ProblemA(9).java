package methodEmbedding.Standing_Ovation.S.LYD1643;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ProblemA {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String inputFile = "A-small-attempt0.in";
		Scanner sc = new Scanner(new File(inputFile));
		FileWriter fw = new FileWriter(new File("A-small-attempt0.out"));
		int testCases = Integer.parseInt(sc.nextLine());
		int curCase = 1;
		while (curCase <= testCases){
			String[] line = sc.nextLine().split(" ");
			//int mostShyest = Integer.parseInt(line[0]);
			int neededPeople = 0;
			int standing = 0;
			char[] audiance = line[1].toCharArray();
			standing += Character.getNumericValue(audiance[0]);
			for (int i = 1; i < audiance.length; i++){
				if (i > standing && Character.getNumericValue(audiance[i]) != 0){
					neededPeople += i - standing;
					standing += i - standing + Character.getNumericValue(audiance[i]);
				}
				else
					standing += Character.getNumericValue(audiance[i]);
			}
			fw.write("Case #" + curCase + ": " + neededPeople + "\n");
			curCase++;
		}
		sc.close();
		fw.close();		
	}

}
