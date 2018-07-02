package methodEmbedding.Speaking_in_Tongues.S.LYD35;



///REMOVE ALL OUTPUT AND USE STRINGTOKENIZER!


/*
ID: mfranzs1
LANG: JAVA
TASK: SpeakingInTounges
*/
import java.io.*;
import java.util.*;

public class SpeakingInTounges {
	static BufferedReader f;
	static HashMap<Character,Character> library = new HashMap<Character, Character>();
	public static void main (String [] args) throws IOException {
		long unixTime = System.currentTimeMillis();
		// Use BufferedReader rather than RandomAccessFile; it's much faster
		f = new BufferedReader(new FileReader("SpeakingInTounges.in"));
		BufferedReader f2 = new BufferedReader(new FileReader("SpeakingInTounges.in"));
		f2.readLine();f2.readLine();f2.readLine();
	                                                  // input file name goes above
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("SpeakingInTounges.out")));
	    // Use StringTokenizer vs. readLine/split -- lots faster
	    
	    for(int i=0;i<3;i++){
	    	String google = f.readLine();
	    	String english =f2.readLine();
	    	for(int g=0;g<google.length();g++)
	    	{
	    		char goo = google.charAt(g);
	    		char eng = english.charAt(g);
	    		//System.out.println(goo+"->"+eng);
	    		library.put(goo, eng);
	    	}
	    }
	    
	    for(char c='a';c<='z';c++){
	    	System.out.println(c+": "+library.get(c));
	    }
	    
	    int lines=Integer.parseInt(f2.readLine());
	    String output="";
	    for(int l=0;l<lines;l++){
	    	output+="Case #"+(l+1)+": ";
	    	String input=f2.readLine();
	    	for(int c=0;c<input.length();c++){
	    		char i =input.charAt(c);
	    		output+=library.get(i);
	    	}
	    	output+="\n";
	    }
	    System.out.println(output);
	    out.println(output);
	    
	    out.close();                                  // close the output file
	    
	    System.out.println("Time elapsed (ms): "+(System.currentTimeMillis()-unixTime));
	    
	    System.exit(0);                               // don't omit this!
	  }
}
