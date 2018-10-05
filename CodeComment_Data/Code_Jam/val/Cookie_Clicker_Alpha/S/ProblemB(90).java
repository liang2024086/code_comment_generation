package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1470;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ProblemB {

    public static void main(String[] args) throws IOException {
        int T;
        double C;
        double F;
        double X;
        double cookieProduction;
        double time;
        
        FileWriter fw = new FileWriter("outputB.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        Scanner scan = new Scanner(System.in);
        T = scan.nextInt();

        for (int i = 1; i <= T; ++i) {
            C = scan.nextDouble();
            F = scan.nextDouble();
            X = scan.nextDouble();
            cookieProduction = 2.0;
            time = X / cookieProduction;
            double farmTime = 0.0;

            while (true) {
                double addFarm = farmTime + (C / cookieProduction) + (X / (cookieProduction + F));
                if (time < addFarm) {
                    break;
                } else {
                    farmTime += C / cookieProduction;
                    cookieProduction += F;
                    time = addFarm;
                }
            }

            DecimalFormat df = new DecimalFormat("0.0000000");
            String result = df.format(time);
            bw.write("Case #" + i + ": " + result);
            bw.newLine();
            bw.flush();
        }
    }
}
