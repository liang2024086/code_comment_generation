package methodEmbedding.Speaking_in_Tongues.S.LYD906;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("abc.txt"));
        int input = sc.nextInt();
        sc.nextLine();
        String[][] translations = new String[input][2];
        for (int i = 0; i < input; i++) {
            translations[i][0] = sc.nextLine();
        }
        sc.nextLine();
        for (int i = 0; i < input; i++) {
            translations[i][1] = sc.nextLine();
        }
        Googlerese test = Googlerese.make(translations);
        System.out.println(Arrays.toString(test.transform));

        sc = new Scanner(new File("A-small-attempt0.in"));
        PrintStream print = new PrintStream(new File("out1.txt"));
        input = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < input; i++) {
            String t = "Case #"+(i+1)+": "+test.trans(sc.nextLine());
            System.out.println(t);
            print.println(t);
        }
    }
}
