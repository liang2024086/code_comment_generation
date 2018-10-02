package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1230;

// Cookie Clicker Alpha
import java.util.Scanner;
public class ProblemB
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for(int i = 0; i < t; i++)
        {
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();

            double cookiesPerSec = 2.0;
            double time = 0.0;

            while(true)
            {
                double timeToFarmNow = x / cookiesPerSec;
                double timeToFarmAfter = x / (cookiesPerSec + f) + c / cookiesPerSec;

                if(timeToFarmNow < timeToFarmAfter)
                {
                    time += timeToFarmNow;
                    break;
                }
                else
                {
                    time += c / cookiesPerSec;
                    cookiesPerSec += f;
                }
            }

            System.out.printf("Case #%d: %.7f\n", i + 1, time);
        }

        in.close();
    }
}
