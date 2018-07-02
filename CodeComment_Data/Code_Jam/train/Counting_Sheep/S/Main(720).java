package methodEmbedding.Counting_Sheep.S.LYD1254;

import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws Exception
 
    {
        FileReader in=new FileReader("K:/Varsity Essentials & All/Java exercise files/Coder jam/A-small-attempt1.in");
        Scanner kc=new Scanner(in);
        
        String fileName = "K:/Varsity Essentials & All/Java exercise files/Coder jam/test.txt";
        File f = new File (fileName);
        PrintWriter pw = new PrintWriter (f);
        String s="";
        int num,n;
        int cnt;
        String str;
        boolean b=false;
        int t=kc.nextInt();
        for(int i=1;i<=t;i++)
        { 
            int [] ar=new int[10];
            num=kc.nextInt();
            cnt=1;
            while(true)
            { 
                n=cnt*num;
                s=""+n;
                String [] sAr=s.split("");
                for(int c=0;c<sAr.length;c++)
                {
                    ar[Integer.parseInt(sAr[c])]++;
                }
                for(int c=0;c<ar.length;c++)
                {
                    if(ar[c]>0)
                    {
                        b=true;
                    }
                    else 
                    {
                        b=false;
                        break;
                    }
                }
                if(b==false)
                {
                    cnt++;
                }
                else
                {
                    str="Case #"+i+": "+n;
                    pw.write(str);
                    pw.println();
                    break;
                }
                if(n==(cnt*num))
                {
                    str="Case #"+i+": INSOMNIA";
//                 System.out.println("Case #"+i+" INSOMNIA");
                 pw.write(str);
                 pw.println();
                 break;
                }
            }
        }
        pw.close();
    }
}
