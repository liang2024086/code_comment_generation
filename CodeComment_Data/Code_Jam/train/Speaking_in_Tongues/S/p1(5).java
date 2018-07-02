package methodEmbedding.Speaking_in_Tongues.S.LYD468;

// Mario Morales

import java.util.*;
import java.io.*;

public class p1{
  public static void main(String[] args) throws Exception{
  	BufferedReader dict = new BufferedReader(new FileReader("dict.txt"));
  	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("answer1.txt")));

    Hashtable<String, String> hash = new Hashtable<String, String>();
    String line;
    for(int i=0; i<26; i++){
    	line = dict.readLine();
    	hash.put(line.substring(2, 3), line.substring(0, 1));	
    }

    BufferedReader f = new BufferedReader(new FileReader("input1.txt"));

    int t = Integer.parseInt(f.readLine());
    String next, res;
    for(int i=0; i<t; i++){
    	next = f.readLine();
    	res = "Case #" + (i+1) + ": ";
    	for(int j=0; j<next.length(); j++){
    		if(next.charAt(j)==' ')
    			res += " ";
    		else
    			res += hash.get(""+next.charAt(j));
    	}
    	out.println(res);
    }

    out.close();
    System.exit(0);
  }
}
