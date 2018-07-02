package methodEmbedding.Cookie_Clicker_Alpha.S.LYD403;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by santirami on 4/11/14.
 */
public class CookieClickerAlpha {
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(new File("input.in"));

            File file = new File("output.out");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            int numCases = sc.nextInt();

            for (int i = 0; i<numCases; i++) {
                double c = sc.nextDouble();
                double f = sc.nextDouble();
                double x = sc.nextDouble();

                double soFar = 0f;
                int idx = 0;

                while(c < (x*f)/(2+(idx+1)*f)) {
                    soFar += c/(2+idx*f);
                    idx++;
                }

                soFar += x/(2+idx*f);

                bw.write("Case #" + String.valueOf(i+1) + ": " + soFar  + "\n");
                System.out.println("Case #" + (i + 1) + " done");
            }
            System.out.println("Done");
            bw.close();
        } catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
