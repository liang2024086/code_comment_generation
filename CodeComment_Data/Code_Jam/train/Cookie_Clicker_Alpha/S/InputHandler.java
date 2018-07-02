package methodEmbedding.Cookie_Clicker_Alpha.S.LYD553;

import java.io.*;
import java.util.*;

public class InputHandler {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            String line;

            int caseCount = 1;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                double timeTaken = Clicker.timeTaken(Double.parseDouble(tokens[0]), Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));

                System.out.println("Case #" + caseCount + ": " + timeTaken);
                caseCount++;

            }

        } catch (IOException io) {
            io.printStackTrace();
        }

    }

}
