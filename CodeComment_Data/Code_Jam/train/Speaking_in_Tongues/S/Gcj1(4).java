package methodEmbedding.Speaking_in_Tongues.S.LYD864;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Gcj1 {
	private static String googlerese_sample ="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
	private static String english___sample = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
	private static Map<Character, Character> googlerese_english_map = new TreeMap <Character, Character>();

	static {
		for(int i = 0; i < googlerese_sample.length(); i++){
			googlerese_english_map.put(googlerese_sample.charAt(i), english___sample.charAt(i));			
		}
		googlerese_english_map.put('z', 'q');
		googlerese_english_map.put('q', 'z');		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = args[0]; 
		String output = args[1]; 

		try {
			File fileInput = new File(input);
			System.out.println(fileInput.getAbsolutePath());
			FileReader fr = new FileReader(fileInput);
			BufferedReader br = new BufferedReader(fr);

			File fileOutput = new File(output);
			FileWriter fw = new FileWriter(fileOutput);
			BufferedWriter bw = new BufferedWriter(fw);

			String numberOfCases = br.readLine();
			Integer n = Integer.parseInt(numberOfCases.trim());

			for (int i = 0; i < n; i++) {
				String result = "";
				String line = br.readLine();
	  			for (int s=0; s<line.length(); s++){
	  				result += googlerese_english_map.get(line.charAt(s));
	  			}
				String msg = "Case #" + (i + 1) + ": " + result ;
				System.out.println(msg);
				if (i>0){
					bw.newLine();
				}
				bw.write(msg);
				
			}

			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
