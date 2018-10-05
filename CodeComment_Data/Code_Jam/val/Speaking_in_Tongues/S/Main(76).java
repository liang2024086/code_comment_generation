package methodEmbedding.Speaking_in_Tongues.S.LYD1307;

import java.io.*;
import java.util.HashMap;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			//in
			FileInputStream in = new FileInputStream("./resources/in.txt");
			DataInputStream inStream = new DataInputStream(in);
			BufferedReader r = new BufferedReader(new InputStreamReader(inStream));
			//out
			FileOutputStream out = new FileOutputStream("./resources/out.txt");
			DataOutputStream outStream = new DataOutputStream(out);
			BufferedWriter w = new BufferedWriter(new OutputStreamWriter(outStream));
			
			HashMap<Character, Character> ap  = new HashMap<Character, Character>();
			ap.put('y', 'a'); 
			ap.put('n', 'b'); 
			ap.put('f', 'c'); 
			ap.put('i', 'd'); 
			ap.put('c', 'e'); 
			ap.put('w', 'f'); 
			ap.put('l', 'g'); 
			ap.put('b', 'h'); 
			ap.put('k', 'i'); 
			ap.put('u', 'j'); 
			ap.put('o', 'k'); 
			ap.put('m', 'l');  
			ap.put('x', 'm'); 
			ap.put('s', 'n'); 
			ap.put('e', 'o'); 
			ap.put('v', 'p'); 
			ap.put('z', 'q');
			ap.put('p', 'r'); 
			ap.put('d', 's'); 
			ap.put('r', 't'); 
			ap.put('j', 'u'); 
			ap.put('g', 'v'); 
			ap.put('t', 'w'); 
			ap.put('h', 'x'); 
			ap.put('a', 'y'); 
			ap.put('q', 'z'); 
			ap.put(' ', ' '); 
			
			String line;
			int total = Integer.parseInt(r.readLine());
			for(int i = 0; i < total;i++){
				line = r.readLine();
				StringBuilder translated = new StringBuilder();
				translated.append("Case #" + (i+1) + ": ");
				for(int c = 0; c < line.length();c++){
					translated.append(ap.get(line.charAt(c)));
				}
				w.append(translated.toString() + "\n");
			}
			
			r.close();
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
