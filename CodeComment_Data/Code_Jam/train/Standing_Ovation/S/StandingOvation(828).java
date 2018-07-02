package methodEmbedding.Standing_Ovation.S.LYD1230;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StandingOvation {

    public static void main(String[] args) {
        int[] s = null;
        int[] val1 = null;
        String express = "[0-9]";

        String str = null;
        int j = 0, count = 0, num = 0, a = 0, numOfCase = 0, sMax = 0, frnd = 0, stndPer, d = 0;
        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\hp\\Downloads\\output.txt");
            FileInputStream fstream = new FileInputStream("C:\\Users\\hp\\Downloads\\A-small-attempt3.in");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                count = 0;
                // Print the content on the console
                if (j == 0) {
                    numOfCase = Integer.parseInt(strLine);
                    j++;
                } else {

                    sMax = Integer.parseInt(strLine.split(" ")[0]) + 1;
                    val1 = new int[sMax];
                    str = strLine.split(" ")[1];

                    Pattern p2 = Pattern.compile(express);
                    Matcher m2 = p2.matcher(str);
                    num = 0;
                    while (m2.find()) {
                        val1[num] = Integer.parseInt(m2.group());
                        num++;
                    }
                    stndPer = 0;
                    frnd = 0;
                    for (int shy = 0; shy < sMax; shy++) {
                        if (shy == 0 && val1[shy] != 0) {
                            stndPer += val1[shy];
                        } else if (val1[shy] != 0 && shy <= stndPer) {
                            stndPer += val1[shy];

                        } else if (val1[shy] != 0 && shy > stndPer) {
                            frnd += (shy - stndPer);
                            stndPer = stndPer + val1[shy] + frnd;
                        }
                    }
                    a = d + 1;
                    writer.println("Case #" + a + ": " + frnd);
                    writer.flush();
                    d++;
                }

            }

            //Close the input stream
            br.close();
        } catch (Exception ex) {
        }
    }
}
