package methodEmbedding.Speaking_in_Tongues.S.LYD610;



import java.io.*;
import java.util.*;

public class Start {
		
	/** Requires two arguments - the file name, and the encoding to use.  */
	  public static void main(String [] args) throws IOException {
		        ArrayList<String> input = ReadWriteTextFile.doReadTextFile("A-small-attempt0.in");
		        ArrayList<String> output = new ArrayList<String>();
		        
		        String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		        String s2 = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		        
		        char[] s1arr = s1.toCharArray();
		        char[] s2arr = s2.toCharArray();
		        
		    	Map<Character, Character> map = new HashMap<Character, Character>();
		    	
		    	 for (int i=0;i<s1arr.length;i++) {
		             map.put(s1arr[i],s2arr[i]);
		         }
		         
		         map.put('z','q');
		         map.put('q','z');
		        
		        int n = Integer.parseInt(input.get(0));
		        for (int i=1;i<=n;i++) {
		            System.out.println("Case#: " + i + " ");
		        	output.add(Convert.start(input.get(i),map));
		        }
		        
		        ReadWriteTextFile.doWriteTextFile(output);
	}

}
