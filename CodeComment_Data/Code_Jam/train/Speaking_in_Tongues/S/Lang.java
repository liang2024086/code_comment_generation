package methodEmbedding.Speaking_in_Tongues.S.LYD1339;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author Bageshwar
 *
 */
public class Lang {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		TreeMap<Character,Character> map =new TreeMap<Character,Character>();
		
		String[] s = new String[]{"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
				"de kr kd eoya kw aej tysr re ujdr lkgc jv"
		};
		String y[] = new String[]{"our language is impossible to understand",
				"there are twenty six factorial possibilities",
				"so it is okay if you want to just give up"};
		for(int i=0;i<3;i++){
			for(int j=0;j<s[i].length();j++){
				char c = s[i].charAt(j);
				if(c==' ')
					continue;
				//if(map.get(c)!=null)
					//System.out.println("r mapping for "+c+"@"+y[i].charAt(j));				
					map.put(c, y[i].charAt(j));
				
			}
		}
		map.put('z','q');
		map.put('q','z');
		map.put(' ', ' ');
		
		System.out.println(map);
		
		BufferedReader fr = new BufferedReader(new FileReader(new File(args[0])));
		String str =fr.readLine();
		System.out.println(str);
		int lines = Integer.parseInt(str);
		FileWriter writer = new FileWriter(new File(args[1]));
		for(int i=0;i<lines;i++){
			System.out.print("Case #"+(i+1)+": ");
			writer.write("Case #"+(i+1)+": ");
			str = fr.readLine();
			for(int j=0;j<str.length();j++){
				System.out.print(map.get(str.charAt(j)));
				writer.write(map.get(str.charAt(j)));
			}
			System.out.println("");
			writer.write("\r\n");
		}
		
		writer.close();
		fr.close();
		
		
		
		

	}

}
