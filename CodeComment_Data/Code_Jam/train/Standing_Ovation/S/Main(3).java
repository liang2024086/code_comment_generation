package methodEmbedding.Standing_Ovation.S.LYD1780;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int t, sMax, invites, numberOfStandings;
        char[] audince;
        File in = new File("A-small-attempt1.in");
        File out = new File("A-small-attempt1.out");
        Scanner scanner = null;
        FileWriter fileWriter;
        try {
            scanner = new Scanner(in);
            fileWriter = new FileWriter(out);
            t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                sMax = scanner.nextInt();
                audince = scanner.next().toCharArray();
                invites = 0;
                numberOfStandings = 0;
                for (int j = 0; j < sMax + 1; j++) {
                    while (j > numberOfStandings) {
                        numberOfStandings++;
                        invites++;
                    }
                    numberOfStandings += Character.getNumericValue(audince[j]);
                }
                String outString = String.format("Case #%d: %d\n", i + 1, invites);
//            System.out.println(String.format("Case #%d: %d", i+1, invites));

                fileWriter.write(outString);
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
