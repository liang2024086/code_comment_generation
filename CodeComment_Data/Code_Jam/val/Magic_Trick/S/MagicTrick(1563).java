package methodEmbedding.Magic_Trick.S.LYD832;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.*;
import java.math.*;
import java.util.*;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Kazi Hasan Mahdi
 * Date: 4/13/14
 * Time: 2:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class MagicTrick {

    public static void main(String[] arg) {
        try {
            Scanner s = null;
            File file = new File("G:\\output.txt");
            FileOutputStream fos = new FileOutputStream(file);
            PrintStream out = new PrintStream(fos);
            System.setOut(out);
            try {
                s = new Scanner(new BufferedReader(new FileReader("G:\\A-small-attempt0.in")));
                int numOfTestCases = s.nextInt();
                for (int i = 1; i <= numOfTestCases; ++i) {
                    int rowChoose1 = s.nextInt();
                    int[] row1 = new int[4];
                    for (int j = 1; j <= 4; ++j) {
                        for (int k = 0; k < 4; ++k) {
                            if (j == rowChoose1) {
                                row1[k] = s.nextInt();
                            } else s.nextInt();
                        }
                    }
                    int rowChoose2 = s.nextInt();
                    int[] row2 = new int[4];
                    for (int j = 1; j <= 4; ++j) {
                        for (int k = 0; k < 4; ++k) {
                            if (j == rowChoose2) {
                                row2[k] = s.nextInt();
                            } else s.nextInt();
                        }
                    }

                    int count = 0;
                    int result = 0;
                    for (int r = 0; r < 4; ++r) {
                        for (int p = 0; p < 4; ++p) {
                            if (row1[r] == row2[p]) {
                                result = row1[r];
                                ++count;
                            }
                        }
                    }

                    if (count == 1) {
                        System.out.println("Case #" + i + ": " + result);
                    } else if (count == 0) {
                        System.out.println("Case #" + i + ": " + "Volunteer cheated!");
                    } else if (count > 1) {
                        System.out.println("Case #" + i + ": " + "Bad magician!");
                    }


                }
                fos.close();
            } finally {
                if (s != null) {
                    s.close();
                }
            }
        } catch (Exception e) {
        }
    }
}
