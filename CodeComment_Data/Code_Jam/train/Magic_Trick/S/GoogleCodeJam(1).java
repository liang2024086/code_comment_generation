package methodEmbedding.Magic_Trick.S.LYD1500;

import java.io.*;

/**
 * Created by dell on 12/4/14.
 */
public class GoogleCodeJam {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("a = " + a);
        String str = "C:\\Users\\dell\\Desktop\\A-small-attempt0.in";
        String wr = "C:\\Users\\dell\\Desktop\\output.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        int n = 0;
        File file = new File(str);
        File w = new File(wr);
        try {
            reader = new BufferedReader(new FileReader(file));
            writer = new BufferedWriter(new FileWriter(w));
            String line = reader.readLine();
//            if (!line.isEmpty()) {
            n = Integer.parseInt(line);
//            }
            int i = 0;
            while (i < n) {
                line = reader.readLine();
                int n1 = Integer.parseInt(line);
                n1--;
                int m1[][] = new int[4][4];
                for (int r = 0; r < 4; r++) {
                    line = reader.readLine();
                    String[] split = line.split(" ");
                    int c = 0;
                    for (String s : split) {
                        m1[r][c] = Integer.parseInt(s);
                        c++;
                    }
                }
                line = reader.readLine();
                int n2 = Integer.parseInt(line);
                n2--;
                int m2[][] = new int[4][4];
                for (int r = 0; r < 4; r++) {
                    line = reader.readLine();
                    String[] split = line.split(" ");
                    int c = 0;
                    for (String s : split) {
                        m2[r][c] = Integer.parseInt(s);
                        c++;
                    }
                }
                int count = 0;
                int z = 0;
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (m1[n1][j] == m2[n2][k]) {
                            count++;
                            z = m1[n1][j];
                        }
                    }
                }
                String o;
                if (count == 0)
                    o = "Case #" + (i+1) + ": Volunteer cheated!";
                else if (count == 1)
                    o = "Case #" + (i+1) + ": " + z;
                else
                    o = "Case #" + (i+1) + ": Bad magician!";
                writer.write(o);
                writer.newLine();
                System.out.println("file = " + file);
                System.out.println("o = " + o);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
