package methodEmbedding.Speaking_in_Tongues.S.LYD1383;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author MArunkumar
 *
 */
public class SpeakingInTongues {

	/**
	 * @param args
	 */
	private static HashMap<String, String> mapper = new HashMap<String, String>();
	static{
		mapper.put("a", "y");
		mapper.put("b", "h");
		mapper.put("c", "e");
		mapper.put("d", "s");
		mapper.put("e", "o");
		mapper.put("f", "c");
		mapper.put("g", "v");
		mapper.put("h", "x");
		mapper.put("i", "d");
		mapper.put("j", "u");
		mapper.put("k", "i");
		mapper.put("l", "g");
		mapper.put("m", "l");
		mapper.put("n", "b");
		mapper.put("o", "k");
		mapper.put("p", "r");
		mapper.put("q", "z");
		mapper.put("r", "t");
		mapper.put("s", "n");
		mapper.put("t", "w");
		mapper.put("u", "j");
		mapper.put("v", "p");
		mapper.put("w", "f");
		mapper.put("x", "m");
		mapper.put("y", "a");
		mapper.put("z", "q");
		mapper.put(" ", " ");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("SpeakingInTonguesInput.txt"));
		FileWriter fw = new FileWriter(new File("SpeakingInTonguesOutput.txt"));
		int tcs = Integer.parseInt(br.readLine());
		for(int i=1; i<=tcs; i++){
			String G = br.readLine();
			StringBuilder E = new StringBuilder();
			for(int j=0; j<G.length(); j++){
				E.append(mapper.get(G.charAt(j)+""));
			}
			//System.out.println("Case #"+i+": "+E.toString());
			fw.write("Case #"+i+": "+E.toString()+"\n");
		}
		fw.close();
	}

}
