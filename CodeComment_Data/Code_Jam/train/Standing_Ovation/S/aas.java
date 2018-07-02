package methodEmbedding.Standing_Ovation.S.LYD1905;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author vyz
 */
public class StandingOvation {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        String line,val;
        StringTokenizer st;
        int count=0,smax,digit,need=0,have=0,arc=0,got,index=1;
        char[] arr;
        //int[] havear=new int[11009];
        int[] ar;
        PrintWriter writer = new PrintWriter("/media/vyz/B2B27BF7B27BBE83/output2.txt", "UTF-8");
        BufferedReader br=new BufferedReader(new FileReader("/media/vyz/B2B27BF7B27BBE83/A-small-attempt0.in"));
        while((line=br.readLine())!=null){
            st=new StringTokenizer(line," ");
            ++count;
            while(st.hasMoreElements() && count!=1)
            {
                smax=Integer.parseInt(st.nextToken());
                val=st.nextToken();
                ar=new int[val.length()];
                //arr=st.nextToken().toCharArray();
                for (int i = 0; i < ar.length; i++){
                    ar[i] = val.charAt(i) - '0';}
              
                
    
                have=ar[0];
               for(int i=1;i<ar.length;i++)
                {
                    got=0;
                    if(i>have){got=i-have; need+=got;}
                    
                    have+=ar[i]+got;
                  
                }
  
               writer.println("Test Case #"+index+": "+need);
               ++index;
               need=0;
               
                
                
                
               
            }
            
            
            
        }
        writer.close();
       /* for(int i=0;i<11009;i++)
        {
            System.out.println("Test Case #"+i+": "+havear[i]);
        }
      */
    }    
}

