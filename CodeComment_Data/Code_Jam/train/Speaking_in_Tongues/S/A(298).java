package methodEmbedding.Speaking_in_Tongues.S.LYD478;

import java.util.*;
import java.io.*;
class A {
  public static void main (String[] args)throws Exception
  {
    String inputfilename = args[0];
    String outputfilename = args[1];
    System.out.println(inputfilename);
    

    
    Map<Character,Character> map = new HashMap<Character,Character>();
    map.put('z','q');
    map.put('q','z');
    
    String in = "ejp mysljylc kd kxveddknmc re jsicpdrysi" + 
    "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" + 
    "de kr kd eoya kw aej tysr re ujdr lkgc jv";
    
    String out = "our language is impossible to understand" + 
    "there are twenty six factorial possibilities" + 
    "so it is okay if you want to just give up";
    
    for(int i = 0; i < in.length(); i++) {
      char inn = in.charAt(i);
      char ooo = out.charAt(i);
      if(inn >= 'a' && inn <= 'z') {
	map.put(inn,ooo);
      }
    }
    for(char key = 'a'; key <= 'z'; key++) {
      System.out.println(key + " " + map.get(key));
    }
    
    BufferedReader br = new BufferedReader(new FileReader(inputfilename));
    BufferedWriter bw = new BufferedWriter(new FileWriter(outputfilename));
    
    int cases = Integer.valueOf(br.readLine());
    
    for(int i = 0; i < cases; i++)
    {
      String line = br.readLine();
      bw.write("Case #" + (i + 1) + ": ");
      for(int j = 0; j < line.length(); j++){
	char ll = line.charAt(j);
	if(ll >= 'a' && ll <= 'z') {
	  bw.write(map.get(ll));
	} else {
	  bw.write(ll);
	}

      }
      bw.write("\n");
    }
    
    br.close();
    bw.close();
  }
}
