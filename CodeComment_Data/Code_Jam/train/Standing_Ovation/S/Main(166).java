package methodEmbedding.Standing_Ovation.S.LYD495;


import java.io.*;
import java.util.ArrayList;

/**
 * QR1 - Standing Ovation
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        int MaxCase = 0;
        int NumOfMaxShyness = 0;
        char[] Audience = null;


        FileOutputStream fos = new FileOutputStream("A-small-attempt0.out");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));

        FileInputStream fis = new FileInputStream("A-small-attempt0.in");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader(isr);

        String line = reader.readLine(); // read first line

        MaxCase = Integer.parseInt(line);

        for(int caseIndex = 1; caseIndex <= MaxCase ; caseIndex++ ) {
            line = reader.readLine();

            String[] splits =line.split(" ");
            NumOfMaxShyness = Integer.parseInt(splits[0]);
            Audience = splits[1].toCharArray();

            int NumOfAdditionalAudiance = 0;
            int sumOfAudiance = 0;

            for(int i = 0; i < Audience.length ; i++ ) {
                int parsed = Character.getNumericValue(Audience[i]);
                int differ = i - sumOfAudiance;
                if(differ > 0) {
                    NumOfAdditionalAudiance += differ;
                    sumOfAudiance += differ;
                }

                sumOfAudiance += parsed;
            }

            String out = String.format("Case #%d: %d\n", caseIndex, NumOfAdditionalAudiance);

            System.out.printf(out);
            writer.write(out);
        }

        reader.close();
        writer.close();
    }
}
