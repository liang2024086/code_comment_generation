package methodEmbedding.Magic_Trick.S.LYD1989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class magicTrick 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++)
        {
            int ans1,ans2,a[][] = new int[4][4], b[][] = new int[4][4];
            ans1 = Integer.parseInt(br.readLine());
            for(int j=0;j<4;j++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=0;k<4;k++)
                {
                    a[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            ans2 = Integer.parseInt(br.readLine());
            for(int j=0;j<4;j++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=0;k<4;k++)
                {
                    b[j][k] = Integer.parseInt(st.nextToken());
                }
            }           
            int c[] = new int[4], d[] = new int[4];
            for(int j=0;j<4;j++)           
                c[j] = a[ans1-1][j];            
            for(int j=0;j<4;j++)            
                d[j] = b[ans2-1][j];   
            boolean bool[] = new boolean[4];
            for(int j=0;j<4;j++)
                bool[j] = false;
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                {
                    if(c[j] == d[k])
                        bool[j] = true;
                }
            }
            int count = 0,temp = 0;
            for(int j=0;j<4;j++)
            {
                if(bool[j] == true)
                {
                    count++;
                    temp = j;
                }
                   
            }
            if(count == 0)
                System.out.println("Case #"+i+": Volunteer cheated!");
            else if(count == 1)
                System.out.println("Case #"+i+": "+c[temp]);
            else
                System.out.println("Case #"+i+": Bad magician!");
        }      
    }
}
