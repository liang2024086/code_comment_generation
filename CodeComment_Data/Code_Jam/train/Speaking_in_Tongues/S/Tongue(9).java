package methodEmbedding.Speaking_in_Tongues.S.LYD29;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class Tongue {
	public static int SIZE = 135;
	public static void main(String args[]) {
		  try{
			  FileInputStream fstream = new FileInputStream("A-small-attempt6.in");
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  Writer output = null;
			  File file = new File("A-small-attempt6.out");
			  output = new BufferedWriter(new FileWriter(file));
			  String strLine, testIn, testOut;
			  testIn = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv y e q z";
			  testOut = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up a o z q";
			  char[][] strings = new char[SIZE][2];
			  char[] testInChar = testIn.toCharArray();
			  char[] testOutChar = testOut.toCharArray();
			  for(int i = 0; i <SIZE; i++){
				  strings[i][0] = testInChar[i];
			  }
			  
			  for(int i = 0; i <SIZE; i++){
				  strings[i][1] = testOutChar[i];
			  }
			  
			  java.util.Arrays.sort(strings, new java.util.Comparator<char[]>() {
				    public int compare(char[] a, char[] b) {
				        return a[0] - b[0];
				    }
				});
			  
			  Map x = new HashMap();
			  Map num = new HashMap();
			  
			  x.put('0', '0');
			  x.put('1', '1');
			  x.put('2', '2');
			  x.put('3', '3');
			  x.put('4', '4');
			  x.put('5', '5');
			  x.put('6', '6');
			  x.put('7', '7');
			  x.put('8', '8');
			  x.put('9', '9');
			  
			  for(int j = 0; j < SIZE; j++){
				  if(!x.containsKey(strings[j][0])){
					  x.put(strings[j][0], strings[j][1]);
				  }
			  }
			  
			  int count = 0;
			  while ((strLine = br.readLine()) != null)   {
				  if (count > 0){
				  System.out.print("Case #" + count+ ": ");
				  output.write("Case #" + count + ": ");
				  String test = strLine;
				  char[] charStrLine = test.toCharArray();
				  for (int i = 0; i < charStrLine.length; i++) {
						charStrLine[i] = (Character) x.get(charStrLine[i]);
				}
				  String str = new String(charStrLine);
				  //System.out.println(str);
				  output.write( str+ "\n");
				  System.out.println(str);
				  }
				  count++;
			  }

			  in.close();
			  output.close();
			  
			  }
		  catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
		  }	  
	}	
}
