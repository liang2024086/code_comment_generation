package methodEmbedding.Speaking_in_Tongues.S.LYD177;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Scanner;


public class SpeakingInTongues {

	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
		
		Scanner sc;
		try {
			sc = new Scanner(new FileInputStream("A-small-attempt0.in"));
		} catch (FileNotFoundException e) {
			sc = new Scanner(System.in); // file not exist, so get input from console
		}
		
		Writer out;
		
		try {
			out = new OutputStreamWriter(new FileOutputStream("A-small.out"));
		} catch (FileNotFoundException e) {
			out = new OutputStreamWriter(System.out); // use console
		}

		HashMap<Character, Character> code = new HashMap<Character, Character>();
		
		code.put('z', 'q');
		code.put('q', 'z');
		code.put(' ', ' ');
		
		String coded = "ejpmysljylckdkxveddknmcrejsicpdrysirbcpcypcrtcsradkhwyfrepkymveddknkmkrkcddekrkdeoyakwaejtysrreujdrlkgcjv",
				english = "ourlanguageisimpossibletounderstandtherearetwentysixfactorialpossibilitiessoitisokayifyouwanttojustgiveup";
		
		for (int i = 0; i < coded.length(); i++) {
			if (!code.containsKey(coded.charAt(i))) {
				code.put(coded.charAt(i), english.charAt(i));
			}
		}
		
//		System.out.println(code.toString() + "\n" + code.size());
//		
//		String decoded = "";
//		
//		for (int i = 0; i < coded.length(); i++) {
//			decoded = decoded.concat(code.get(coded.charAt(i)).toString());
//		}
//		
//		System.out.println(decoded);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int t = 0; t < T; t++) {
			String input = sc.nextLine();
			
			String decoded = "";
			
			for (int i = 0; i < input.length(); i++) {
				decoded = decoded.concat(code.get(input.charAt(i)).toString());
			}
			
			// output
			System.out.println("Case #" + (t+1) + ": " + decoded);
			try {
				out.write("Case #" + (t+1) + ": " + decoded + "\n");
			} catch (IOException e) {
				// do nothing
				System.out.println("output failed");
			}
		}
		
		try {
			out.close();
		} catch (IOException e) {
			// do nothing
		}
	}

}
