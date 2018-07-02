package methodEmbedding.Speaking_in_Tongues.S.LYD1453;

import java.io.*;
import java.util.*;
public class Googlerese{
	public static void main(String args[])throws Exception{
		//set up translation
		Hashtable<String,String> trans = new Hashtable<String,String>();
		String temp = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String temp2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String temp3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String temp_ = "our language is impossible to understand";
		String temp_1 = "there are twenty six factorial possibilities";
		String temp_2 = "so it is okay if you want to just give up";
		for(int i=0;i<temp.length();i++){
			if(temp.charAt(i)!=' '){
			trans.put(String.valueOf(temp.charAt(i)),String.valueOf(temp_.charAt(i)));
			}			
		}
		for(int j=0;j<temp2.length();j++){
			if(temp2.charAt(j)!=' ')
			trans.put(String.valueOf(temp2.charAt(j)),String.valueOf(temp_1.charAt(j)));
		}
		for(int k=0;k<temp3.length();k++){
			if(temp3.charAt(k)!=' ')
			trans.put(String.valueOf(temp3.charAt(k)),String.valueOf(temp_2.charAt(k)));
		}

		trans.put("y","a");
		trans.put("q","z");
		trans.put("z","q");
		
		BufferedReader bf  = new BufferedReader(new FileReader("A-small-attempt4.in"));
		String lines = bf.readLine();
		String line = bf.readLine();
		int ctr=1;
		PrintWriter pw = new PrintWriter(new FileWriter("a.out"));
		while(line!=null){
			String res="";
			for(int i=0;i<line.length();i++){
				if(line.charAt(i)==' '){
					res+=" ";
					continue;
				}
				res += trans.get(String.valueOf(line.charAt(i)));
			}
			pw.println("Case #"+ctr+": "+res);
			ctr++;
			line = bf.readLine();
		}
		pw.flush();
	}
}
