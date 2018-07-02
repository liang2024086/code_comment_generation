package methodEmbedding.Speaking_in_Tongues.S.LYD1111;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class SpeakingTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String original1 = "abcdefghijklmnopqrstuvwxyz ";
		String original2 = "yhesocvxduiglbkrztnwjpfmaq ";
		
		try {
			Scanner scan = new Scanner(new File("A-small-attempt0.in"));
			PrintWriter output = new PrintWriter(new File("output.txt"));
			int tests = scan.nextInt();
			String finalOut = "";
			for(int t = -1; t < tests; t++){
				String dummy = scan.nextLine();
				String result = "";
				for(int i = 0; i < dummy.length(); i++){
					int index = original1.indexOf(dummy.charAt(i));
					result += original2.charAt(index);
				}
				if(t < 0)
					continue;
				result = "Case #" + (t+1) +": "+result+"\n";
				finalOut+=result;
			}
			System.out.println(finalOut);
			output.print(finalOut);
			output.close();
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
