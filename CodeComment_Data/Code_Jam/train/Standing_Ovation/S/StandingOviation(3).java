package methodEmbedding.Standing_Ovation.S.LYD897;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOviation
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("A-small-attempt1.in"));
        PrintWriter pw = new PrintWriter(new File("A-small-attempt1.out"));
        int x = sc.nextInt();
        for(int i = 1; i <= x; i++)
        {
            int n = sc.nextInt();
            String s = sc.next();
            int res = 0;
            for(int sl = 0; sl <= n; sl++)
            {
                if(sl == 0)
                {
                    if(s.charAt(sl) == '0')
                        res++;
                }
                else
                {
                    int as = 0;
                    for(int j = 0; j < sl; j++)
                    {
                        as += Integer.parseInt(Character.toString(s.charAt(j)));
                    }
                    if(as + res < sl)
                        res += sl - (as + res);
                }
            }
            pw.println("Case #" + i + ": " + res);
        }
        sc.close();
        pw.close();
    }
    
}
