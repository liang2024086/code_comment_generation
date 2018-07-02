package methodEmbedding.Speaking_in_Tongues.S.LYD1123;

import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class jellyfish {
	public static void main(String []args)throws IOException{
			TreeMap<String,String>t=new TreeMap<String,String>();
			Scanner keyb=new Scanner(new File("A-small-attempt2.in"));
			t.put("a","y");
			t.put("o","e");
			t.put("z","q");
			t.put("q","z");
			t.put("i","k");
			String a="ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
			String b="our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";
			String c[]=a.split("");
			String d[]=b.split("");
			for(int x=1;x<c.length;x++){
				t.put(c[x],d[x]);
			}
			int f=Integer.parseInt(keyb.nextLine());
			for(int x=1;x<=f;x++){
			String e=keyb.nextLine();	
			String g="";
			for(int y=0;y<e.length();y++){
				g+=t.get(e.substring(y,y+1));
			}
			out.println("Case #"+x+": "+g);
			}
	}
}
