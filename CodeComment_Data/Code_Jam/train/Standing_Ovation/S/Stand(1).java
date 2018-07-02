package methodEmbedding.Standing_Ovation.S.LYD1083;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Stand {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int test=Integer.parseInt(br.readLine());
        int t=test;
        while(test-->0)
        {
            String s[]=br.readLine().split(" ");
            int smax=Integer.parseInt(s[0]);
            String str=s[1];
            int count=0,ans=0;
            for(int i=0;i<str.length();i++)
            {
                int temp=Integer.parseInt(str.charAt(i)+"");
                if(count+ans<i && temp!=0)
                {
                   ans+=i-(count+ans); 
                }
                count+=temp;
            }
            out.println("Case #"+(t-test)+": "+ans);
        }
        out.flush();
        out.close();
    }
}
