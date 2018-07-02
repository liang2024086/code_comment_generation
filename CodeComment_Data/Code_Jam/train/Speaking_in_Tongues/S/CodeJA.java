package methodEmbedding.Speaking_in_Tongues.S.LYD843;

import java.io.*;
import java.util.*;

class CodeJA {
  static char arr[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
  //  BufferedReader f = new BufferedReader(new FileReader("test.in"));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ans.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    int t=Integer.parseInt(br.readLine());
    for(int i=1;i<=t;i++)
    {
      String a=br.readLine();
      String ans="";
      for(int j=0;j<a.length();j++)
      {
	int c=a.charAt(j);
	if(c!=' ')
	  ans+=arr[c-'a'];
	else
	  ans+=' ';
      }
      out.print("Case #"+i+": ");
      out.println(ans);
    }
   // out.println(i1+i2);                           // output result
    out.close();                                  // close the output file
    System.exit(0);                               // don't omit this!
  }
}
