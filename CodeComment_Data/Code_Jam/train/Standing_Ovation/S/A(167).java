package methodEmbedding.Standing_Ovation.S.LYD1475;


import java.io.*;

public class A {
    public static void main(String[] args) throws NumberFormatException,
            IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in), 1024 * 1024 * 2);

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int x = 1; x <= t; x++) {
            String[] line = br.readLine().split(" ");
            int smax = Integer.parseInt(line[0]);

            int raised = 0;
            int added = 0;
            for (int i = 0; i <= smax; i++) {
                char c = line[1].charAt(i);
                int dif = i - raised;
                if (dif > 0) {
                    added += dif;
                    raised += dif;
                }
                raised += (c - '0');
            }
            sb.append("Case #" + x + ": " + added + "\n");
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("ii/outAJam"));
        bw.write(sb.toString());
        bw.close();
        System.out.println(sb.toString());
    }
}
