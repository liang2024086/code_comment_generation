package methodEmbedding.Magic_Trick.S.LYD974;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {

    public static void main(String zargs[]) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/vivek/Downloads/A-small-attempt0.in"));
//        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int j = 1; j <= t; j++) {
            int n1 = scanner.nextInt();
            scanner.nextLine();

            List<String> arrayList = new ArrayList<String>();
            for (int i = 1; i <= 4; i++) {

                String s = scanner.nextLine();
                if (i == n1)
                    arrayList = Arrays.asList(s.split(" "));
            }


            int n2 = scanner.nextInt();
            scanner.nextLine();

            List<String> arrayList2 = new ArrayList<String>();
            for (int i = 1; i <= 4; i++) {

                String s = scanner.nextLine();
                if (i == n2)
                    arrayList2 = Arrays.asList(s.split(" "));
            }

            int x = 0;
            String ans = "";
            for (String anArrayList2 : arrayList2) {
                if (arrayList.contains(anArrayList2)) {
                    x++;
                    ans = anArrayList2;
                }
            }

            System.out.print("Case #" + j + ": ");

            if (x == 0)
                System.out.println("Volunteer cheated!");
            else if (x == 1)
                System.out.println(ans);
            else System.out.println("Bad magician!");
        }

    }

}
