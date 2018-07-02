package methodEmbedding.Speaking_in_Tongues.S.LYD1270;


import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

public class Googlerese {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("A-small-attempt0.in"));
        HashMap<Character, Character> table = new HashMap<Character, Character>();
        table.put('a', 'y');
        table.put('b', 'h');
        table.put('c', 'e');
        table.put('d', 's');
        table.put('e', 'o');
        table.put('f', 'c');
        table.put('g', 'v');
        table.put('h', 'x');
        table.put('i', 'd');
        table.put('j', 'u');
        table.put('k', 'i');
        table.put('l', 'g');
        table.put('m', 'l');
        table.put('n', 'b');
        table.put('o', 'k');
        table.put('p', 'r');
        table.put('q', 'z');
        table.put('r', 't');
        table.put('s', 'n');
        table.put('t', 'w');
        table.put('u', 'j');
        table.put('v', 'p');
        table.put('w', 'f');
        table.put('x', 'm');
        table.put('y', 'a');
        table.put('z', 'q');
        table.put(' ', ' ');
        final int T = Integer.parseInt(sc.nextLine());
        String input;
        StringBuffer output = new StringBuffer();

        for (int i = 1; i <= T; i++) {
            input = sc.nextLine();

            for (int j = 0; j < input.length(); j++) {

                output.append(table.get(input.charAt(j)));
            }

            System.out.println("Case #" + i + ": " + output.toString());
            output.delete(0, input.length());
        }

    }

}
