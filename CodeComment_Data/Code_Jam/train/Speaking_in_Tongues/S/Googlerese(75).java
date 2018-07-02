package methodEmbedding.Speaking_in_Tongues.S.LYD586;

import java.util.Scanner;

public class Googlerese {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 1;

        while (in.hasNextLine()) {
            System.out.print("Case #" + count++ + ": ");

            String line = in.nextLine();

            String alphaA = "abcdefghijklmnopqrstuvwxyz";
            String alphaB = "yhesocvxduiglbkrztnwjpfmaq";

            for (int i = 0; i < line.length(); i++) {
                int index = alphaA.lastIndexOf(line.charAt(i));

                if (index != -1) {
                    System.out.print(alphaB.charAt(index));
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
    }
}
