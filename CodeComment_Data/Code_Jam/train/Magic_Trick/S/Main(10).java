package methodEmbedding.Magic_Trick.S.LYD255;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ahmad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input = new Scanner(new File("input.in"));
        PrintWriter out = new PrintWriter("output.out");
        //Work Area
        int arr_1[][] = new int[4][4];
        int arr_2[][] = new int[4][4];
        int t = input.nextInt();
        int x, y, r;
        for (int i = 0; i < t; i++) {
            x = input.nextInt();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    arr_1[j][k] = input.nextInt();
                }
            }
            y = input.nextInt();
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    arr_2[j][k] = input.nextInt();
                }
            }
            boolean a = false, b = false;
            r = 0;
            for (int j = 0; j < 4; j++) {
                if (a && b) {
                    break;
                }

                for (int k = 0; k < 4; k++) {
                    if (arr_1[x-1][j] == arr_2[y-1][k]) {
                        if (a) {
                            b = true;
                            break;
                        } else {
                            a = true;
                            r = arr_1[x-1][j];

                        }
                    }
                }
            }
            out.printf("Case #%d: ",i+1);
            if (a & !b) {
                out.println(r);
            } else if (!a) {
                out.println("Volunteer cheated!");
            } else if (a && b) {
                out.println("Bad magician!");
            }
        }
        //End Of WorkArea
        input.close();
        out.close();
    }
}
