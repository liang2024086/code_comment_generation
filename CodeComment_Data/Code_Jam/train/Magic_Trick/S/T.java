package methodEmbedding.Magic_Trick.S.LYD742;

import java.util.*;
import java.io.*;

public class T
{
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(new FileReader("A-small-attempt3.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
        String dummy;
        
        String vc = "Volunteer cheated!", bm = "Bad magician!", ans = ":P";
        int ar[][] = new int[4][4];
        int r1,r2;
        
        int cases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cases; i++)
        {
            r1 = sc.nextInt();
            for(int j = 0; j<4; j++)
            {
                for(int k = 0; k<4; k++)
                {
                    ar[j][k] = sc.nextInt();
                }
            }
            String s1 = " " + ar[r1-1][0] + " " + ar[r1-1][1] + " " +ar[r1-1][2] + " " +ar[r1-1][3] + " ";
            
            r2 = sc.nextInt();
            for(int j = 0; j<4; j++)
            {
                for(int k = 0; k<4; k++)
                {
                    ar[j][k] = sc.nextInt();
                }
            }
            
            int in[] = new int[4];
            ans = ":P";
            for(int j = 0; j<4; j++)
            {
                in[j] = s1.indexOf(" " + ar[r2-1][j] + " ");
                if(j == 3 && in[3] == -1 && s1.indexOf(ans) == -1)
                {
                    ans = vc;
                }
                else if(in[j] == -1) continue;
                else
                {
                    if(j!=0 && (!ans.equals(":P")) && in[j]!= -1)
                    {
                        ans = bm; break;
                    }
                    //else if((!ans.equals(":P")) && in[j]!=-1) {ans = bm; break;}
                    else
                    {
                        if(s1.indexOf(ans) != -1) {ans = bm; break;}
                        ans = ar[r2-1][j] + "";
                        System.out.println("Case #" + (i + 1) + ": " + ans);
                    }
                }
            }
            
            pw.print("Case #" + (i + 1) + ": " + ans);
            if(!(i == cases-1))pw.println();
            
        }
        
        pw.flush();
        pw.close();
        sc.close();
    }
}
