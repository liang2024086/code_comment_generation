package methodEmbedding.Counting_Sheep.S.LYD988;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class main {
   public static void main(String args[]) throws IOException
   {
    //  FileInputStream in = null;
      FileOutputStream out = null;
      out = new FileOutputStream("output.txt");

      List<String> inputList = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);
      String[] a = inputList.toArray(new String[inputList.size()]); 
      ArrayList<String> outList = new ArrayList<String>(inputList.size()-1);
      
      int noc = Integer.parseInt(inputList.get(0));
      for (int i = 0; i < noc; i++) {
    	  int caseInput = Integer.parseInt(a[i+1]);
    	  ArrayList<Integer> numList = new ArrayList<Integer>();
    	  if(caseInput == 0){
    		  outList.add("Case #"+(i+1)+": "+"INSOMNIA");
    		  continue;
    	  }
    	  int tempCase = 1 ;
    	  for(int j = 1; numList.size()!=10;j++){
    		 
    		   tempCase = j*caseInput;
    		   int anotherTemp = tempCase;
    		  while(anotherTemp>0){
    			  int num = anotherTemp%10;
    			  anotherTemp /= 10;
    			  if(!numList.contains(num))
    				  numList.add(num);
    		  }
    		  
    	  }
    	
		outList.add("Case #"+(i+1)+": "+String.valueOf(tempCase));
	}
      
    
      Path file = Paths.get("output.txt");
      Files.write(file, outList, Charset.forName("UTF-8"));
   }
}
