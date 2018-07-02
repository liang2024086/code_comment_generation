package methodEmbedding.Standing_Ovation.S.LYD1843;

import java.io.*;
import java.util.*;

public class ASmall 
{
    
    public static void main(String[] args) throws IOException
    {
        File f=new File("ASmallIn.in");
        Scanner sc=new Scanner(f);
        FileWriter fw=new FileWriter("ASmallOut.in");
        
        int t=sc.nextInt();
        for(int tab=1;tab<=t;tab++)
        {
            int smax=sc.nextInt();
            String s=sc.next();
            int bank=0;
            int add=0;
            
            for(int i=0;i<s.length();i++)
            {
                int number=Integer.parseInt(s.charAt(i)+"");
                
                if(number==1)
                    continue;
                if(number==0&&bank>0)
                {
                    bank--;
                    continue;
                }
                if(number==0&&bank<=0)
                {
                    add++;
                    continue;
                }
                if(number>1)
                {
                    bank+=(number-1);
                }
            }
            
            fw.write("Case #"+tab+": "+add+"\n");
            //System.out.print("Case #"+tab+": "+add+"\n");
        }
        
        fw.close();
    }
    
    
}
