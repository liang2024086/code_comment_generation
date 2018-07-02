package methodEmbedding.Standing_Ovation.S.LYD1860;

import java.io.*;
import java.net.URISyntaxException;

public class Main {
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String[] args) throws IOException, URISyntaxException {
        in = new BufferedReader(new FileReader("A-small-attempt0.in"));
        out = new PrintWriter("output.txt", "UTF-8");
        String[] parsedString;
        int testCases = Integer.parseInt(in.readLine());
        char[] shyLevels;
        int shyMax = 0;
        int fNeeded = 0;
        int count = 0;

        for(int curCase=0; curCase<testCases; curCase++) {
            count = 0;
            fNeeded = 0;
            parsedString = in.readLine().split(" ");
            shyMax = Integer.parseInt(parsedString[0]);
            shyLevels = parsedString[1].toCharArray();

            for(int j=0; j<=shyMax; j++){
                if(j>count && shyLevels[j]!='0') {//if number needed is greater than number standing
                    count += fNeeded += j - count; //put in friends to make up the difference
                }
                count += Character.getNumericValue(shyLevels[j]); //now we have this many standing
            }

            out.print("Case #");
            out.print(curCase + 1);
            out.print(": ");
            out.println(fNeeded);
        }

        out.close();
    }
}
