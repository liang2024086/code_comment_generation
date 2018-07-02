package methodEmbedding.Standing_Ovation.S.LYD1478;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("A-small-attempt2.in"));
        PrintWriter x = new PrintWriter("out.txt");
        byte T = in.nextByte();
        for (int i = 0; i < T; i++) {
            short s = in.nextShort();
            String n = in.next();
            int c = 0;
            int y = 0;
            for (int j = 0; j < n.length() - 1; j++) {
                c += Integer.parseInt(n.charAt(j) + "");
                if (j + 1 > c) {
                    y += (j + 1) - c;
                    c += (j + 1) - c;
                }
            }
            System.out.println("Case #" + (1 + i) + ": " + y);
            x.println("Case #" + (1 + i) + ": " + y);
        }
        x.close();
    }
}
