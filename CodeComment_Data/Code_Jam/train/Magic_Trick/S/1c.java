package methodEmbedding.Magic_Trick.S.LYD784;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by Jacob on 14-4-12.
 */
public class MagicTrick {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream(new File("e:/1.txt")));
        int T = scanner.nextInt();
        for (int index = 1; index <= T; index++) {
            int M = scanner.nextInt();
            int[][] data1 = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    data1[i][j] = scanner.nextInt();
                }
            }

            int N = scanner.nextInt();
            int[][] data2 = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    data2[i][j] = scanner.nextInt();
                }
            }

            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();

            for (int i = 0; i < 4; i++) {
                list1.add(data1[M - 1][i]);
                list2.add(data2[N - 1][i]);
            }

            list1.retainAll(list2);

            if (list1.size() == 1) {
                System.out.println("Case #" + index + ": " + list1.get(0));
            } else if (list1.size() == 0) {
                System.out.println("Case #" + index + ": " + "Volunteer cheated!");
            }else{
                System.out.println("Case #" + index + ": " + "Bad magician!");
            }

        }
    }
}
