package methodEmbedding.Counting_Sheep.S.LYD384;

import java.io.*;
import java.util.*;
import java.math.*;

class Solution {
    

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String line = br.readLine();
        int t=Integer.parseInt(line);
        int flag=0;
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        
        for(int m=1;m<=t;m++)
        {
            line = br.readLine();
            int n=Integer.parseInt(line);
            int a[]=new int[10];
            int j=0;
            flag=0;
            while(flag==0)
            {
                flag=1;

                if(n==0)
                {
                    writer.printf("CASE #%d: INSOMNIA\n", m);
                    break;               
                }

                for(int i=0;i<10;i++)
                    if(a[i]==0)
                        flag=0;

                
                int k;
                
                if(flag==0)
                {
                    k=(j+1)*n;
                    while(k!=0)
                    {
                        a[k%10]++;
                        k=k/10;
                    }
                    j++;
                }
                
            }
            if(n!=0)
                writer.printf("CASE #%d: %d\n", m,j*n);

            
        }
        
        writer.close();
    }
}
