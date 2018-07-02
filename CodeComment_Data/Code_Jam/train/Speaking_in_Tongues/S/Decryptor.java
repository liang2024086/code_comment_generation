package methodEmbedding.Speaking_in_Tongues.S.LYD360;


import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class Decryptor {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		FileReader encIn = new FileReader("./A-small-attempt2.in");
		StringBuffer sb = new StringBuffer();
		int i = -1;
		while ((i=encIn.read()) != -1) {
			sb.append((char)i);
			
		}
		String decStr = sb.toString().toUpperCase();
		
		Properties map = new Properties();
		FileReader mapIn = new FileReader("./map.properties");
		map.load(mapIn);
		List keys = new ArrayList(map.keySet());
		Collections.sort(keys);

		for (Iterator it = keys.iterator(); it.hasNext(); ){
			String key = (String) it.next();
			decStr = decStr.replace(key, map.getProperty(key));
		}
		
		 LineNumberReader lr  = new LineNumberReader (new StringReader(decStr));
		 lr.setLineNumber(-1);
		 PrintWriter decOut = new PrintWriter("./A-small-attempt2.out");
		 String line = null;
		 try {
			 while ((line = lr.readLine()) != null) {
				 if (lr.getLineNumber() == 0) {
					 continue;
				 }
				 decOut.println("Case #"+lr.getLineNumber()+": "+line);
			 }
		 } finally {
			 decOut.close();
		 }
	}

}
