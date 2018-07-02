package methodEmbedding.Magic_Trick.S.LYD605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(reader.readLine().trim());
        int i, j, k, count, value = 0, firstAnswer, secondAnswer;
        int [][] firstMatrix = new int[4][4];
        int [][] secondMatrix = new int[4][4];
        
        for(i=0;i<T;i++)
        {
            firstAnswer = Integer.parseInt(reader.readLine().trim());
            
            for(j=0;j<4;j++)
            {
                String [] list = reader.readLine().trim().split(" ");
                for(k=0;k<4;k++)
                {
                    firstMatrix[j][k] = Integer.parseInt(list[k]);
                }
            }
            
            secondAnswer = Integer.parseInt(reader.readLine().trim());
            
            for(j=0;j<4;j++)
            {
                String [] list = reader.readLine().trim().split(" ");
                for(k=0;k<4;k++)
                {
                    secondMatrix[j][k] = Integer.parseInt(list[k]);
                }
            }
            
            count = 0;
            
            for(k=0;k<4;k++)
            {
                for(j=0;j<4;j++)
                {
                    if(firstMatrix[firstAnswer-1][k]==secondMatrix[secondAnswer-1][j])
                    {
                        count++;
                        value = firstMatrix[firstAnswer-1][k];
                    }
                }
            }
            
            if(count==0)
            {
                System.out.println("Case #" + (i+1) + ": Volunteer cheated!");
            }
            else if(count==1)
            {
                System.out.println("Case #" + (i+1) + ": " + value);
            }
            else
            {
                System.out.println("Case #" + (i+1) + ": Bad magician!");
            }
            
        }
        
    }
}
