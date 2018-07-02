package methodEmbedding.Magic_Trick.S.LYD1837;

import java.io.*;
import java.util.*;

public class CodeJam1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner s = new Scanner(new File("A-small-attempt6.in"));
        //BufferedReader in = new BufferedReader(new FileReader("s.txt"));
        PrintWriter out = new PrintWriter(new File("A-small-attempt6.out"));
        int n = Integer.parseInt(s.nextLine());

        for (int i = 0; i < n; ++i) {
            int r = Integer.parseInt(s.nextLine());
            //System.out.println(r);
            int[][] arr = new int[4][4];
            for (int j = 0; j < 4; ++j) {
                String text[] = s.nextLine().split(" ");

                for (int k = 0; k < 4; ++k) {

                    arr[j][k] = Integer.parseInt(text[k]);
                    //System.out.print(arr[j][k] + " ");

                }
               // System.out.println();
            }
            
            int r1 = Integer.parseInt(s.nextLine());
           // System.out.println(r1);
            int[][] array = new int[4][4];
            for (int j = 0; j < 4; ++j) {
                String text[] = s.nextLine().split(" ");
                for (int k = 0; k < 4; ++k) {
                    array[j][k] = Integer.parseInt(text[k]);
                  //  System.out.print(array[j][k] + " ");
                }
               // System.out.println();

            }
            int c = 0;
            int num = 0;
            for (int j = 0; j < 4; ++j) {
                for (int k = 0; k < 4; ++k) {
                    if (arr[r - 1][j] == array[r1 - 1][k]) {
                        num = arr[r - 1][j];
                        c++;
                    }
                }
            }
            if (c == 1) {
               out.println("Case #" + (i+1) + ": " + num);
            } else if (c == 0) {
               out.println("Case #" + (i+1) + ": Volunteer cheated!");
            } else {
               out.println("Case #" + (i+1) + ": Bad magician!");
            }
        }
        out.close();
        //s.close();

    }
}
