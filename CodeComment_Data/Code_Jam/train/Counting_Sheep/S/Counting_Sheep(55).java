package methodEmbedding.Counting_Sheep.S.LYD1192;

import java.util.*;
import java.io.*;

public class Counting_Sheep
{
    public static void main(String args[])
    {
        try{
            Scanner reader=new Scanner(new File("bb.in"));
            int cases=reader.nextInt();
            for(int x=0;x<cases;x++)
            {

                int N=reader.nextInt();
                int reserve=N;
                System.out.print("Case #"+(x+1)+": ");
                if(N==0)
                {
                    System.out.println("INSOMNIA");
                    continue;
                }
                boolean[]found=new boolean[10];
                for(int q=0;q<10;q++)
                    found[q]=false;

                boolean flag=false;
                for(int runs=0;runs<100;runs++)
                {

                    String s=""+N;
                    for(int q=0;q<s.length();q++)
                    {
                        found[s.charAt(q)-48]=true;

                    }

                    flag=true;
                    for(int q=0;q<10;q++)
                    {
                        flag&=found[q];
                    }
                    if(flag==true)
                        break;
                    N+=reserve;
                }
                if(flag)
                    System.out.println(N);
                else
                    System.out.println("INSOMNIA");

            }
        }        catch(Exception e){System.out.print("this ran");}
    }
}
