package methodEmbedding.Speaking_in_Tongues.S.LYD455;


import java.io.*;
import java.util.Arrays;

public class A {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small-attempt0.out")));
    int cases = Integer.parseInt(f.readLine());
    
    char[] src = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] res = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
    
    for (int zz=1; zz<=cases; zz++) {
    	out.print("Case #"+zz+": ");
    	char[] in = f.readLine().toCharArray();
    	for (int i=0; i<in.length; i++) {
    		if (in[i]!=32)
    			out.print(res[in[i]-97]);
    		else
    			out.print(" ");
    	}
    	out.println();
    }
    
    out.close();                                  // close the output file
    System.exit(0);                               // don't omit this!
  }
  
}
