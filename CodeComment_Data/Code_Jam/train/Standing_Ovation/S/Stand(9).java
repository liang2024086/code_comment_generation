package methodEmbedding.Standing_Ovation.S.LYD1809;


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
            String sarr[]=br.readLine().split(" ");
            int smax=Integer.parseInt(sarr[0]);
            String s=sarr[1];
            int counter=0,frnd=0;
            for(int i=0;i<s.length();i++)
            {
                int val=Integer.parseInt(s.charAt(i)+"");
                int avail=counter+frnd;
                if(avail<i && val!=0)
                {
                   frnd+=i-(avail); 
                }
                counter+=val;
            }
            out.println("Case #"+(t-test)+": "+frnd);
        }
        out.flush();
        out.close();
    }
}
