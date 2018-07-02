package methodEmbedding.Speaking_in_Tongues.S.LYD755;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class First {
	private static String[] originStr = {"ejp mysljylc kd kxveddknmc re jsicpdrysi", 
		"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "de kr kd eoya kw aej tysr re ujdr lkgc jv"};
	
	private static String[] finalStr = {"our language is impossible to understand", 
		"there are twenty six factorial possibilities", "so it is okay if you want to just give up"};
	
	private static char[] map = new char[26];
	
	public static void main(String[] args) {
		for(int i = 0; i < originStr.length; i++){
			for(int j = 0; j < originStr[i].length(); j++){
				if(originStr[i].charAt(j) >= 'a' && originStr[i].charAt(j) <= 'z'){
					map[originStr[i].charAt(j) - 'a'] = finalStr[i].charAt(j);
				}
			}
		}
		map['z' - 'a'] = 'q';
		map[16] = 'z';
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("input.txt")));
			PrintWriter writer = new PrintWriter(new FileWriter(new File("output.txt")));
			reader.readLine();
			int num = 1;
			String str = "";
			while((str = reader.readLine()) != null){
				String result = "";
				for(int i = 0; i < str.length(); i++){
					if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
						result += map[str.charAt(i) - 'a'];
					else {
						result += str.charAt(i);
					}
				}
				writer.println("Case #" + num + ": " + result);
				num++;
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
