package methodEmbedding.Speaking_in_Tongues.S.LYD581;

import java.util.*;
import java.io.*;
public class Sen
{
    public static void main(String arg[])throws IOException
    {
        FileReader fin=new FileReader(arg[0]);
        FileWriter fout=new FileWriter("Output.txt");
        Scanner src=new Scanner(fin);
        Scanner t1=new Scanner(src.nextLine());
        int cases=(t1.nextInt());
        int no=0;
        String main="abcdefghijklmnopqrstuvwxyz";
        String substitute="yhesocvxduiglbkrztnwjpfmaq";
        String j="";
        while(src.hasNext())
        {
            no++;
            String S=src.nextLine();
            j="";
            for(int i=0;i<S.length();i++)
            {
                char ch=S.charAt(i);
                char ch1;
                if(ch!=' ')
                {int n=main.indexOf(ch);
                 ch1=substitute.charAt(n);}
                else
                {ch1=ch;}
                
                j=j+ch1;
            }
            fout.write("Case #"+no+": "+j+"\n");
        }
        fout.close();
    }
}
