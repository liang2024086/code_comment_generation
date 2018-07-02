package methodEmbedding.Speaking_in_Tongues.S.LYD635;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class SpeakingTongue {
	
	/*
	 * ejp mysljylc kd kxveddknmc re jsicpdrysi
rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
de kr kd eoya kw aej tysr re ujdr lkgc jv


Output
Case #1: our language is impossible to understand
Case #2: there are twenty six factorial possibilities
Case #3: so it is okay if you want to just give up
	 */
	 private static final Map<Character,Character> myMap = new HashMap<Character,Character>();
	 static{
		 myMap.put('a', 'y');
		 myMap.put('b', 'h');
		 myMap.put('c', 'e');
		 myMap.put('d', 's');
		 myMap.put('e', 'o');
		 myMap.put('f', 'c');
		 myMap.put('g', 'v');
		 myMap.put('h', 'x');
		 myMap.put('i', 'd');
		 myMap.put('j', 'u');
		 myMap.put('k', 'i');
		 myMap.put('l', 'g');
		 myMap.put('m', 'l');
		 myMap.put('n', 'b');
		 myMap.put('o', 'k');
		 myMap.put('p', 'r');
		 myMap.put('q', 'z');
		 myMap.put('r', 't');
		 myMap.put('s', 'n');
		 myMap.put('t', 'w');
		 myMap.put('u', 'j');
		 myMap.put('v', 'p');
		 myMap.put('w', 'f');
		 myMap.put('x', 'm');
		 myMap.put('y', 'a');
		 myMap.put('z', 'q');
	 }
	
	 public static void main(String[] args) throws IOException
	 {
		  if(args.length < 2) 
		  {
			  System.err.println("Please enter the Valid I/O Paths in the argument ");
			  System.err.println("First Input , then OutPut ");
			  System.exit(0);
		  }
		  File inFile = new File(args[0]);
		  File outFile = new File(args[1]);
		  BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)));
		  PrintWriter out = new PrintWriter(new FileOutputStream(outFile));
		  String myLine = in.readLine();
		  int t = Integer.parseInt(myLine);
		  int caseNum = 1;
		  StringBuffer myBuffer = new StringBuffer();
		  while(t-- > 0)
		  {
			  myLine = in.readLine();
			  char[] myChars = myLine.toCharArray();
			  for(int i = 0 ; i < myChars.length; i++)
				  if(myMap.containsKey(myChars[i]))
					  myBuffer.append(myMap.get(myChars[i]));
				  else myBuffer.append(myChars[i]);
			  out.println("Case #"+(caseNum)+": "+myBuffer.toString());
			  caseNum++;
			  myBuffer.setLength(0);
		  }
		  out.close();
	 }

}
