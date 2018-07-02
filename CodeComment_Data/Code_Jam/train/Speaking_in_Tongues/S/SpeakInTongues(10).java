package methodEmbedding.Speaking_in_Tongues.S.LYD1089;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;

public class SpeakInTongues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("y", "a");
			map.put("n", "b");
			map.put("f", "c");
			map.put("i", "d");
			map.put("c", "e");
			map.put("w", "f");
			map.put("l", "g");
			map.put("b", "h");
			map.put("k", "i");
			map.put("u", "j");
			map.put("o", "k");
			map.put("m", "l");
			map.put("x", "m");
			map.put("s", "n");
			map.put("e", "o");
			map.put("v", "p");
			map.put("z", "q");
			map.put("p", "r");
			map.put("d", "s");
			map.put("r", "t");
			map.put("j", "u");
			map.put("g", "v");
			map.put("t", "w");
			map.put("h", "x");
			map.put("a", "y" );
			map.put("q", "z");
			
			File  file = new File("C:\\A-small-attempt1.in.txt");
			BufferedReader reader =  new BufferedReader(new FileReader(file));
			String strLine = null;
			int i = 0;

			while((strLine = reader.readLine()) != null){
				if(i == 0){
					i++;	
					continue;
				}
				
				StringBuilder stringBuilder = new StringBuilder();
				for(int j=0; j<strLine.length(); j++){			
					if(map.get(String.valueOf(strLine.charAt(j))) != null){
						stringBuilder.append(map.get(String.valueOf(strLine.charAt(j))));
					}else{
						stringBuilder.append(" ");
					}
				}
				System.out.println("Case #" + i + ": " + stringBuilder.toString());
				i++;
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
