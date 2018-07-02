package methodEmbedding.Magic_Trick.S.LYD606;

import java.io.*;

public class CodeJam1 
{
    public static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String ar[]) throws Exception
    {
        int N = Integer.parseInt(buff.readLine());
        for(int i = 0; i < N; i++)
        {
            int index[][] = new int[2][16];
            int answers[] = new int[2];
            
            for(int j = 0; j < 2; j++)
            {
                answers[j] = Integer.parseInt(buff.readLine());
                String in[];
                int temp;
                for(int k = 0; k < 4; k++)
                {
                    in = buff.readLine().split(" ");
                    for(int l = 0; l < 4; l++)
                    {
                        temp = Integer.parseInt(in[l]);
                        index[j][temp-1] = k;
                    }
                }
            }
            
            int count = 0;
            int answer = 0;
            
            for(int m = 0; m < 16; m++)
            {
                if((index[0][m] == answers[0]-1) && (index[1][m] == answers[1]-1))
                {
                    count++;
                    answer = m+1;
                }
            }
            
            if(count == 0)
            {
                wr.write("Case #" + (i+1) + ": Volunteer cheated!");
            }
            if(count == 1)
            {
                wr.write("Case #" + (i+1) + ": " + answer);
            }
            if(count > 1)
            {
                wr.write("Case #" + (i+1) + ": Bad magician!");
            }
            wr.newLine();
        }
        wr.flush();
    }
}
