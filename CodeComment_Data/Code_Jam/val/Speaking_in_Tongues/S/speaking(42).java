package methodEmbedding.Speaking_in_Tongues.S.LYD495;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class speaking {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String a =  "ejp mysljylc kd kxveddknmc re jsicpdrysi "+
		       "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd "+
		       "de kr kd eoya kw aej tysr re ujdr lkgc jv yeqz";
        String b = "our language is impossible to understand "+
               "there are twenty six factorial possibilities "+
               "so it is okay if you want to just give up aozq";
        
        TreeMap<Character, Character> dict = new TreeMap<Character, Character>(); 
        if (a.length()!= b.length())
        	System.out.println("WTF");
        for (int i = 0; i < a.length(); i++){
        	dict.put(a.charAt(i), b.charAt(i));
        }
        for (char c = 'a'; c <= 'z'; c++){
        	System.out.println(c+" "+dict.get(c));
        }
        FileInputStream file = new FileInputStream(args[0]);
        DataInputStream in = new DataInputStream(file);
        BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));
        int n = Integer.parseInt(in.readLine());
        System.out.println(n);
        for (int i = 0; i < n; i++){
        	String strLine = in.readLine();
        	String outLine ="";
        	for (int j = 0; j < strLine.length(); j++)
        		outLine += dict.get(strLine.charAt(j));
        	out.write("Case #"+ (i+1) +": "+outLine);
        	out.newLine();
        }
        in.close();
        out.close();
        file.close();
	}

}
