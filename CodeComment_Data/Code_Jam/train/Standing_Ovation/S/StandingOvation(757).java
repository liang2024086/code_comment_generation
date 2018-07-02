package methodEmbedding.Standing_Ovation.S.LYD855;

import java.io.*;

public class StandingOvation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        String nr = br.readLine();

        int n = Integer.parseInt(nr);
        for (int i = 0; i < n; i++) {
            String[] list1String = br.readLine().split("\\s+");
            int size = Integer.parseInt(list1String[0]);
            int[] a = new int[size + 1];

            int sum = 0, friends = 0;
            for (int j = 0; j < size + 1; j++) {
                a[j] = Character.getNumericValue(list1String[1].charAt(j));
                if (sum < j) {
                    friends += j - sum;
                    sum++;
                }
                sum += a[j];
            }
            bufferedWriter.append(String.format("Case #%d: %d\n", i + 1, friends));
        }
        bufferedWriter.close();
    }
}
