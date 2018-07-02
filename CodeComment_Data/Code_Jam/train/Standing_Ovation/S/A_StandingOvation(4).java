package methodEmbedding.Standing_Ovation.S.LYD701;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A_StandingOvation {
    static String fileName = "A-small-attempt2";
    static String inputFile = "inputs/Qualification/" + fileName + ".in";
    static String outputFile = "outputs/Qualification/" + fileName + ".out";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File(inputFile));
        PrintWriter out = new PrintWriter(outputFile);
        int T = in.nextInt();

        for (int t = 1; t <= T; t++) {
            int Smax = in.nextInt();
            String S = in.next();
            int standing = 0;
            int friendsInvited = 0;

            for (int shyness = 0; shyness <= Smax; shyness++) {
                int people = Integer.parseInt(S.charAt(shyness) + "");
                if (shyness > standing) {
                    friendsInvited++;
                    standing++;
                }

                standing += people;
            }
            out.println("Case #" + t + ": " + friendsInvited);
        }
        in.close();
        out.close();
    }
}
