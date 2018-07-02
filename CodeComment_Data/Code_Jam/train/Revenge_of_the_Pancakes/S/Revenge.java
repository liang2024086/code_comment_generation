package methodEmbedding.Revenge_of_the_Pancakes.S.LYD998;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class Revenge {
	public static void main(String[] args) throws Throwable {
		File file = new File("B-small-attempt0.in");
		PrintWriter writer = new PrintWriter("op.txt", "UTF-8");
		BufferedReader reader = new BufferedReader(new FileReader(file));
	    String text = null;
	    int t = Integer.parseInt(reader.readLine());
	    for(int k=1;k<=t;k++){
	    	String s = reader.readLine();
	    	int ans=0;
	    	char cur = s.charAt(0);
	    	for(int i=1;i<s.length();i++){
	    		if(cur!=s.charAt(i)){
	    			cur = s.charAt(i);
	    			ans++;
	    		}
	    	}
	    	if(cur=='-')ans++;
	    	writer.println("Case #"+k+": "+ans);
	    	System.out.println("Case #"+k+": "+ans);
	    }
	    writer.close();
	}
}
