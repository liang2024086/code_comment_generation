package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1199;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class CookieClickerAlpha
{
    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(new FileInputStream("B-small-attempt2-in.txt"));
            Formatter output = new Formatter("B-small-attempt2-out.txt");

            int T = input.nextInt();
            double C;
            double F;
            double X;
            
            double y = 0.0;
            double prodRate = 2.0;
            double yNew = 0.0;
            
            for (int i = 0; i<T; i++)
            {
                C = Double.parseDouble(input.next());
                F = Double.parseDouble(input.next());
                X = Double.parseDouble(input.next());
                y = 0.0;
                prodRate = 2.0;
                yNew = 0.0;
                double hulp = y+C/prodRate;
                y+=X/prodRate;
                prodRate+=F;
                yNew=hulp+X/prodRate;
                while (y > yNew)
                {
                    y=yNew;
                    hulp+=C/prodRate;
                    prodRate+=F;
                    yNew=hulp+X/prodRate;
                }
                output.format("Case #%d: %s \n", i+1, y);
            }
            if (output != null && input != null)
            {
                output.close();
                input.close();
            }
            
        } catch (FileNotFoundException ex)
        {
            System.err.println("An error has occured.");
            System.exit(1);
        }
    }   
}
