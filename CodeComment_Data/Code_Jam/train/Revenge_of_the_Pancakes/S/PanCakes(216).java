package methodEmbedding.Revenge_of_the_Pancakes.S.LYD566;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
import java.awt.*;

public class PanCakes
{
    public static void main(String[] args){
        new PanCakes();
    }

    PanCakes()
    {
        try{
            int TTC=0;
            int index=1;

            File inFile=new File("./A-small.in");
            File outFile=new File("./A-small.out");
            if(outFile.exists())
               outFile.delete();
            boolean bool=outFile.createNewFile();
            RandomAccessFile rac=new RandomAccessFile(inFile,"r");
            TTC=Integer.parseInt(rac.readLine());
            int no;
            String res;
            String str="";
            char[] all;
            while(TTC>0)
            {
                str=rac.readLine();
                res="";
                //trim
                all=str.toCharArray();
                //find non + index from reverse
                int nonPindex=-1;
                for(int i=all.length-1;i>=0;i--)
                  if(all[i]=='-'){
                      nonPindex=i;
                      break;
                  }
                if(nonPindex==-1){
                   res="0";
                }else{
                   char lastChar=all[nonPindex];
                   str=""+lastChar;
                   for(int i=nonPindex-1;i>=0;i--)
                      if(all[i]!=lastChar){
                          lastChar=all[i];
                          str=lastChar+str;
                      }
                   res=""+str.length();
                }
                RandomAccessFile rac2=new RandomAccessFile(outFile,"rw");
                rac2.seek(rac2.length());
                rac2.writeBytes("Case #"+index+": "+res);
                rac2.writeBytes("\r\n");
                rac2.close();
                index++;
                TTC--;
            }
            rac.close();
        }catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
