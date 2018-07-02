package methodEmbedding.Speaking_in_Tongues.S.LYD1676;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class FirstProblem {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("A-small-attempt0.in"));
        int totalDeCasos = scanner.nextInt();
        // System.out.println(totalDeCasos);

        // abcdefghijklmnopqrstwuvxyz
        // ynficwlbkuomxsevzpdrtjghaq
        HashMap<String, String> googlerToEnglish = new HashMap<String, String>();
        googlerToEnglish.put("y", "a");
        googlerToEnglish.put("n", "b");
        googlerToEnglish.put("f", "c");
        googlerToEnglish.put("i", "d");
        googlerToEnglish.put("c", "e");
        googlerToEnglish.put("w", "f");
        googlerToEnglish.put("l", "g");
        googlerToEnglish.put("b", "h");
        googlerToEnglish.put("k", "i");
        googlerToEnglish.put("u", "j");
        googlerToEnglish.put("o", "k");
        googlerToEnglish.put("m", "l");
        googlerToEnglish.put("x", "m");
        googlerToEnglish.put("s", "n");
        googlerToEnglish.put("e", "o");
        googlerToEnglish.put("v", "p");
        googlerToEnglish.put("z", "q");
        googlerToEnglish.put("p", "r");
        googlerToEnglish.put("d", "s");
        googlerToEnglish.put("r", "t");
        googlerToEnglish.put("j", "u");
        googlerToEnglish.put("g", "v");
        googlerToEnglish.put("t", "w");
        googlerToEnglish.put("h", "x");
        googlerToEnglish.put("a", "y");
        googlerToEnglish.put("q", "z");
        googlerToEnglish.put(" ", " ");

        String linha = scanner.nextLine();
        for (int i = 0; i < totalDeCasos; i++) {
            linha = scanner.nextLine();
            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = 0; j < linha.length(); j++) {
                System.out.print(googlerToEnglish.get(String.valueOf(linha.charAt(j))));
            }
            System.out.println();
        }

    }
}
