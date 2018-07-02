package methodEmbedding.Standing_Ovation.S.LYD2151;

import java.io.*;
class StandingOvation
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        int T = Integer.parseInt(br.readLine());
        for(int x=1;x<=T;x++)
        {
            String temp = br.readLine();
            int Smax = Character.getNumericValue(temp.charAt(0));
            int N[] = new int[Smax+1];
            for(int i=0;i<=Smax;i++)
            {
                N[i] = Character.getNumericValue(temp.charAt(i+2));
            }
            int C;
            if (N[0] == 0)
                C=1;
            else
                C=0;
            for(int k=1;k<=Smax;k++)
            {
                int q = 0;
                for(int j=0;j<k;j++)
                {
                    q=q+N[j];
                }
                q=q+C;
                if(q<k)
                    C=C+(k-q);
            }
            pw.println("Case #"+x+": "+C);
 
        }
        pw.close();
        br.close();
    }
}
