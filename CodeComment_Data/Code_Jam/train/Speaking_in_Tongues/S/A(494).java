package methodEmbedding.Speaking_in_Tongues.S.LYD543;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("A-small-attempt2.in"));
        PrintWriter printer = new PrintWriter(new File("a.out"));
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            printer.print("Case #" + (i + 1) + ": ");
            String line = scanner.nextLine();
            char[] mas = new char[]{'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
            for (int j = 0; j < line.length(); j++) {
//                System.out.println(line.charAt(j) == ' ' ? ' ' : mas[line.charAt(j) - 'a']);
//                if (line.charAt(j) - 'a' < 0) System.out.println(line.charAt(j));
                printer.print(line.charAt(j) == ' ' ? ' ' : mas[line.charAt(j) - 'a']);
            }
            printer.println();
        }
        printer.flush();
        printer.close();
    }
}
