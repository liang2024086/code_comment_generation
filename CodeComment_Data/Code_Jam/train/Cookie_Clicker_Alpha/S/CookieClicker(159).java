package methodEmbedding.Cookie_Clicker_Alpha.S.LYD971;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class CookieClicker {
    public static void main (String[] args) throws IOException
    {
        Scanner in = new Scanner(new BufferedReader(new FileReader("input.in")));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        int cases = Integer.parseInt(in.nextLine());
        for (int i = 1; i<=cases; i++)
        {
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();
            double rate = 2.0;
            double min = x/rate;
            double basetime = 0;
            double time = min;
            while (time+basetime<=min)
            {
                min = time+basetime;
                basetime+=c/rate;
                rate+=f;
                time = x/rate;
            }
            out.printf("Case #%d: %.7f\n", i, min);
            
        }
        out.close();
    }
}
