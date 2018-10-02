package methodEmbedding.Magic_Trick.S.LYD699;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MagicTrick
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis=new FileInputStream("A-small-attempt3.in");
        DataInputStream dis=new DataInputStream(fis);
        BufferedReader br=new BufferedReader(new InputStreamReader(dis));
        FileWriter fos=new FileWriter("Output.in");
        PrintWriter pw=new PrintWriter(fos);
        int cards[][]=new int[4][4],cards1[][]=new int[4][4];
        int test=Integer.parseInt(br.readLine());
        int x=0;
        while(test--!=0)
        {
            x++;
            int ans1=Integer.parseInt(br.readLine());
            String temp[];
            for(int i=0;i<4;i++)
            {
                temp=br.readLine().split(" ");
                for(int j=0;j<4;j++)
                {
                    cards[i][j]=Integer.parseInt(temp[j]);
                }
            }
            int ans2=Integer.parseInt(br.readLine());
            for(int i=0;i<4;i++)
            {
                temp=br.readLine().split(" ");
                for(int j=0;j<4;j++)
                {
                    cards1[i][j]=Integer.parseInt(temp[j]);
                }
            }
            int count=0,result=0;
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    if(cards[ans1-1][i]==cards1[ans2-1][j])
                    {
                        count++;
                        result=cards[ans1-1][i];
                    }
                }
            }
            //System.out.println("count="+count);
            if(count==1)
                pw.println("Case #"+x+": "+result);
            else if(count>1)
                pw.println("Case #"+x+": "+"Bad magician!");
            else
                pw.println("Case #"+x+": "+"Volunteer cheated!");
        }
        fis.close();dis.close();br.close();fos.close();pw.close();


    }

}
