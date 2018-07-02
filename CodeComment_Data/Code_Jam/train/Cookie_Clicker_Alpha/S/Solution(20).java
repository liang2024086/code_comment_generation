package methodEmbedding.Cookie_Clicker_Alpha.S.LYD24;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by yongwen on 4/12/14.
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try {
            //inputStream = System.in;
            File path = new File("/Users/yongwen/Downloads");
            File file = new File(path, "B-small-attempt0.in");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            Scanner scanner = new Scanner(bufferedReader);

            // Initial the solution class constructor here???
            int  totalLine = 0, cases = 0;
            ArrayList<String> lines = new ArrayList<String>();
            while (scanner.hasNextLine()) {
                // Read the file line by line
                if (totalLine == 0) {
                    cases = Integer.parseInt(scanner.nextLine());
                } else {
                    lines.add(scanner.nextLine());
                }
                totalLine++;
            }
            CookieClickerAlpha cookieClickerAlpha = new CookieClickerAlpha(cases, lines);
            cookieClickerAlpha.run();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) inputStream.close();
                if (inputStreamReader != null) inputStreamReader.close();
                if (bufferedReader != null) bufferedReader.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

}
