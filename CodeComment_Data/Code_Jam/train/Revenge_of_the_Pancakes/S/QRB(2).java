package methodEmbedding.Revenge_of_the_Pancakes.S.LYD58;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class QRB {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("QRB.txt");
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            char[] line = sc.nextLine().toCharArray();
            int flips = 0;
            if (line.length == 1) {
                writer.println("Case #" + (i + 1) + ": " + (line[0] == '-' ? 1 : 0));
                continue;
            }
            for (int j = 1; j < line.length; j++) {
                if (line[j] == '-' && line[j - 1] == '+') {
                    for (int k = 0; k < j; k++) {
                        line[k] = '-';
                    }
                    flips++;
                }
                if (line[j - 1] == '-' && line[j] == '+') {
                    for (int k = 0; k < j; k++) {
                        line[k] = '+';
                    }
                    flips++;
                }
                if (j == line.length - 1 && line[j] == '-') {
                    flips++;
                }
            }
            writer.println("Case #" + (i + 1) + ": " + flips);
        }
        writer.flush();
        writer.close();
    }

}
