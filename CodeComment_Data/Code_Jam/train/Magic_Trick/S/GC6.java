package methodEmbedding.Magic_Trick.S.LYD765;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class GC6 {
    public static void main(String[] args) throws IOException {
        int a1 = 0, i = 0, a2 = 0;

        BufferedReader br = new BufferedReader(new FileReader("C:\\Entertainment\\File.txt"));
        a1 = Integer.parseInt(br.readLine());
        while (i < a1) {
            HashSet<Integer> hashSet = new HashSet<Integer>();
            int val1 = Integer.parseInt(br.readLine());
            for (int j = 1; j < val1; j++) {
                br.readLine();
            }
            String[] arr1 = (br.readLine().split(" "));
            for (int j = 0; j < 4; j++) {
                hashSet.add(Integer.parseInt(arr1[j]));
            }
            for (int j = val1 + 1; j <= 4; j++) {
                br.readLine();
            }
            int val2 = Integer.parseInt(br.readLine());
            for (int j = 1; j < val2; j++) {
                br.readLine();
            }
            String[] arr2 = (br.readLine().split(" "));
            for (int j = val2 + 1; j <= 4; j++) {
                br.readLine();
            }
            int ans = Integer.MIN_VALUE, bool = 0;
            for (int j = 0; j < 4; j++) {
                if (hashSet.contains(Integer.parseInt(arr2[j]))) {
                    ans = Integer.parseInt(arr2[j]);
                    bool++;
                }
            }
            if (bool == 0)
                System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
            else if (bool > 1)
                System.out.println("Case #" + (i + 1) + ": Bad magician!");
            else
                System.out.println("Case #" + (i + 1) + ": " + ans);
            i++;

        }
    }
}
