package methodEmbedding.Counting_Sheep.S.LYD1091;

import java.util.*;
import java.io.*;
public class Program_A
{
    public static void main(String filename) throws IOException
    {
        try{
        File inp = new File(filename);
        Scanner file = new Scanner(inp);
        PrintWriter writer = new PrintWriter("output.txt");
        int t = file.nextInt();
        int i=0;
        for(i=0;i<t;i++)
        {
            int n = file.nextInt();
            int k=0,j=1;
            short list[] = new short[10];
            list[0]=-1;
            if(n<1)
            {
                writer.print("Case #"+(i+1)+": INSOMNIA");
                writer.println();
                continue;
            }
            boolean flag= false;
            while (!flag)
            {
                k = n*j;
                j++;
                String s = k+"";
                for(int l = 0; l<s.length();l++)
                {
                    switch(s.charAt(l))
                    {
                        case '0': 
                                list[0]=0;
                                break;
                        case '1': list[1]=1;break;
                        case '2': list[2]=2;break;
                        case '3': list[3]=3;break;
                        case '4': list[4]=4;break;
                        case '5': list[5]=5;break;
                        case '6': list[6]=6;break;
                        case '7': list[7]=7;break;
                        case '8': list[8]=8;break;
                        case '9': list[9]=9;break;
                    }
                }
                flag = true;
                for(int l = 0; l<10;l++)
                {
                    if(list[l]!=l)
                    {
                        flag=false;
                        break;
                    }
                }
            }
            writer.print("Case #"+(i+1)+": "+k);
            writer.println();
        }
        file.close();
        writer.close();
    }
    catch(Exception e)
    {
        System.err.println(e);
    }
    }
}
