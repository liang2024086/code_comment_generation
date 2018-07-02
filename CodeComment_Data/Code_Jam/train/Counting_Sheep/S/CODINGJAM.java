package methodEmbedding.Counting_Sheep.S.LYD1594;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ChaoLun on 16/4/9.
 */
public class CODINGJAM {
    public static void main(String args[]) throws IOException {
        File f = new File("/Users/ChaoLun/IdeaProjects/cs180/HW14 15/src/file.txt");

        Scanner s = null;





            s = new Scanner(f);
            int cases = 1;
            s.next();
            while (s.hasNextLine())
                if (s.hasNextInt()) {
                    boolean contain0 = false;
                    boolean contain1 = false;
                    boolean contain2 = false;
                    boolean contain3 = false;
                    boolean contain4 = false;
                    boolean contain5 = false;
                    boolean contain6 = false;
                    boolean contain7 = false;
                    boolean contain8 = false;
                    boolean contain9 = false;

                int intput = s.nextInt();
                for (int i = 1; i <= 200; i++) {
                    int x = intput * i;
                    if (x == 0) {
                        System.out.println("Case #" + cases + ": INSOMNIA");
                        cases++;
                        break;
                    }
                    String xx = "" + x;


                    if (xx.contains("0")) {
                        contain0 = true;
                    }
                    if (xx.contains("1")) {
                        contain1 = true;
                    }
                    if (xx.contains("2")) {
                        contain2 = true;
                    }

                    if (xx.contains("3")) {
                        contain3 = true;
                    }
                    if (xx.contains("4")) {
                        contain4 = true;
                    }

                    if (xx.contains("5")) {
                        contain5 = true;
                    }
                    if (xx.contains("6")) {
                        contain6 = true;
                    }
                    if (xx.contains("7")) {
                        contain7 = true;
                    }
                    if (xx.contains("8")) {
                        contain8 = true;
                    }
                    if (xx.contains("9")) {
                        contain9 = true;
                    }

                    if (contain0 &&
                            contain1 &&
                            contain2 &&
                            contain3 &&
                            contain4 &&
                            contain5 &&
                            contain6 &&
                            contain7 &&
                            contain8 &&
                            contain9) {
                        System.out.println("Case #" + cases + ": " + xx);
                        cases++;
                        break;
                    }

                }

            }


    }
}
