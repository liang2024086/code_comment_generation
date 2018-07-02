package methodEmbedding.Magic_Trick.S.LYD1671;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("A-small-attempt3.in"));
        StringTokenizer line;
        FileWriter out = new FileWriter("O1.out");
        int test = Integer.parseInt(br.readLine());
       for (int k = 0; k < test; k++) {
            int t1 = Integer.parseInt(br.readLine());
            int arr1[][] = new int[4][4];
            int arr2[][] = new int[4][4];
            for (int i = 0; i < 4; i++) {
                line = new StringTokenizer(br.readLine());
                for (int j = 0; j < 4; j++) {
                    arr1[i][j] = Integer.parseInt(line.nextToken());
                }
            }
            int t2 = Integer.parseInt(br.readLine());
            for (int i = 0; i < 4; i++) {
                line = new StringTokenizer(br.readLine());
                for (int j = 0; j < 4; j++) {
                    arr2[i][j] = Integer.parseInt(line.nextToken());
                }
            }
            int count = 0;
            int x = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (arr1[t1 - 1][i] == arr2[t2 - 1][j]) {
                        count++;
                        x = arr1[t1 - 1][i];

                    }
                }
            }
            if (count == 1) {
                out.append("Case #" + (k + 1) + ": " + x +"\n");
            } else if (count == 0) {
                out.append("Case #" + (k + 1) + ": " + "Volunteer cheated!" +"\n");
            } else {
                out.append("Case #" + (k + 1) + ": " + "Bad magician!" +"\n");
            }
        }
        out.close();
    }
}
