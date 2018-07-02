package methodEmbedding.Cookie_Clicker_Alpha.S.LYD602;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream(args[0]);
            DataInputStream inputData = new DataInputStream(inputFile);
            BufferedReader readData = new BufferedReader(new InputStreamReader(inputData));
            PrintWriter pw = new PrintWriter(args[1], "UTF-8");
            NumberFormat formatter = new DecimalFormat("#0.0000000");


            int totalCase = Integer.parseInt(readData.readLine());

            for (int i = 1; i <= totalCase; i++) {
                String line = readData.readLine();
                String tokens [] = line.split("\\s+");
                double c = Double.parseDouble(tokens[0]);
                double f = Double.parseDouble(tokens[1]);
                double x = Double.parseDouble(tokens[2]);
                double currentTime = 0.0;
                double cookieMultiplier = 2.0;

                while (true) {
                    if ((x / cookieMultiplier) >= (c / cookieMultiplier) + (x / (cookieMultiplier + f))) {
                        currentTime += (c / cookieMultiplier);
                        cookieMultiplier += f;
                    }

                    else {
                        currentTime += (x / cookieMultiplier);
                        break;
                    }
                }

                pw.println("Case #" + i + ": " + formatter.format(currentTime));

                if (i == totalCase) {
                    pw.close();
                    readData.close();
                }
            }



        }

        catch (IOException e) {

        }
    }
}
