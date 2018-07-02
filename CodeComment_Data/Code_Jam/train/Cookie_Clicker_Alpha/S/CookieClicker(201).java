package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1256;

import java.util.*;
import java.io.*;

public class CookieClicker
{
    public static Scanner in;
    public static PrintWriter pw;

    public static void main(String[] args) throws IOException
    {
        in = new Scanner( new File("in.in") ).useLocale(Locale.US);
        pw = new PrintWriter(new File("out.out"));

        int n = in.nextInt(); double c, f, x, r, m;

        for (int i = 0 ; i < n ; i++){

            c = in.nextDouble();

            f = in.nextDouble();

            x = in.nextDouble();
            
            r = 2.0;
            
            m = 0;

            while ( (x/r) > (c/r)+(x/(r+f)) ){
                m += c/r;
                r += f;  
            }
            m += x/r;
            
            pw.println("Case #"+(i+1)+": "+ m);
        }
        in.close();
        pw.close();
    }
}
