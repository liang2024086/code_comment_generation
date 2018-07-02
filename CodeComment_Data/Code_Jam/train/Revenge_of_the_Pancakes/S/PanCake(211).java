package methodEmbedding.Revenge_of_the_Pancakes.S.LYD557;

import java.util.*;
import java.io.*;
public class PanCake
{
    public static void main(String[] args) throws Exception
        
    {
        FileReader in=new FileReader("K:/Varsity Essentials & All/Java exercise files/Coder jam/B-small-attempt0.in");
        Scanner kc=new Scanner(in);
        String fileName = "K:/Varsity Essentials & All/Java exercise files/Coder jam/test1.txt";
        File f = new File (fileName);
        PrintWriter pw = new PrintWriter (f);
        String s="",str;
        int cnt;
        int t=kc.nextInt();
        
        for(int i=1;i<=t;i++)
        {
            cnt=0;
            s=kc.next();
            char [] ar=s.toCharArray();
            
            for(int c=0;c<ar.length-1;c++)
            {
                if(ar[c]!=ar[c+1])
                {
                    for(int k=0;k<=c;k++)
                    {
                        if(ar[k]=='-')
                        {
                            ar[k]='+';
                        }
                        else
                        {
                            ar[k]='-';
                        }
                    }
                    cnt++;
                }
                else if(ar[ar.length-1]=='-')
                {
                for(int k=0;k<ar.length;k++)
                    {
                        if(ar[k]=='-')
                        {
                            ar[k]='+';
                        }
                        else
                        {
                            ar[k]='-';
                        }
                    }
                    cnt++;
                }
            }
            if(ar[ar.length-1]=='-')
            {
            for(int k=0;k<ar.length;k++)
                    {
                        if(ar[k]=='-')
                        {
                            ar[k]='+';
                        }
                        else
                        {
                            ar[k]='-';
                        }
                    }
                    cnt++;
            }
            
//            System.out.println(cnt);
            str="Case #"+i+": "+cnt;
            pw.write(str);
            pw.println();
//            for(int c=0;c<ar.length;c++)
//            {
//                System.out.println(ar[c]);
//            }
        }
        pw.close();
    }
}
