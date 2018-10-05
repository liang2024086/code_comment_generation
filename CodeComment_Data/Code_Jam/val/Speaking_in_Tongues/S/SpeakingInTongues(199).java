package methodEmbedding.Speaking_in_Tongues.S.LYD1141;

import java.io.*;
import java.util.*;



public class SpeakingInTongues {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(new FileReader("SpeakingInTounges.txt"));

		int caseCount = sc.nextInt();
		sc.nextLine();
		
		HashMap<Character, Character> letterMapping = new HashMap<Character, Character>();
		ArrayList<String> linesIn = new ArrayList<String>();
		ArrayList<String> linesOut = new ArrayList<String>();


		for (int caseNum = 0; caseNum < caseCount; caseNum++) {
			linesIn.add(sc.nextLine());
			System.out.println(linesIn.get(caseNum));
		}
		
		for (int caseNum = 0; caseNum < caseCount; caseNum++) {
			linesOut.add(sc.nextLine());
		}
		
		for (int caseNum = 0; caseNum < caseCount; caseNum++) {
			for (int i = 0; i < linesIn.get(caseNum).length(); i++) {
				letterMapping.put(linesOut.get(caseNum).charAt(i), linesIn.get(caseNum).charAt(i));
			}
		}
		letterMapping.put('z',  'q');
		letterMapping.put('q',  'z');
		
		System.out.println(letterMapping.toString());
		System.out.println(letterMapping.size());
		
		sc = new Scanner(new FileReader("A-small-attempt0.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
		
		/*
		 * Translate
		 */
		caseCount = sc.nextInt();
		sc.nextLine();
		
		String line;
		for (int caseNum = 0; caseNum < caseCount; caseNum++) {
			line = sc.nextLine();
			pw.write("Case #" + (caseNum + 1) + ": ");
			for (int i = 0; i < line.length(); i++) {
				pw.append(letterMapping.get(line.charAt(i)));
			}
			pw.append("\n");
		}
		
		pw.flush();
		pw.close();
		sc.close();
	}
}
