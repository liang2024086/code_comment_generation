package methodEmbedding.Standing_Ovation.S.LYD1070;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n=Integer.parseInt(cin.readLine());
        for(int i=1;i<=n;i++)
        {
            String aux[]=cin.readLine().split(" ");
            int sum=0,min=0,t=0;
            char arre[]=aux[1].toCharArray();
            sum+=arre[0]-'0';
            t=arre.length;
            for(int j=1;j<t;j++)
            {
                if(sum<j)
                {
                    min++;
                    sum=j;
                }
                //else
                    sum+=arre[j]-'0';
            }
            out.write("Case #"+i+": "+min+"\n");
        }
        out.flush();
    }
}
