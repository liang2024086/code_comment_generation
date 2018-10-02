package methodEmbedding.Magic_Trick.S.LYD1841;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ankur.srivastava on 12/04/14.
 */
public class MagicTrick {
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(new File("magicTrickSmall.txt"));
        File op = new File("magicTrickSmallOp.txt");
        PrintWriter writer = new PrintWriter(op);
//        System.out.println(s.next());
        int n = s.nextInt();
        for (int i = 1 ; i <= n ; i++ ) {
            int a1 = s.nextInt();
//            System.out.println(a1);
            String r1 = "";
            s.nextLine();
            for (int j = 1; j <=4; j++ ) {
                String r = s.nextLine();
//                System.out.println( "ip1 : " + r);
                if (a1 == j) {
                    r1 = r;
                }
            }

            int a2 = s.nextInt();
//            System.out.println(a2);
            String r2 = "";
            s.nextLine();
            for (int j = 1; j <=4; j++ ) {
                String r = s.nextLine();
//                System.out.println( "ip2 : " + r);
                if (a2 == j) {
                    r2 = r;
                }
            }

//            System.out.println( "selected : " + r1);
//            System.out.println("selected : " +r2);

            String[] set1 = r1.split(" ");
            String[] set2 = r2.split(" ");

            int matches = 0;
            String match = "";

            for (String p1 : set1) {
                for( String p2 : set2) {
                    if (p1.equalsIgnoreCase(p2)) {
                        matches++;
                        match = p1;
                    }
                }
            }

            if (matches == 1) {
                System.out.println("Case #" + i + ": " + match);
                writer.println("Case #" + i + ": " + match);
            } else if (matches == 0) {
                System.out.println("Case #" + i + ": " + "Volunteer cheated!");
                writer.println("Case #" + i + ": " + "Volunteer cheated!");
            } else {
                System.out.println("Case #" + i + ": " + "Bad magician!");
                writer.println("Case #" + i + ": " + "Bad magician!");
            }

        }
        writer.close();

    }
}
