package methodEmbedding.Revenge_of_the_Pancakes.S.LYD481;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class happy {
   public static void main(String args[]) throws IOException
   {
    //  FileInputStream in = null;
      FileOutputStream out = null;
      out = new FileOutputStream("output.txt");
      String sad = "-";
      String happy = "+";

      List<String> inputList = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);
      String[] a = inputList.toArray(new String[inputList.size()]); 
      ArrayList<String> outList = new ArrayList<String>(inputList.size()-1);
      
      int noc = Integer.parseInt(inputList.get(0));
      for (int i = 0; i < noc; i++) {
    	  String stack = a[i+1];
    	  char[] tempStack = stack.toCharArray();
    	
    	  int flips = 0;
    	while(stack.contains(sad)){
    		int l;
    		for(l = 1; l < stack.length(); l++){
    			if(!(tempStack[l-1] == tempStack[l])){
    				break;
    			}
    		}
    		
    		for(int j = 0 ; j< l; j++){
    			
    			if('+' == (tempStack[j])){
    				tempStack[j] = '-';
    			} 
    			else
    				tempStack[j] = '+';
    		}
    		stack = String.valueOf(tempStack);
    		flips++;
    		
    		System.out.println(tempStack);
    	}
    	outList.add("Case #"+(i+1)+": "+String.valueOf(flips));
	}
      
    System.out.println("out");
      Path file = Paths.get("output.txt");
      Files.write(file, outList, Charset.forName("UTF-8"));
   }
}
