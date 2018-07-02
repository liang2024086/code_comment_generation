package methodEmbedding.Counting_Sheep.S.LYD337;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class GCodeJamQualify {

    
    
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new FileReader("A-small-attempt0.in"));
        PrintStream out = new PrintStream(new FileOutputStream("A-small-attempt0.out"));
        String line="";
        int count = 0;
        boolean sleep = true;
        Map<String,String> numberCount = new HashMap<String,String>();
        for(int i = 0;i<10;i++){
              numberCount.put(String.valueOf(i),"0");
        }
        int basenumber = 0;
        while((line = buff.readLine())!=null){count += 1;
                
            if(count == 1){
                    continue;
                
            }else{
               basenumber = Integer.parseInt(line);
               if(basenumber == 0){
                   out.println("Case #"+(count-1)+": "+"INSOMNIA");
                   continue;
                   
               }else{
                   
                   int plusNumber = 1;
                   int tempVal;
                   String tempValString;
                   int plusVal;
                   
                   while(sleep){
                       tempVal = basenumber * plusNumber;
                       for(int p = 0;p<String.valueOf(tempVal).length();p++){
                           tempValString = String.valueOf(Integer.toString(tempVal).charAt(p));
                           plusVal = Integer.parseInt(numberCount.get(tempValString)) + 1;
                           numberCount.put(String.valueOf(tempValString), String.valueOf(plusVal));
                           
                       }
                       boolean approved = false ;
                       for(int t = 0;t<10;t++){
                           
                           if(Integer.parseInt(numberCount.get(String.valueOf(t))) > 0){
                               approved = true;
                           }else{
                               approved = false;
                               break;
                           }
                       }
                       if(approved){
                           out.println("Case #"+(count-1)+": "+tempVal);
                           for(int i = 0;i<10;i++){
              numberCount.put(String.valueOf(i),"0");
        }
                           break;
                       }else{
                           plusNumber++;
                       }
                   
                   }
               }
        
                
            }//else count
        }
    }
    
}
