package methodEmbedding.Magic_Trick.S.LYD1766;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author nhnt11
 */
public class codejam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner s = new Scanner(new File(args[0]));
        int numCases = Integer.parseInt(s.nextLine());
        for (int i = 0; i < numCases; i++) {
            int firstAns = Integer.parseInt(s.nextLine());
            String row = s.nextLine();
            int j;
            for (j = 1; j < firstAns; j++) {
                row = s.nextLine();
            }
            for (; j < 4; j++) s.nextLine();
            Scanner s2 = new Scanner(row);
            int rowNums1[] = new int[4];
            for (j = 0; j < 4; j++) rowNums1[j] = s2.nextInt();
            int secondAns = Integer.parseInt(s.nextLine());
            row = s.nextLine();
            for (j = 1; j < secondAns; j++) {
                row = s.nextLine();
            }
            for (; j < 4; j++) s.nextLine();
            s2 = new Scanner(row);
            int rowNums2[] = new int[4];
            for (j = 0; j < 4; j++) rowNums2[j] = s2.nextInt();
            int count = 0;
            int card = -1;
            for (j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (rowNums1[j] == rowNums2[k]) {
                        count++;
                        card = rowNums1[j];
                    }
                }
            }
            System.out.print("Case #" + (i + 1) + ": ");
            if (count == 1) System.out.println(card);
            else if (count > 1) System.out.println("Bad magician!");
            else System.out.println("Volunteer cheated!");
        }
    }
}
