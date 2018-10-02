package methodEmbedding.Speaking_in_Tongues.S.LYD1280;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SpeakingInTongues {
	
	private static HashMap<Character, Character> dictionary = new HashMap<Character, Character>();
	/*@formatter:off*/
	private static String[][] crypted =  { {"ejp mysljylc kd kxveddknmc re jsicpdrysi"},
					  				       {"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd"},
									       {"de kr kd eoya kw aej tysr re ujdr lkgc jv"},
									       {"y qee"}
						   		         };
	
	private static String[][] decrypted =  { {"our language is impossible to understand"},
									         {"there are twenty six factorial possibilities"},
									         {"so it is okay if you want to just give up"},
									         {"a zoo"}
						   		           };
	/*@formatter:on*/
	
	public static void main(String[] args) {
		for(int i = 0; i < crypted.length; i++) {
			for(int j = 0; j < crypted[0].length; j++) {
				for(int z = 0; z < crypted[i][j].length(); z++) {
					dictionary.put(crypted[i][j].charAt(z), decrypted[i][j].charAt(z));
				}
			}
		}
		//so easy that isn't worth creating a function to look what is missing
		dictionary.put('z', 'q');
		
		try {
			Scanner sc = new Scanner(new File("C:\\input.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\output.txt"));
			int testCase = 1;
			int numberOfLine = Integer.parseInt(sc.nextLine());
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				StringBuffer sb = new StringBuffer();
				for(int i = 0; i < line.length(); i++) {
					sb.append(dictionary.get(line.charAt(i)));
				}
				bw.write("Case #" + testCase + ": " + sb.toString());
				if(testCase != numberOfLine) {
					bw.newLine();
					testCase++;
				}
			}
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
