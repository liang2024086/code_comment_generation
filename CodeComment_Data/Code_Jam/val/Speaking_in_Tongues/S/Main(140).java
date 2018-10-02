package methodEmbedding.Speaking_in_Tongues.S.LYD508;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Main {

	private static final String INPUT =  "fgdebcanolmjkhiwvutsrpzyxq ";
	private static final String OUTPUT = "cvsoheybkgluixdfpjwntrqamz ";

	public static void main(String[] args) {

		HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
		char[] ins = INPUT.toCharArray();
		char[] outs = OUTPUT.toCharArray();

		for (int i = 0; i < ins.length; i++) {
			hashMap.put(ins[i], outs[i]);
		}

		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/A-small-attempt2.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:/A-small-attempt2.out"));
			
			String str = br.readLine();
			int T = Integer.parseInt(str);
			String[] inStr = new String[T];
			for (int i = 0; i < inStr.length; i++) {
				inStr[i] = br.readLine();
			}
			
			for (int i = 0; i < inStr.length; i++) {
				
				bw.write("Case #"+i+": ");
				
				char[] strChars = inStr[i].toCharArray();
				
				for (int j = 0; j < strChars.length; j++) {
					bw.write(hashMap.get(strChars[j]));
				}
				
				bw.write("\n");
			}
			
			br.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
