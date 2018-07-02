package methodEmbedding.Speaking_in_Tongues.S.LYD190;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author KAMIKATAZ
 */
public class first {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String a="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String b="our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
        char c[]=new char[27]; 
        Map<String,String> map1 = new HashMap<String,String>();
	Map<String,String> map2 = new HashMap<String,String>();
        String d ="ejp mysljylc kd kxveddknmc re jsicpdrysi";
        
        for (int i=0;i<a.length();i++)
        {
        
            if (a.charAt(i)!=' '){
            //System.out.println(a.charAt(i)+"="+b.charAt(i));
            map1.put(Character.toString(a.charAt(i)), Character.toString(b.charAt(i)));
            map2.put(Character.toString(a.charAt(i)), Character.toString(b.charAt(i)));
            }
            }
        
        for (Object key: map1.keySet()) {
        	//System.out.println("Key : " + key.toString() 	+ " Value : " + map1.get(key));
               
                
        }
         map1.put(" ", " ");
        map2.put(" ", " ");
       
        
        
        map1.put("q", "q");
        map1.put("z", "z");
        
        
        map2.put("q", "z");
        map2.put("z", "q");
        
        
      
        
        
        
        
        
        
        
        try{
  
  FileInputStream fstream = new FileInputStream("C:\\Users\\KAMIKATAZ\\Desktop\\aaaaaaaaaaaaaaaaaaaaaaaa\\input.in");
  
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  
  
  
  
  
  BufferedWriter out1 = new BufferedWriter(new FileWriter("C:\\Users\\KAMIKATAZ\\Desktop\\aaaaaaaaaaaaaaaaaaaaaaaa\\out1.ou", true));
  BufferedWriter out2 = new BufferedWriter(new FileWriter("C:\\Users\\KAMIKATAZ\\Desktop\\aaaaaaaaaaaaaaaaaaaaaaaa\\out2.ou", true));
    
  
  
  
  
  
  
  
  
  
  String times=br.readLine();
  System.out.println(times);
  int n =Integer.valueOf(times);
  System.out.println(n);
  System.out.println("number of test cases : " + n);
  System.out.println(times);
  
  int currentCase=0;
  String tmp1="";
  String tmp2="";
  
  
  while ((strLine = br.readLine()) != null)   {
      
      ++currentCase;
      
      out1.write("Case #"+currentCase+": ");
      out2.write("Case #"+currentCase+": ");
      //System.out.println(strLine);
      for (int i=0;i<strLine.length();i++){
            
          tmp1 =map1.get(Character.toString(strLine.charAt(i)));
           System.out.print(tmp1);
            
            out1.write(tmp1);
            
           tmp2 = map2.get(Character.toString(strLine.charAt(i)));
           System.out.print(tmp2);
           
         out2.write(tmp2);
            
            
            
        }
      out1.newLine();
      out1.flush();
      out2.newLine();
      out2.flush();
      
      
      
      
  }
  //Close the input stream
  in.close();
  out1.close();
  out2.close();
    }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage() +"   "+e);
  }
  
        
        
        
        
        
        
        
        
        
        
        
    }
}

