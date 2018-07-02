package methodEmbedding.Magic_Trick.S.LYD983;


import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practica_1 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("D:/Huahcoding/input.txt"));
        PrintWriter out = new PrintWriter(new File("D:/Huahcoding/output.txt"));
        int casos = in.nextInt();
        for (int k = 0; k < casos; k++) {
            int p1 = in.nextInt();
            int ar1[][] = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int a = in.nextInt();
                    ar1[i][j] = a;
                }
            }
            int p2 = in.nextInt();
            int ar2[][] = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int a = in.nextInt();
                    ar2[i][j] = a;
                }
            }
            int numeros1[] = new int[4];
            for (int i = 0; i < ar1.length; i++) {
                numeros1[i] = ar1[p1 - 1][i];
            }
            int numeros2[] = new int[4];
            for (int i = 0; i < ar2.length; i++) {
                numeros2[i] = ar2[p2 - 1][i];
            }
            int cont = 0;
            int gui = 0;
            for (int i = 0; i < numeros1.length; i++) {
                for (int j = 0; j < numeros2.length; j++) {
                    if (numeros1[i] == numeros2[j]) {
                        gui = numeros1[i];
                        cont++;
                    }
                }
            }
            if (cont == 1) {
                System.out.println("Case #" + (k + 1) + ": " + gui);
                out.println("Case #" + (k + 1) + ": " + gui);
            } else if (cont > 1) {
                System.out.println("Case #" + (k + 1) + ": " + "Bad magician!");
                out.println("Case #" + (k + 1) + ": " + "Bad magician!");
            } else {
                System.out.println("Case #" + (k + 1) + ": " + "Volunteer cheated!");
                out.println("Case #" + (k + 1) + ": " + "Volunteer cheated!");
            }
        }
        out.close();
    }
}
