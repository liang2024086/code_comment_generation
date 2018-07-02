package methodEmbedding.Speaking_in_Tongues.S.LYD367;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;


public class SpeakinginTongues {
	public static void main(String[] args) {
	Map <Character, Character> table = new HashMap<Character, Character>();
		
		String resTot = "qa zoo our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		String strTot = "zy qee ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		
		for(int i=0;i<strTot.length();i++){
			char f = strTot.charAt(i);
			char s = resTot.charAt(i);
			if(f!=' '){
				table.put(f, s);
			}
		}
		

		try{
			// Get the object of DataInputStream
			//DataInputStream in = new DataInputStream(System.in);
			BufferedReader br = new BufferedReader(new FileReader("A-small-attempt3.in"));
			FileWriter fstream = new FileWriter("out.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			String strLine;
			
			strLine = br.readLine();
			int T = Integer.valueOf(strLine);
			for(int i=0;i<T;i++){
				String str = br.readLine();
				char[] strArr = str.toCharArray();
				for(int j=0;j<str.length();j++){
					if(strArr[j]!=' '){
						//System.out.println(strArr[j]);
						strArr[j]=table.get((Character)strArr[j]);
					}
				}
				String res = new String(strArr);
				out.write("Case #"+(i+1)+": "+res+"\n");
			}

			//Close the input stream
			br.close();
			out.close();
		}catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}		

	}
}
