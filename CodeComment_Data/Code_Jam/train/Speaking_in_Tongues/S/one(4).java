package methodEmbedding.Speaking_in_Tongues.S.LYD619;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Hashtable;


public class one {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("input.txt");
		FileInputStream instream = new FileInputStream(f);
		BufferedReader reader = new BufferedReader(new InputStreamReader(instream));
				
		File f2 = new File("output.txt");
		FileOutputStream outstream = new FileOutputStream(f2);
		BufferedOutputStream of = new BufferedOutputStream(outstream);
		DataOutputStream writer = new DataOutputStream(of);
		
//		String sx = "abcdefghigklmnopqrstuvwxyz";
//		String sy = "abcdefghigklmnopqrstuvwxyz";
		char [] map = new char[26];
		String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
		String s2 = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";
//		Hashtable<Character, Character> h = new Hashtable<Character, Character>();
		for (int i = 0; i < s1.length(); i++) {
//			h.put(s1.charAt(i), s2.charAt(i));
			if(s1.charAt(i) != ' '){
				map[s1.charAt(i) - 'a'] = s2.charAt(i);
			}
//			sx.replaceAll(s1.charAt(i)+"", "");
//			sy.replaceAll(s2.charAt(i)+"", "");
		}
//		System.out.println(sx);
//		System.out.println(sy);
		
		map['z'-'a'] = 'q';
		long x = 0;
		long y = 0;
		char c = 'a';
		for (int i = 0; i < map.length; i++) {
			x += map[i];
			y += c;
			c++;
		}
		map['q'-'a'] = (char)(y-x);
		System.out.println(y-x);
		
		
		int cases = Integer.parseInt(reader.readLine());
		for (int i = 1; i < cases; i++) {
			String s = reader.readLine();
			String s_out = "Case #"+i+": ";
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == ' '){
					s_out += ' ';
				}else{
					s_out += map[s.charAt(j)- 'a'];
				}
			}
			s_out += '\n';
			System.out.println(s_out);
			writer.write(s_out.getBytes());
		}
		String s = reader.readLine();
		String s_out = "Case #"+cases+": ";
		for (int j = 0; j < s.length(); j++) {
			if(s.charAt(j) == ' '){
				s_out += ' ';
			}else{
				s_out += map[s.charAt(j)- 'a'];
			}
		}
		System.out.println(s_out);
		writer.write(s_out.getBytes());
		
		writer.flush();
		writer.close();
	}

}
