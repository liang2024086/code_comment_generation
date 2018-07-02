package methodEmbedding.Speaking_in_Tongues.S.LYD709;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {

	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("A-small-attempt0.in");
		Scanner data = new Scanner(input);
		PrintStream output = new PrintStream(new File("A-small-attempt0.out"));
		int times = data.nextInt();
		Map<String, String> key = new HashMap<String, String>();
		
		String code =  "ynficwlbkuomxsevzpdrjgthaq ";
		String alpha = "abcdefghijklmnopqrstuvwxyz ";
		
		for(int i = 0; i < code.length(); i++){
			key.put(code.substring(i,  i + 1), alpha.substring(i,  i + 1));
		}
		
		for(int i = 1; i <= times; i++){
			String line = data.next() + data.nextLine();
			output.print("Case #" + i + ": ");
			for(int ii = 0; ii < line.length(); ii++){
				output.print(key.get(line.substring(ii, ii + 1)));
			}
			output.println();
		}
	}
}
