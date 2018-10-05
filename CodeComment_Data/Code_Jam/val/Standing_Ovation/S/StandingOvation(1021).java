package methodEmbedding.Standing_Ovation.S.LYD841;

import java.io.*;

public class StandingOvation{

      public static void  main(String[] args) throws Exception 
      {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           String line = br.readLine();
           int T = Integer.parseInt(line);
           int count[] = new int[T];
           int k,max;
                for(int i = 0; i < T; i++)
                {
                   k = 0;
                   max = 0;
                   line = br.readLine();
                   String s[] = line.split(" ");
                   int n = Integer.parseInt(s[0])+1;
                   String s1[] = s[1].split("");
                   int a[] = new int[n];
                   a[0] = Integer.parseInt(s1[0]);
                   for(int j = 1; j < n ; j++)
                       {
                           a[j] = Integer.parseInt(s1[j]); 
                           k = k + a[j-1];
                           if(k < j)
                           {
                               max++;
                               k++;                               
                           }
                       }
                    count[i] = max;
                
                }
           
         for(int i = 0; i < T; i++){
               k = i+1;
               System.out.println("Case #"+k+": "+count[i]);
          }
      }
}
