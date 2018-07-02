package methodEmbedding.Speaking_in_Tongues.S.LYD640;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SpeakingInTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numDataSet = input.nextInt();
		String[] stringDateset = new String[numDataSet];
		String[] stringOutput = new String[numDataSet];
		input = new Scanner(System.in);
		for (int i = 0; i < numDataSet; i++) {
			stringDateset[i] = input.nextLine();
		}
		// TODO Auto-generated method stub
		Map<String, String> mapChar = new HashMap<String, String>();
		mapChar.put("a", "y");
		mapChar.put("b", "h");
		mapChar.put("c", "e");
		mapChar.put("d", "s");
		mapChar.put("e", "o");
		mapChar.put("f", "c");
		mapChar.put("g", "v");
		mapChar.put("h", "x");
		mapChar.put("i", "d");
		mapChar.put("j", "u");
		mapChar.put("k", "i");
		mapChar.put("l", "g");
		mapChar.put("m", "l");
		mapChar.put("n", "b");
		mapChar.put("o", "k");
		mapChar.put("p", "r");
		mapChar.put("q", "z");
		mapChar.put("r", "t");
		mapChar.put("s", "n");
		mapChar.put("t", "w");
		mapChar.put("u", "j");
		mapChar.put("v", "p");
		mapChar.put("w", "f");
		mapChar.put("x", "m");
		mapChar.put("y", "a");
		mapChar.put("z", "q");
		mapChar.put(" ", " ");
//		System.out.println(stringDateset[0].length());
		
		for (int i = 0; i < numDataSet; i++) {
			stringOutput[i] = "";
			for (int j = 0; j < stringDateset[i].length(); j++) {
//				System.out.println(mapChar.get(stringDateset[i].charAt(i)));
				stringOutput[i] += mapChar.get("" + stringDateset[i].charAt(j));
			}
		}
		try {
			PrintWriter writer = new PrintWriter(new FileWriter(new File("D:\\ans.out"), false), true);
			for (int i = 0; i < numDataSet; i++) {
//				System.out.println(stringOutput[i]);
				writer.println("Case #" + (i + 1 )+ ": " + stringOutput[i]);
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
//	ejp mysljylc kd kxveddknmc re jsicpdrysi
}
