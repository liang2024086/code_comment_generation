package methodEmbedding.Cookie_Clicker_Alpha.S.LYD534;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.StringTokenizer;

public class CookieClickerAlpha
{

    public static void main(String[] args) throws IOException
    {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("B-small-attempt1.in"));
        FileWriter fileWriter = new FileWriter("B-small-attempt.out");
        double C_FarmPrice;
        double F_FarmProductionRate;
        double X_CookiesRequired;

        long startTime = System.currentTimeMillis();
        int testCases = new Integer(bufferedReader.readLine());
        for (int cases = 0; cases < testCases; ++cases) {
            double productionRate = 2.0;

            double secondSpend = 0;
            // Reading the Inputs
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            C_FarmPrice = new Double(stringTokenizer.nextToken());
            F_FarmProductionRate = new Double(stringTokenizer.nextToken());
            X_CookiesRequired = new Double(stringTokenizer.nextToken());

            double lowestPossibleTime = X_CookiesRequired/productionRate;

            do {
                
                double timeToCompletion = X_CookiesRequired/productionRate;
                double timeToNextFarm = C_FarmPrice/productionRate;
                                
                if (lowestPossibleTime >= secondSpend + timeToCompletion) {
                    lowestPossibleTime = secondSpend + timeToCompletion;
                } else {
                    secondSpend = lowestPossibleTime;
                    break;
                }
                
                if (timeToCompletion > timeToNextFarm) {
                    //Buy a Farm
                    secondSpend += timeToNextFarm;
                    productionRate += F_FarmProductionRate;
                } else {
                    secondSpend += timeToCompletion;
                }
                 
                if (secondSpend >= lowestPossibleTime) {
                    break;
                }
                
            }while (true);
            
            NumberFormat formatter = new DecimalFormat("#.#######");
            String timeSpend = formatter.format(lowestPossibleTime);
            fileWriter.write("Case #" + (cases + 1) + ":" + " " + timeSpend + "\n");
        }

        long endTime = System.currentTimeMillis();

        long millisTaken = endTime - startTime;
        long secondsTaken = millisTaken / 1000;
        System.out.println("Time taken for " + testCases + " TestCases is " + secondsTaken + " seconds or "
                + millisTaken + " millis");
        fileWriter.flush();
        fileWriter.close();
        bufferedReader.close();
    }
}
