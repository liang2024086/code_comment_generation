package methodEmbedding.Magic_Trick.S.LYD76;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 8
 * Date: 4/12/14
 * Time: 11:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class MagicTrick {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner((MagicTrick.class.getClassLoader().getResourceAsStream("data.txt")));

        PrintWriter out = new PrintWriter("MagicTrick.out");

        int lines = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i<= lines; i++){
            int row1 = scanner.nextInt()-1;

            int[][] table1 = new int[4][4];
            for (int j=0; j<4; j++)
                for (int k=0; k<4; k++)
                    table1[j][k] = scanner.nextInt();

            int row2 = scanner.nextInt()-1;

            int[][] table2 = new int[4][4];
            for (int j=0; j<4; j++)
                for (int k=0; k<4; k++)
                    table2[j][k] = scanner.nextInt();


            List union = new ArrayList<Integer>();

            for (int j=0; j<4; j++)
                for (int k=0; k<4; k++)
                    if (table1[row1][j]==table2[row2][k])
                        union.add(new Integer(table1[row1][j]));


            String message = "Volunteer cheated!";

            if (union.size()>1 )
                message = "Bad magician!";
            else if (union.size()==1)
                message = ((Integer)union.get(0)).toString();

            out.println("Case #" + i + ": " + message);
        }

        scanner.close();
        out.close();
    }
}
