package methodEmbedding.Magic_Trick.S.LYD1615;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Small {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line = in.readLine();

            if (line != null) {
                try {
                    int t = Integer.parseInt(line);

                    for (int i = 0; i < t; i++) {
                        boolean[] flagsQ1 = new boolean[17];
                        boolean[] flagsQ2 = new boolean[17];
                        boolean[] flagsRes = new boolean[17];

                        int q1 = Integer.parseInt(in.readLine());
                        String rowQ1 = null;

                        for (int j = 1; j <= 4; j++) {
                            if (j == q1) {
                                rowQ1 = in.readLine();
                            } else {
                                in.readLine();
                            }
                        }

                        int q2 = Integer.parseInt(in.readLine());
                        String rowQ2 = null;

                        for (int j = 1; j <= 4; j++) {
                            if (j == q2) {
                                rowQ2 = in.readLine();
                            } else {
                                in.readLine();
                            }
                        }

                        for (String row : rowQ1.split("\\s"))
                            flagsQ1[Integer.parseInt(row)] = true;

                        for (String row : rowQ2.split("\\s"))
                            flagsQ2[Integer.parseInt(row)] = true;

                        int count = 0;
                        int number = 0;

                        for (int j = 1; j < 17; j++) {
                            flagsRes[j] = flagsQ1[j] && flagsQ2[j];

                            if (flagsRes[j]) {
                                count++;
                                number = j;
                            }
                        }

                        if (count == 0) {
                            System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
                        } else if (count == 1) {
                            System.out.println("Case #" + (i + 1) + ": " + number);
                        } else {
                            System.out.println("Case #" + (i + 1) + ": Bad magician!");
                        }
                    }
                } catch (NumberFormatException e) {

                }
            }
        } catch (IOException ex) {
        }
    }
}
