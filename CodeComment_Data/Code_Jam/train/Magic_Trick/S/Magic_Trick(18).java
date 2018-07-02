package methodEmbedding.Magic_Trick.S.LYD1579;

import java.util.Scanner;

public class Magic_Trick {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int T = Integer.parseInt(scan.nextLine());


        for (int t = 1; t <= T; t++) {

            int c1 = Integer.parseInt(scan.nextLine());
            String[] s1 = null;
            for (int i = 1; i <= 4; i++)
                if (i == c1)
                    s1 = scan.nextLine().split(" ");
                else
                    scan.nextLine();

            int c2 = Integer.parseInt(scan.nextLine());
            String[] s2 = null;
            for (int i = 1; i <= 4; i++)
                if (i == c2)
                    s2 = scan.nextLine().split(" ");
                else
                    scan.nextLine();

            int c = 0;
            String card = "none";
            for (String i1 : s1) {
                for (String i2 : s2) {
                    if (i1.equals(i2)) {
                        c++;
                        card = i1;
                    }
                }
            }

            switch (c) {
                case 0:
                    System.out.println("Case #" + t + ": Volunteer cheated!");
                    break;
                case 1:
                    System.out.println("Case #" + t + ": " + card);
                    break;
                default:
                    System.out.println("Case #" + t + ": Bad magician!");
            }

        }

    }

}
