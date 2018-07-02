package methodEmbedding.Standing_Ovation.S.LYD365;

import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Standing_Ovation {

    public static void main(String[] args) {

        try {
            File file = new File("output.txt");
            FileOutputStream fos = new FileOutputStream(file);
            FileReader fileReader = new FileReader("A-small-attempt1.in");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (bufferedReader.ready())
            {
                int k = Integer.parseInt(bufferedReader.readLine());
                for (int i = 1; i <= k; i++) {
                    int result = 0;
                    //result = Integer.parseInt(bufferedReader.readLine());
                    String[] elements = bufferedReader.readLine().split(" ");
                    int max = Integer.parseInt(elements[0]);
                    String audience = elements[1];

                    int tracking = audience.charAt(0) - '0';
                    for (int j = 1; j < audience.length(); j++) {
                        int temp = audience.charAt(j) - '0';
                        if (temp > 0) {
                            if (j > tracking) {
                                if (j - tracking > result) {
                                    result = j - tracking;
                                }
                            }
                            tracking += temp;
                        }
                    }
                    bw.write("Case #" + i + ": " + result + "\n");
                }
            }
            bw.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }


    }
}
