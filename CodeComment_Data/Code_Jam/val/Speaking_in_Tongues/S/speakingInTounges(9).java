package methodEmbedding.Speaking_in_Tongues.S.LYD1583;


/*
ID: codeKNIGHT
LANG: JAVA
TASK: 
*/
import java.util.*;
import java.math.*;
import java.io.*;
class speakingInTounges
{
    public static void main(String args[])throws IOException
    {
        //Scanner in=new Scanner(System.in);
        Scanner in=new Scanner(new FileReader("C:\\Users\\Lokesh\\Desktop\\input.txt"));
        //PrintWriter out=new PrintWriter(System.out);
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Lokesh\\Desktop\\A-small-attempt1.in"));
        PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("E:\\programss\\GCJ\\output.txt")));
        int test=Integer.parseInt(br.readLine()),t,i;
        String s;
        char a[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b',
            'k','r','z','t','n','w','j','p','f','m','a','q'};
        //in.useDelimiter("\n");   
        for(t=0;t<test;t++)
        {
            s=br.readLine();
            String res="";
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                res+=" ";
                else
                res+=a[s.charAt(i)-'a'];
                //System.out.println(res);
            }
            out.println("Case #"+(t+1)+": "+res);
        }

        out.flush();
        System.exit(0);
    } 
}
