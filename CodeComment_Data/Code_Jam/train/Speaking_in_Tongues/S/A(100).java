package methodEmbedding.Speaking_in_Tongues.S.LYD671;

import java.util.*;
import java.io.*;


public class A {
	
	
 public static void main(String[] args) throws IOException {
  BufferedReader in = new BufferedReader(new FileReader("C:/Users/Disha/Desktop/codejam/A-small.in"));
  FileWriter fw = new FileWriter("C:/Users/Disha/Desktop/codejam/A-small.out");
  /*BufferedReader in = new BufferedReader(new FileReader("A-large.in"));
  FileWriter fw = new FileWriter("A-large.out");*/
  char[][] mapping = {{'a','y'},{'b','h'},{'c','e'},{'d','s'},{'e','o'},{'f','c'},{'g','v'},{'h','x'},{'i','d'},
		  {'j','u'},{'k','i'},{'l','g'},{'m','l'},{'n','b'},{'o','k'},{'p','r'},{'q','z'},{'r','t'},{'s','n'},{'t','w'},{'u','j'},{'v','p'},{'w','f'},
		  {'x','m'},{'y','a'},{'z','q'},{' ',' '}};

  int N = new Integer(in.readLine());
  for (int cases = 1; cases <= N; cases++) {
	  char[] ss = in.readLine().toCharArray();
      for (int i = 0; i <= ss.length -1; i++) {
    	  for (int j=0; j<26; j++){
    		  if (ss[i] == mapping[j][0])
		   		{
    			  ss[i] = mapping[j][1];
					   break;
		   		}
    	  }

      }
	  String out = new String(ss);
	  fw.write ("Case #" + cases + ": " + out + "\n" );
  }
  fw.flush();
  fw.close();
}
}
