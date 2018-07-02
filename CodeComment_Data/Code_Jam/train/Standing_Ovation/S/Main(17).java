package methodEmbedding.Standing_Ovation.S.LYD1092;


import java.io.*;

public class Main {

    public static void main(String[] args) {
        int t_min = 1;
        int t_max = 100;
        int s_min = 0;
        int s_max = 6;
        int s_supermax = 1000;

        try {
            FileInputStream fstream = new FileInputStream("123.in");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int tests = Integer.decode(br.readLine());
            String line;

            for (int i = 0; i < tests; i++) {
                int skolko_nado = 0;
                int sum = 0;
                line = br.readLine();
                String[] arr = line.trim().split(" ");
                int s_top = Integer.parseInt(arr[0]);
                for (int j = 0; j < s_top+1; j++) {
                    int s_current = Integer.parseInt(Character.toString(arr[1].charAt(j)));
                    boolean marker = true;
                    while (marker) {
                        if (j <= sum) {
                            sum += s_current;
                            marker = false;
                        } else {
                            sum++;
                            skolko_nado++;
                        }
                    }
                }

                System.out.println("Case #" + (i + 1) + ": " + skolko_nado);
            }
            br.close();
            in.close();
            fstream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
