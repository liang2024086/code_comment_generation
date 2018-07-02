package methodEmbedding.Speaking_in_Tongues.S.LYD467;

import java.util.Scanner;

/**
 *
 * @author Nur Endah Safitri
 */
public class S1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= a; i++) {
            String ans = "";
            String input = in.nextLine();
            char[] c = input.toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (c[j] == 'a') {
                    ans = ans.concat("y");
                } else if (c[j] == 'b') {
                    ans = ans.concat("h");
                } else if (c[j] == 'c') {
                    ans = ans.concat("e");
                } else if (c[j] == 'd') {
                    ans = ans.concat("s");
                } else if (c[j] == 'e') {
                    ans = ans.concat("o");
                } else if (c[j] == 'f') {
                    ans = ans.concat("c");
                } else if (c[j] == 'g') {
                    ans = ans.concat("v");
                } else if (c[j] == 'h') {
                    ans = ans.concat("x");
                } else if (c[j] == 'i') {
                    ans = ans.concat("d");
                } else if (c[j] == 'j') {
                    ans = ans.concat("u");
                } else if (c[j] == 'k') {
                    ans = ans.concat("i");
                } else if (c[j] == 'l') {
                    ans = ans.concat("g");
                } else if (c[j] == 'm') {
                    ans = ans.concat("l");
                } else if (c[j] == 'n') {
                    ans = ans.concat("b");
                } else if (c[j] == 'o') {
                    ans = ans.concat("k");
                } else if (c[j] == 'p') {
                    ans = ans.concat("r");
                } else if (c[j] == 'q') {
                    ans = ans.concat("z");
                } else if (c[j] == 'r') {
                    ans = ans.concat("t");
                } else if (c[j] == 's') {
                    ans = ans.concat("n");
                } else if (c[j] == 't') {
                    ans = ans.concat("w");
                } else if (c[j] == 'u') {
                    ans = ans.concat("j");
                } else if (c[j] == 'v') {
                    ans = ans.concat("p");
                } else if (c[j] == 'w') {
                    ans = ans.concat("f");
                } else if (c[j] == 'x') {
                    ans = ans.concat("m");
                } else if (c[j] == 'y') {
                    ans = ans.concat("a");
                } else if (c[j] == 'z') {
                    ans = ans.concat("q");
                } else {
                    ans = ans.concat("" + c[j]);
                }
            }
            System.out.println("Case #" + (i) + ": " + ans);
        }
    }
}
