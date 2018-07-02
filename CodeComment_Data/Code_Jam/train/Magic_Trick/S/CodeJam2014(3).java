package methodEmbedding.Magic_Trick.S.LYD1514;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
/**
 *
 * @author Akash_Mahajan
 */
class CodeJam2014
 {
  
    public static void main(String[] args) throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a[][] = new int[4][4];
    int b[][] = new int[4][4];
    int saved2[] = new int[4];
    int testcases = Integer.parseInt(br.readLine());
    int n1,n2;
    for(int test=1;test<=testcases;test++)
    {
      n1 = Integer.parseInt(br.readLine());  
      n1--;
      for(int i=0;i<4;i++)
      {
          StringTokenizer st = new StringTokenizer(br.readLine()," ");
          for(int k=0;k<4;k++)
              a[i][k]=Integer.parseInt(st.nextToken());
      }
      n2 = Integer.parseInt(br.readLine());
      n2--;
      for(int i=0;i<4;i++)
      {
           StringTokenizer st  = new StringTokenizer(br.readLine()," ");
            for(int k=0;k<4;k++)
                b[i][k]= Integer.parseInt(st.nextToken());
      }
       int count=0;
       int val=0;
      for(int i=0;i<4;i++)
      {
          int temp = a[n1][i];
          for(int j=0;j<4;j++)
          {
              if(temp==b[n2][j])
              {
                  count++;
                  val = temp;
              }
          }
      }
      if(count==0)
          System.out.println("Case #"+test+": Volunteer cheated!");
      else if(count==1)
          System.out.println("Case #"+test+": "+val);
      else if(count>1)
          System.out.println("Case #"+test+": Bad magician!");
     
    }
    }

}
