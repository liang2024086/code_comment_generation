package methodEmbedding.Magic_Trick.S.LYD1659;


import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
    public static void main(String[] args) throws Exception {
//        InputStream in = System.in;
        InputStream in = new FileInputStream("/home/floris/Downloads/A-small-attempt0.in");
        System.setOut(new PrintStream("/home/floris/temp/codejam2014/src/A.out"));
        Scanner sc = new Scanner(in);

        for (int c = 1, cases = sc.nextInt(); c <= cases; c++) {
            int row = sc.nextInt()-1;
            Set<Integer> x = new HashSet();
            for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++)
                if (i==row) {
                    x.add(sc.nextInt());
                } else sc.nextInt();
            Set<Integer> x2 = new HashSet();
            row = sc.nextInt()-1;
            for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++)
                if (i==row) {
                    x2.add(sc.nextInt());
                } else sc.nextInt();
            x.retainAll(x2);
            String result;
            if (x.isEmpty()) result =  "Volunteer cheated!";
            else if (x.size()>1) result = "Bad magician!";
            else result = ""+x.iterator().next();
            System.out.printf("Case #%d: %s%n", c, result);
        }
    }
}
