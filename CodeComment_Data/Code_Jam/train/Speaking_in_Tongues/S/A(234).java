package methodEmbedding.Speaking_in_Tongues.S.LYD1136;

import java.io.*;

public class A{
	static String[] base = new String[]{
		"our language is impossible to understand",
		"there are twenty six factorial possibilities",
		"so it is okay if you want to just give up"
	};

	static String[] encode = new String[]{
		"ejp mysljylc kd kxveddknmc re jsicpdrysi",
		"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd",
		"de kr kd eoya kw aej tysr re ujdr lkgc jv",
	};

	public static void main(String arg[]){
		char[] dict = new char[26];
		for(int i=0;i<encode.length;i++){
			for(int j=0;j<encode[i].length();j++){
				if(encode[i].charAt(j)==' ') continue;
				dict[encode[i].charAt(j)-'a'] = base[i].charAt(j);
			}
		}
		dict['q'-'a'] = 'z';
		dict['z'-'a'] = 'q';

		try{
			BufferedReader in = new BufferedReader(new FileReader("a-small.in"));
			System.setOut(new PrintStream("a-small.out"));
			int n = Integer.parseInt(in.readLine());
			for(int cases =1;cases<=n;cases++){
				System.out.printf("Case #%d: ",cases);
				String line = in.readLine();
				for(int j=0;j<line.length();j++){
					if(line.charAt(j)==' ') System.out.print(' ');
					else System.out.print(dict[line.charAt(j)-'a']);
				}
				System.out.println();
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
