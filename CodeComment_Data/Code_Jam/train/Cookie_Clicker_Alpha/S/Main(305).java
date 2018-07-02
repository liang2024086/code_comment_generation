package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1509;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by tim on 13.04.14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.UK);
        Scanner in = new Scanner(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        int countTest = in.nextInt();
        for (int i = 0; i < countTest; i++){
            double C = in.nextDouble();
            double F = in.nextDouble();
            double X = in.nextDouble();
            double currentTime = 0;
            double minTime = X/2;
            double currentCPS = 2;
            while (true){
                double timeBuyFerm = C/currentCPS;
                currentTime += timeBuyFerm;
                currentCPS += F;
                double timeByCountFerm = currentTime + X/currentCPS;
                if (minTime > timeByCountFerm)
                    minTime = timeByCountFerm;
                if (currentTime > minTime)
                    break;
            }
            out.println("Case #"+(i+1)+": "+minTime);
        }
        out.close();
        in.close();
    }
}
