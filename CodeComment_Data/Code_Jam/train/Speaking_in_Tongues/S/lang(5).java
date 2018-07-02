package methodEmbedding.Speaking_in_Tongues.S.LYD662;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class lang {
	public static void main(String[] args) {
		try {
			char gl[] = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv".toCharArray();
			char el[] = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up".toCharArray();

			HashMap<String,String> tr = new HashMap<String,String>();
			for(int i=0;i<gl.length;i++)
			{
				tr.put(String.valueOf(gl[i]), String.valueOf(el[i]));
			}
			tr.put("q", "z");
			tr.put("z", "q");

			Scanner in = new Scanner(new File(args[0]));
			PrintWriter out = new PrintWriter( new FileWriter(args[1]));
			int T = in.nextInt();
			in.nextLine();
			for(int i=0;i<T;i++)
			{
				String res=new String();
				char input[] = in.nextLine().toCharArray();
				for(char c:input)
				{
					res+=tr.get(String.valueOf(c));
				}
				out.println("Case #"+(i+1)+": "+res);
			}
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
