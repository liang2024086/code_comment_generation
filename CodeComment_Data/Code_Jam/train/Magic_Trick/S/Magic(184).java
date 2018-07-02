package methodEmbedding.Magic_Trick.S.LYD75;

import java.io.*;
import java.util.*;
class Magic
{
    static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new FileReader("input.in"));
        Scanner read=new Scanner(new File("input.in"));
        StringTokenizer st;
        BufferedWriter bw=new BufferedWriter(new FileWriter("output.out"));
        int t=Integer.parseInt(br.readLine());
        int i,j,k,c=0,n1,n2,n=0;
        int a1[][]=new int[4][4];
        int a2[][]=new int[4][4];
        for(i=0;i<t;i++)
        {
            c=0;
            n1=Integer.parseInt(br.readLine());
            for(j=0;j<4;j++)
            {
                st=new StringTokenizer(br.readLine());
                for(k=0;k<4;k++)
                {
                    a1[j][k]=Integer.parseInt(st.nextToken());
                }
            }
            n2=Integer.parseInt(br.readLine());
            for(j=0;j<4;j++)
            {
                st=new StringTokenizer(br.readLine());
                for(k=0;k<4;k++)
                {
                    a2[j][k]=Integer.parseInt(st.nextToken());
                }
            }
            for(j=0;j<4;j++)
            {
                for(k=0;k<4;k++)
                {
                    if(a1[n1-1][j]==a2[n2-1][k])
                    {
                        c++;
                        n=a1[n1-1][j];
                        continue;
                    }
                }
            }
            if(c==0)
            bw.write("Case #"+(i+1)+": Volunteer cheated!\n");
            else if(c==1)
            bw.write("Case #"+(i+1)+": "+n+"\n");
            else
            bw.write("Case #"+(i+1)+": Bad magician!\n");
        }
        br.close();
        bw.close();
    }
}
