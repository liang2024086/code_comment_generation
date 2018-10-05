package methodEmbedding.Speaking_in_Tongues.S.LYD240;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String file = "A-small-attempt0";
		Scanner in = new Scanner(new File(file + ".in"));
		PrintWriter out = new PrintWriter(new File(file + ".out"));

		String[] sampleE = new String[] { "our language is impossible to understand", "there are twenty six factorial possibilities",
		"so it is okay if you want to just give up" };
		Map<Character, Character> map = new HashMap<Character, Character>();
		// "y qee"
		map.put('y', 'a');
		map.put('q', 'z');
		map.put('o', 'e');
		
		int T = Integer.parseInt(in.nextLine());
		for(int t=1; t<=T; t++){
			String line = in.nextLine();
			char[] buff = line.toCharArray();
			
			if(t <=3){
				char[] e = sampleE[t-1].toCharArray();
				System.out.println(line +":"+sampleE[t-1]);
				for (int j = 0; j < buff.length; j++) {
					map.put(buff[j], e[j]);
				}
			}
			
			if (map.size() > 26+1)
				break;			
		}
		
		for(int i=0; i< 26; i++){
			char a = Character.toChars(97+i)[0];
			
			if(map.get(a)==null){
				Collection<Character> values = map.values();
				for(int j=0; j< 26; j++){
					char b = Character.toChars(97+j)[0];
					if(!values.contains(a)){
						map.put(a, b);
						break;
					}
				}
			}
		}
		map.put('z', 'q');
		in.close();
		in = new Scanner(new File(file + ".in"));
		in.nextLine();
		for(int t=1; t<=T; t++){
			String line = in.nextLine();
			char[] buff = line.toCharArray();
			
			
			for(int i=0; i< buff.length; i++){
				try{
				buff[i] = map.get(buff[i]);
				}catch(Exception e){
					//System.out.println(buff[i]);
					
					//e.printStackTrace();
				}
			}
			out.println("Case #" + t + ": "+new String(buff));			
		}
		
		in.close();
		out.close();
	}
}
