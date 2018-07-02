package methodEmbedding.Standing_Ovation.S.LYD1123;

import java.io.*;
public class Standing_Ovation
{
     public static void main(String args[])throws IOException
    {
        int testcase,smax=0,result=0,count=0;
        int input[];
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        testcase=Integer.parseInt(in.readLine());
        for(int i=1;i<=testcase;i++)
        {
            String inn[]=in.readLine().split(" ");
            smax=Integer.parseInt(inn[0]);
            input=new int[smax+1];
            for(int j=0;j<smax+1;j++)
            {
                String s=""+inn[1].charAt(j) ;
                input[j]=Integer.parseInt(s);
            }
            for(int j=0;j<smax+1;j++)
            {
                if(j==0) 
                {
                    count+=input[j];
                }
                else{
                if(count>=j)
                {
                    count+=input[j];
                }
                else if(input[j]==0){}
                else
                {
                 result=result+(j-count);
                 count=count+(j-count)+input[j];
                }
                }
            }
                        System.out.println("Case #"+i+": "+result);
            result=0;count=0;
        }
    }
}
