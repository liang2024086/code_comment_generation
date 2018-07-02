package methodEmbedding.Speaking_in_Tongues.S.LYD1246;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class SpeakingInTongues {
	
	public static void main(String args[]) throws IOException{
		char[] map = new char[26];
		for(int i = 0 ; i < 26 ; i ++){
			map[i] = ' ';
		}
		map['a' - 'a'] = 'y';
		map['o' - 'a'] = 'e';
		map['z' - 'a'] = 'q';
		map[16] = 'z';
		
		String hint = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String matched = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		
		for(int i = 0 ; i< hint.length() ; i ++){
			char a = hint.charAt(i);
			char b = matched.charAt(i);
			
			if(a == ' ')
				continue;
			
			map[a - 'a'] = b;
		}
		
		/*for(int i = 0 ; i < 26 ; i ++){
			if(map[i] == ' ')
				System.out.println(i);
		}
		for(int i = 0 ; i < 26 ; i ++){
			System.out.println(map[i]);
		}*/
		BufferedReader reader = new BufferedReader(new FileReader(new File("A-small-attempt2.in")));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("output.txt")));
		String line = reader.readLine();
		int T = Integer.parseInt(line);
		for(int i = 0 ; i < T ; i ++){
			line = reader.readLine();
			StringBuilder sb = new StringBuilder();
			for(int j = 0 ;j  < line.length() ;j ++){
				char ch = line.charAt(j);
				if(ch == ' ')
					sb.append(' ');
				else
					sb.append(map[ch -'a']);
			}
			writer.write("Case #" + (i + 1) + ": " + sb.toString() + "\r\n");
		}
		reader.close();
		writer.close();
	}

}
