package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1071;


import java.io.*;
import java.util.*;

public class Main {
    private static final String inputPath = "/home/qurbonzoda/Programming/ideaProjects/Other/functions.in";
    private static final String outputPath = "/home/qurbonzoda/Programming/ideaProjects/Other/functions.out";
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintWriter printer = new PrintWriter(new FileOutputStream(outputPath));
        int T = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < T; i++) {
            printer.format("Case #%d: ", i + 1);
            String cakes = scanner.nextLine();
            int[] d = new int[cakes.length()];
            if (cakes.charAt(0) == '-') {
                d[0] = 1;
            }
            for (int j = 1; j < cakes.length(); j++) {
                d[j] = d[j - 1];
                if (cakes.charAt(j) == '-' && cakes.charAt(j - 1) == '+'){
                    d[j] += 2;
                }
            }
            printer.println(d[cakes.length() - 1]);
        }
        printer.flush();
    }
}
