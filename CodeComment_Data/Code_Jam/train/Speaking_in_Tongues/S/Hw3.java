package methodEmbedding.Speaking_in_Tongues.S.LYD122;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.table.TableColumn;
  
public class Hw3 {

 
	 
	public static void main(String[] args) throws IOException {
		 //String line, ArrayList<Integer> sTree, 

		 
	      FileReader reader = new FileReader("/Users/leyu/Desktop/C.in");   
	      
	      BufferedReader br = new BufferedReader(reader);   
	      int count = 0;
	      String s0= "";
	      s0=br.readLine();
	      count = Integer.parseInt(s0);
	      
	      String s1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
	      String s2 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
	      String s3 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
	      
	      
	      String t1 = "our language is impossible to understand";
	      String t2 = "there are twenty six factorial possibilities";
	      String t3 = "so it is okay if you want to just give up";
	      

	      Map<Character, Character> tMap = new HashMap<Character, Character>();
	      
	      for(int i=0; i< s1.length(); i++){
	    	  tMap.put(s1.charAt(i), t1.charAt(i));
	      }
	      for(int i=0; i< s2.length(); i++){
	    	  tMap.put(s2.charAt(i), t2.charAt(i));
	      }
	      for(int i=0; i< s3.length(); i++){
	    	  tMap.put(s3.charAt(i), t3.charAt(i));
	      }
	      tMap.put('q', 'z');
	      tMap.put('z', 'q');
	      
	      
	      for(int i=0; i<count; i++){
	    	  s0 = br.readLine();
	    	  System.out.print("Case #"+ (i+1)+ ": ");
	    	  for(int j = 0; j<s0.length(); j++){
	    		  Character key = s0.charAt(j);
	    		  if(tMap.containsKey(key)){
	    			  //s0.charAt(j)
	    			  //s0[j]=tMap.get(key);
	    			  System.out.print(tMap.get(key));
	    		  }
	    		  else{
	    			  System.out.print(s0.charAt(j));
	    		  }
	    	  }
	    	  System.out.println();
	      }
 
	       
	     br.close();   
	     reader.close();   
			
		}


}
