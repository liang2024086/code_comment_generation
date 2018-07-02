package methodEmbedding.Magic_Trick.S.LYD2025;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Uday Kandpal
 */
public class a {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("a.txt")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("b.txt")));
        int t = Integer.parseInt(br.readLine());
        for (int j = 1; j <= t; j++) {
            int r1 = Integer.parseInt(br.readLine());
            ArrayList<ArrayList<Integer>> a = new ArrayList();
            ArrayList<ArrayList<Integer>> b = new ArrayList();

            String line;
            for (int i = 0; i < 4; i++) {
                line = br.readLine();
                String s[] = line.split(" ");
                ArrayList<Integer> temp = new ArrayList();
                for (String m : s) {
                    temp.add(Integer.parseInt(m));
                }
                a.add(temp);
            }
            int r2 = Integer.parseInt(br.readLine());
            for (int i = 0; i < 4; i++) {
                line = br.readLine();
                String s[] = line.split(" ");
                ArrayList<Integer> temp = new ArrayList();
                for (String m : s) {
                    temp.add(Integer.parseInt(m));
                }
                b.add(temp);
            }
            int count = 0;
            int val[] = new int[4];
            ArrayList<Integer> get = a.get(r1 - 1);
            for (Integer getI : get) {
                if (b.get(r2 - 1).contains(getI)) {
                    val[count++] = getI;
                }
            }
            if (count == 1) {
                String s = "Case #" + j + ": " + val[0] + "\n";
                bw.write(s, 0, s.length());
            } else if (count == 0) {
                String s = "Case #" + j + ": Volunteer cheated!\n";
                bw.write(s, 0, s.length());
            } else {
                String s = "Case #" + j + ": Bad magician!\n";
                bw.write(s, 0, s.length());
            }
        }
        bw.close();
        br.close();

    }
}
