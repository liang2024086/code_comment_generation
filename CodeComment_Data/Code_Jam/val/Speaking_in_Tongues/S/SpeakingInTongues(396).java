package methodEmbedding.Speaking_in_Tongues.S.LYD1218;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class SpeakingInTongues {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(args[0]+".out")));
		String l = in.readLine();
		int N = Integer.parseInt(l);
		Map<Character,Character> map = new HashMap<Character,Character>();
		String a = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String b=  "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		for(int i=0;i<a.length();i++) map.put(a.charAt(i),b.charAt(i));
		map.put('z', 'q');
		map.put('q', 'z');
		int i=1;
		while((l=in.readLine())!= null)
		{
			out.print("Case #"+i+++": ");
			for(int j=0;j<l.length();j++)
			{
				Character c = map.get(l.charAt(j));
				if(c==null) c = ' ';
				out.print(c);
			}
			if(i<=N)	out.println("");
		}
		in.close();
		out.close();
	}

}
