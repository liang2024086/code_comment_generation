package methodEmbedding.Revenge_of_the_Pancakes.S.LYD205;

import java.io.*;
import java.util.*;
import java.math.*;

class Solution {
    

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String line = br.readLine();
        int t=Integer.parseInt(line);
        
        for(int m=1;m<=t;m++)
        {
            line = br.readLine();
            char a[]=line.toCharArray();
            int count =0;
            for(int i=0;i<line.length()-1;i++)
            {
                if(a[i+1]!=a[i])
                    count++;
            }   

            if(a[line.length()-1]=='-')
                count++;

            System.out.printf("CASE #%d: %d\n", m ,count);
        }
    }
}
