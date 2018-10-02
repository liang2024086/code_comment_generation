package methodEmbedding.Counting_Sheep.S.LYD158;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Codejam {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
    
  
   
        Scanner sys=new Scanner(Paths.get("C:\\Users\\user\\Downloads\\A-small-attempt3.in"));
        PrintWriter writer=new PrintWriter(("output.txt"));
        int T=sys.nextInt();
        for(int i=1;i<T+1;i++)
        {
           int N=sys.nextInt();
        
           List<String> numbers=new ArrayList( Arrays.asList("0", "1", "2","3","4","5","6","7","8","9"));
           List<String> numbers2=new ArrayList();
           if(N==0)
              writer.println("Case #"+i+": INSOMNIA");
           else
           {    int l=1;
               int j=0;
              while(numbers2.size()<10)
              {
                  j=N*l;
                  String x=String.valueOf(j);
                  
                  for(int k=0;k<numbers.size();k++)
                  {
                      if(x.contains(numbers.get(k)) && numbers2.contains(numbers.get(k))==false)
                      {   
                         numbers2.add(numbers.get(k));
                      }
                  }
                  
                  l++;
              }
             writer.println("Case #"+i+": "+j);
           }
        }
        writer.close();
        // TODO code application logic here
        
    }
    
}
