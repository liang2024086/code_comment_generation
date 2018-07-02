package methodEmbedding.Speaking_in_Tongues.S.LYD1606;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CJ12a {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("A-small-attempt0-out.txt"));
		int t = Integer.parseInt(f.readLine());
	
		String key = "yhesocvxduiglbkrztnwjpfmaq";
		for (int i=0; i<t; i++) {
			String ln = f.readLine();
			String res = "";
			for (int p=0; p<ln.length(); p++) {
				if (ln.charAt(p)==' ')
					res += ' ';
				else 
					res += key.charAt(ln.charAt(p)-'a');
		}
		out.write(String.format("Case #%d: %s\r\n", i+1, res));
		}
		f.close();
		out.close();
	}
}
