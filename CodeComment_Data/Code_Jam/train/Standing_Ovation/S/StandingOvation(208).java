package methodEmbedding.Standing_Ovation.S.LYD52;


import java.io.*;

/**
 * @author Mohsen Shabani
 */
public class StandingOvation {
    public static BufferedReader br;
    public static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        String inputPath = "d:\\A-small-attempt3.in";
        String outputPath = "d:\\A-small-attempt3.out";
        br = new BufferedReader(new FileReader(inputPath));
        bw = new BufferedWriter(new FileWriter(outputPath));

        int tc = Integer.parseInt(br.readLine());
        for (int tCount = 0; tCount < tc; tCount++) {
            String[] line = br.readLine().split(" ");
            long sMin = 0;
            int maxF = 0;
            String str = line[1];

            for (int i = 0; i < str.length(); i++) {
                int item = Integer.parseInt(String.valueOf(str.charAt(i)));
                if (item == 0)
                    continue;
                if (sMin >= i)
                    sMin = sMin + item;
                else {
                    int f = (int) Math.abs(i - sMin);
                    sMin = sMin + f + item;
                    maxF = maxF + f;
                }
            }


            System.out.println(maxF);//todo : for console
            StringBuilder sb = new StringBuilder();
            sb.append("Case #").append(String.valueOf(tCount + 1)).append(": ");
            sb.append(String.valueOf(maxF));
            sb.append("\n");
            bw.write(sb.toString());
        }
        br.close();
        bw.close();
    }


}
