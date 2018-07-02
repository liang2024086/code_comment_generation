package methodEmbedding.Magic_Trick.S.LYD1958;


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        BufferedReader r = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Output1.txt"));
        String[] t = r.readLine().split(" ");

        int T = Integer.parseInt(t[0]);

        for (int i = 0; i < T; i++) {
            t = r.readLine().split(" ");
            int N1 = Integer.parseInt(t[0]);

            for (int j = 1; j <= N1; j++) {
                t = r.readLine().split(" ");
            }

            int[] arr1 = new int[4];
            arr1[0] = Integer.parseInt(t[0]);
            arr1[1] = Integer.parseInt(t[1]);
            arr1[2] = Integer.parseInt(t[2]);
            arr1[3] = Integer.parseInt(t[3]);

            for (int j = (N1 + 1); j <= 4; j++) {
                t = r.readLine().split(" ");
            }

            t = r.readLine().split(" ");
            int N2 = Integer.parseInt(t[0]);

            for (int j = 1; j <= N2; j++) {
                t = r.readLine().split(" ");
            }

            int[] arr2 = new int[4];
            arr2[0] = Integer.parseInt(t[0]);
            arr2[1] = Integer.parseInt(t[1]);
            arr2[2] = Integer.parseInt(t[2]);
            arr2[3] = Integer.parseInt(t[3]);

            for (int j = (N2 + 1); j <= 4; j++) {
                t = r.readLine().split(" ");
            }
            List<Integer> l = new ArrayList<Integer>();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (arr1[j] == arr2[k]) {
                        l.add(arr1[j]);
                    }
                }
            }

            if (l.size() == 1) {
                String result = "Case #" + (i + 1) + ": " + l.get(0);
                writer.write(result);
                //   System.out.println(result);
            } else if (l.size() == 0) {
                String result = "Case #" + (i + 1) + ": " + "Volunteer cheated!";
                writer.write(result);
            } else {
                String result = "Case #" + (i + 1) + ": " + "Bad magician!";
                writer.write(result);
            }
            writer.newLine();
        }
        writer.close();
    }
}
