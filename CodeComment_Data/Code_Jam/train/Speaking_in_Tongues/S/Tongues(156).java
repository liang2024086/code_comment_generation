package methodEmbedding.Speaking_in_Tongues.S.LYD1347;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class Tongues {
	public static void main (String[] args) throws IOException {
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] googlebet ={ "y", "n", "f", "i", "c", "w", "l", "b", "k", "u", "o", "m", "x", "s", "e", "v", "z", "p", "d", "r", "j", "g", "t", "h", "a", "q" };
		ArrayList<String> wordList = new ArrayList<String>();
		int cases, index, casenum = 1;
		String output = "", placeValue, newWord = "";
	
		Scanner fileScan = new Scanner(new BufferedReader(
			new FileReader("A-small-attempt0.in")));
		Scanner lineScan;
		String theLine;
		
		cases = Integer.parseInt(fileScan.nextLine());
		
		while (fileScan.hasNextLine()) {
         theLine = fileScan.nextLine();
         lineScan = new Scanner(theLine);
         lineScan.useDelimiter(" ");
			
         for (int i = 0; lineScan.hasNext(); i++) {
            wordList.add(lineScan.next());
         }
			System.out.print("Case #" + casenum + ": ");
			for (String a : wordList) {
				for (int i = 0; i < a.length(); i++) {
					placeValue = a.substring(i, i + 1);
					index = java.util.Arrays.asList(googlebet).indexOf(placeValue);
					if(index > -1) {
						placeValue = alphabet[index];
					}
					newWord += placeValue;
				}
				output += newWord + " ";
				newWord = "";
			}
			System.out.println(output.trim());
			output = "";
			wordList.clear();
			casenum++;
			//System.out.println();
		}
	}
}
