package methodEmbedding.Speaking_in_Tongues.S.LYD1225;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;


public class KeyValueMap {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<Character, Character> h = new HashMap<Character, Character>();
		String keyString = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv 1234567890zq";
		String valString = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up 1234567890qz";
		
		for(int iCount = 0; iCount < keyString.length(); iCount++){
			h.put((Character)keyString.toCharArray()[iCount], (Character)valString.toCharArray()[iCount]);
		}
		
		/*Iterator it = h.keySet().iterator();
		while (it.hasNext()) {
			Character type = (Character) it.next();
			System.out.println(type.toString() + " = " + h.get(type).toString());
		}*/
		File file = new File("C:\\Documents and Settings\\Administrator\\My Documents\\A-small-attempt2.in");
		FileInputStream fs = new FileInputStream(file);
		byte[] b = new byte[(int) file.length()];
		fs.read(b, 0, (int)file.length());
		
		StringBuilder out = new StringBuilder();
		int lineCount = 1;
		boolean isFirst = true;
		
		for(int iCount = 0; iCount < b.length; iCount++){
			if(b[iCount] == '\n'){
				isFirst = false;
			}
			if(!isFirst){
				if(b[iCount] == '\n'){
					if(lineCount != 1){
						System.out.println(out.toString());
						out = new StringBuilder();
					}
					out.append("Case #"+(lineCount++)).append(": ");
				}
				if(b[iCount] == ' '){
					out.append(" ");
					continue;
				}
				if(b[iCount] == '\n'){
					out.append("");
					continue;
				}
				out.append(h.get((char)b[iCount]));
			}
		}
	}

}
