package methodEmbedding.Revenge_of_the_Pancakes.S.LYD9;

import java.io.*;
class pancake
{
    public static void main(String args[])throws IOException
    {
        int t,i,j,l,c=0;
        String s[];
        char ch,chr;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("enter no of test cases");
        t=Integer.parseInt(br.readLine());
        s=new String[t];
        for(i=0;i<t;i++)
        {
            s[i]=br.readLine();
        }
        for(i=0;i<t;i++)
        {
            l=s[i].length();
            for(j=0;j<l-1;j++)
            {
                ch=s[i].charAt(j);
                if(ch!=s[i].charAt(j+1))
                c++;
            }
            if(s[i].charAt(l-1)=='-')
            c++;
            System.out.println("Case #"+(i+1)+": "+c);
            c=0;
        }
    }
}
