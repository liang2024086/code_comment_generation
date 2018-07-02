package methodEmbedding.Speaking_in_Tongues.S.LYD409;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sony
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class SpeakingTounges {
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        
        Map <Character,Character>Language=new HashMap<Character,Character>();
        String s1="ejp mysljylc kd kxveddknmc re jsicpdrysi";
        String s2="rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
        String s3="de kr kd eoya kw aej tysr re ujdr lkgc jv";
        
        String as1="our language is impossible to understand";
        String as2="there are twenty six factorial possibilities";
        String as3="so it is okay if you want to just give up";
        
        for(int i=0;i<s1.length();i++)
            Language.put(s1.charAt(i),as1.charAt(i));
           
        for(int i=0;i<s2.length();i++)
            Language.put(s2.charAt(i),as2.charAt(i));
        
        for(int i=0;i<s3.length();i++)
            Language.put(s3.charAt(i),as3.charAt(i));
   
        //System.out.print(args[0]);
Language.put('q','z');
Language.put('z','q');
  //  System.out.print(Language.values()+"\n");
    //System.out.print(Language.keySet().toString()+"\n");
    
String input=args[0];

BufferedReader br=new BufferedReader(new FileReader(input));
String numberCases=br.readLine();       
    int numCases=Integer.parseInt(numberCases);
    //System.out.print(numCases);
      for(int i=0;i<numCases;i++)
      {    
          
          
          String Line=br.readLine();
          System.out.print("Case #"+(i+1)+": ");
          for(int j=0;j<Line.length();j++)
              System.out.print(Language.get(Line.charAt(j)));
          System.out.print("\n");
      
      
      
      }
    }
    
}
