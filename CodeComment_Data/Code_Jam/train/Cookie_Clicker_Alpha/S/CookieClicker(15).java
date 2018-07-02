package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1587;


import java.io.*;
import java.util.Scanner;

public class CookieClicker
{
    public static void main(String[] args)
    {
        BufferedWriter writer = null;
        try {
            Scanner scanner = new Scanner(new File("/tmp/input.in"));
            writer = new BufferedWriter(new FileWriter("/tmp/output.txt"));

            int testCases = scanner.nextInt();
            scanner.nextLine();

            for(int i = 1; i <= testCases; i++)
            {
                double c = scanner.nextFloat();
                double f = scanner.nextFloat();
                double x = scanner.nextFloat();
                double production = 2;
                double current = 0;
                double answer = 0;

                if(x/production <= c/production)
                    answer += x/production;
                else
                {
                    answer += x/production;
                    answer = Double.valueOf(String.format("%.7f", answer));
                    while (current <= answer)
                    {
                        current += c/production;
                        current = Double.valueOf(String.format("%.7f",current));
                        production += f;

                        if(current + x/production < answer)
                            answer = current + x/production;
                    }
                }
                writer.write("Case #" + i + ": "+ String.format("%.7f%n", answer));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
