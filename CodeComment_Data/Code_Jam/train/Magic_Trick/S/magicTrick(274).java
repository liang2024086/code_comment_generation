package methodEmbedding.Magic_Trick.S.LYD1429;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class magicTrick {

    public static void main(String[] args) throws IOException {
        FileReader fin = new FileReader("A-small-attempt6.in");
        FileWriter fout = new FileWriter("output.txt");
        Scanner sc = new Scanner(fin);
        int n = sc.nextInt();
        int[][] mas = new int[4][4];
        ArrayList<Integer> vibor = new ArrayList();

        for (int i = 1; i <= n; i++) {
            int otvet = 0;
            int numOtvet = 0;
            int first = sc.nextInt();

            for (int j = 0; j < 4; j++) {
                for (int m = 0; m < 4; m++) {
                    mas[j][m] = sc.nextInt();
                    if (j == first - 1) {
                        vibor.add(mas[j][m]);
                    }
                }
            }

            int second = sc.nextInt();

            for (int j = 0; j < 4; j++) {
                for (int m = 0; m < 4; m++) {
                    mas[j][m] = sc.nextInt();
                    
                }
            }

            for (int j = 0; j < 4; j++) {
                //System.out.println(mas[second - 1][j]);
                if (vibor.contains(mas[second - 1][j])) {
                    numOtvet++;
                    otvet = mas[second - 1][j];
                        vibor.remove((Object) mas[second - 1][j]);
                }
            }

            //System.out.println(vibor);
            fout.write("Case #" + i + ": ");
            switch (numOtvet) {
                case 0:
                    fout.write("Volunteer cheated!");
                    break;
                case 1:
                    fout.write(Integer.toString(otvet));
                    break;
                default:
                    fout.write("Bad magician!");
                    break;
            }
            fout.write("\r\n");
            vibor.clear();
        }
        fin.close();
        fout.close();
    }
}
