package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1076;


import java.io.*;
import java.util.Scanner;

public class CookieClicker {
    static String inputFile = "ProblemB/input.txt";
    static String outputfile = "ProblemB/output.txt";

    public static void main(String[] args) {
        File file = new File(inputFile);
        try {
            Writer writer = new OutputStreamWriter(new FileOutputStream(outputfile), "utf-8");
            Scanner scanner = new Scanner(file);
            int testCasesNr = scanner.nextInt();

            for (int i = 0; i < testCasesNr; i++) {
                int caseNr = i + 1;
                writer.write("Case #" + caseNr + ": ");

                double farmCost = scanner.nextDouble();
                double increaseRate = scanner.nextDouble();
                double desiredCount = scanner.nextDouble();

                double currentCookieRate = 2;
                double currentTime = 0;

                while (true) {
                    double cookieTimeWithoutFarm = desiredCount / currentCookieRate;
                    double cookieTimeWithFarm = (farmCost / currentCookieRate) + desiredCount / (currentCookieRate + increaseRate);

                    if (cookieTimeWithFarm < cookieTimeWithoutFarm) {
                        currentTime = currentTime + farmCost / currentCookieRate;
                        currentCookieRate = currentCookieRate + increaseRate;
                    } else {
                        currentTime = currentTime + desiredCount / currentCookieRate;
                        writer.write(currentTime + "\n");
                        break;
                    }
                }
            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
