package methodEmbedding.Speaking_in_Tongues.S.LYD1077;


import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import javassist.bytecode.Descriptor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
public class SpeakingOfTongue {
      public static void main(String args[])throws IOException{
          String str1="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
          String str2="our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
          TreeMap map = new TreeMap();
          for(int i=0;i<str1.length();i++){
              String temp1 = str1.substring(i,i+1);
              String temp2 = str2.substring(i, i+1);
              map.put(temp1,temp2);
            }
          map.put("q","z");
          map.put("z","q");
       Iterator iter=  map.keySet().iterator();
          while(iter.hasNext()){
              String mapkey=(String)iter.next();
              System.out.println(mapkey +" : "+(String)map.get(mapkey));
          }
                FileReader reader = new FileReader("D:\\NetBeansProjects\\DBInteractionWithWS\\src\\java\\A-small-attempt5.in");
		BufferedReader br = new BufferedReader(reader);
		File file = new File("d:\\rloutput.txt");
		FileWriter fw = new FileWriter(file);
		int count = Integer.parseInt(br.readLine());
		for(int s=0;s<count;s++){
                       String text = br.readLine();
                       String result="";
                       for(int j=0;j<text.length();j++){
                           String translate = text.substring(j,j+1);
                           result +=map.get(translate);
                       
                       }
                       System.out.println("Case #"+(s+1)+": " +result);
                }
      }
    
}
