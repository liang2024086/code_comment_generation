package methodEmbedding.Standing_Ovation.S.LYD2169;

import java.io.*;


public class Main {

    static int noOfTestCases;

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/com/company/input.txt"));
            String line = null;
            int index = 0;
            int credit = 0;
            int noOfItems = 0;
            while ((line = reader.readLine()) != null) {
                if (index == 0) {
                    noOfTestCases = Integer.parseInt(line.toString());
                } else {
                    String s = line.toString();
                    String sp[] = s.split(" ");
                    int maxShy = Integer.parseInt(sp[0]);
                    int ovationSoFar = 0;
                    int audNeeded = 0;

                    for (int i = 0; i <=maxShy; i++) {
                        int currCount = Integer.parseInt(String.valueOf(sp[1].charAt(i)));
                        if((ovationSoFar + audNeeded) < i) {
                            audNeeded += i - (ovationSoFar + audNeeded);
                        }
                        ovationSoFar += currCount;
                    }
                    System.out.println("Case #" + index + ": " + audNeeded);
                }
                ++index;
            }
        } catch (Exception e) {

        }
    }
}
