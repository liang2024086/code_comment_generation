package methodEmbedding.Speaking_in_Tongues.S.LYD82;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;


public class qual1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\zyra\\Desktop\\codejam\\qual1.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			Vector<String> lines = new Vector();
			line = br.readLine();
			while((line = br.readLine()) != null ){
				lines.add(line);
			}
			fr.close();
			br.close();
			
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("a", "y");
			map.put("b", "h");
			map.put("c", "e");
			map.put("d", "s");
			map.put("e", "o");
			map.put("f", "c");
			map.put("g", "v");
			map.put("h", "x");
			map.put("i", "d");
			map.put("j", "u");
			map.put("k", "i");
			map.put("l", "g");
			map.put("m", "l");
			map.put("n", "b");
			map.put("o", "k");
			map.put("p", "r");
			map.put("q", "z");
			map.put("r", "t");
			map.put("s", "n");
			map.put("t", "w");
			map.put("u", "j");
			map.put("v", "p");
			map.put("w", "f");
			map.put("x", "m");
			map.put("y", "a");
			map.put("z", "q");
			map.put(" ", " ");
			
			FileWriter fw = new FileWriter("C:\\Users\\zyra\\Desktop\\codejam\\out1.txt");
			for(int i=0; i<lines.size(); i++){
				String out = "Case #"+(i+1)+": ";
				
				String l = lines.elementAt(i);
				//System.out.println(l);
				for(int j=0; j<l.length(); j++){
					char c = l.charAt(j);
					String cstr = Character.toString(c);
					//System.out.println();
					out += map.get(cstr);
				}
				
				System.out.println(out);
				fw.write(out+"\r\n");
			}
			fw.flush();
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
