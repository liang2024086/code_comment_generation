package methodEmbedding.Magic_Trick.S.LYD243;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CodeJam2014Q1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("A-small.in")));
            PrintWriter pw = new PrintWriter(new FileOutputStream("A-small.out"));
            //BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("A-large.in")));
            //PrintWriter pw = new PrintWriter(new FileOutputStream("A-large.out"));
            String line = br.readLine();
            int T = Integer.parseInt(line);
            int first[][] = new int[4][4];
            int second[][] = new int[4][4];
            for (int i = 0; i < T; i++) {
                System.out.println((i + 1) + " / " + T + "...");

                line = br.readLine();
                String[] values = line.split(" ");
                int firstLine = Integer.parseInt(values[0]);
                System.out.println(firstLine);
                for (int j = 0; j < 4; j++) {
                    line = br.readLine();
                    System.out.println(line);
                    values = line.split(" ");
                    for (int k = 0; k < 4; k++) {
                        first[j][k] = Integer.parseInt(values[k]);
                    }
                }
                line = br.readLine();
                values = line.split(" ");
                int secondLine = Integer.parseInt(values[0]);
                System.out.println(secondLine);
                for (int j = 0; j < 4; j++) {
                    line = br.readLine();
                    System.out.println(line);
                    values = line.split(" ");
                    for (int k = 0; k < 4; k++) {
                        second[j][k] = Integer.parseInt(values[k]);
                    }
                }

                Set<Integer> firstSet = new HashSet<Integer>();
                Set<Integer> secondSet = new HashSet<Integer>();

                for (int j = 0; j < 4; j++) {
                    firstSet.add(first[firstLine - 1][j]);
                    secondSet.add(second[secondLine - 1][j]);
                }
                firstSet.retainAll(secondSet);
                String result;
                if (firstSet.isEmpty()) {
                    result = "Volunteer cheated!";
                } else if (firstSet.size() > 1) {
                    result = "Bad magician!";
                } else {
                    result = String.valueOf(firstSet.toArray()[0]);
                }

                pw.println("Case #" + (i + 1) + ": " + result);
            }
            pw.close();
            System.out.println("DONE");
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
