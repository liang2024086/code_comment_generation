package methodEmbedding.Magic_Trick.S.LYD1390;

import java.io.*;
class magic_trick
{
    public static void main(String args[])throws IOException
    {
        try
        {
            InputStreamReader ir= new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(ir);
            int t=Integer.parseInt(br.readLine());
            int tt=1;
            while(tt!=(t+1))
            {
                int a[]=new int[8];
                int k=0;
                for(int l=0;l<2;l++)
                {
                    int a1=Integer.parseInt(br.readLine());
                    for(int i=0;i<4;i++)
                    {
                        if((i+1)==a1)
                        {
                            String x=br.readLine();
                            x=x.trim();
                            x=x+" ";
                            int len=x.length();
                            String str[]=new String[4];
                            int kk=0,m=0,p;
                            for(p=0;p<len;p++)
                            {
                                char ch=x.charAt(p);
                                if(ch==32)
                                {
                                    str[kk]=x.substring(m,p);
                                    kk++;
                                    m=p+1;
                                }
                            }
                            if(k==0)
                            {for(;k<4;k++)
                                {
                                    a[k]=Integer.parseInt(str[k]);
                                }
                                k=4;
                            }
                            else
                            {
                                for(;k<8;k++)
                                {
                                    a[k]=Integer.parseInt(str[k-4]);
                                }
                            }
                        }
                        else
                        {
                            String y=br.readLine();
                        }
                    }
                }
                int cc=0;int tmp=0;
                for(int i=0;i<4;i++)
                {
                    int c=a[i];
                    for(int j=4;j<8;j++)
                    {
                        if(c==a[j])
                        {
                            cc++;
                            tmp=a[j];
                        }
                    }
                }
                if(cc==0)
                {
                    System.out.println("Case #"+tt+": Volunteer cheated!");
                }
                else if(cc==1)
                {
                    System.out.println("Case #"+tt+": "+tmp);
                }
                else if(cc>1)
                {
                    System.out.println("Case #"+tt+": Bad magician!");
                }
                tt++;
            }
        }
        catch(Exception e)
        {}
    }
}
