package methodEmbedding.Standing_Ovation.S.LYD451;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class gcj{
public static void main(String args[]) throws IOException{
 char cnum = 'u';
 int num = 0;
 int pc = 0;
 String rv = ""; 
    String fileName = "in.txt";
BufferedReader br = new BufferedReader(new FileReader(fileName));
    try {
        StringBuilder sb = new StringBuilder();
       String line = "";
int lc = 1;
int val = 0;
int peeps = 0;
        while (line != null) {   
            line = br.readLine();
            
            if(lc == 1){
                
                
            int tc = Integer.parseInt(line);
            
        }else{
            try{
            
            
         cnum = line.charAt(0);
       num =  Character.getNumericValue(cnum);
       // System.out.println(num);
        
        rv = line.substring(2);
        char[] charArray = rv.toCharArray();

        
        for(int o = 0; o < charArray.length; o++ ){
       val = Character.getNumericValue(charArray[o]);
      peeps += val;
       if(peeps <= o){
        pc++;
        peeps++;
        
        }
    
       
        
        }
       int rlc = lc-1;
        System.out.println("Case #" + ""+ rlc+ ": " + pc );
        //System.out.println(num + " " + rv);
        
    }catch(Exception e){
    
  //  System.out.println(e);
    }
        }
            
           
             lc++;
            pc = 0;
            peeps = 0;
           //System.out.println("--------------------------------------");
        }
       
    } finally {
        br.close();
    }
}





}


