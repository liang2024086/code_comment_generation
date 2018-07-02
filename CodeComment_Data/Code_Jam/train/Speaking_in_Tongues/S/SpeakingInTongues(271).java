package methodEmbedding.Speaking_in_Tongues.S.LYD1047;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class SpeakingInTongues {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner problem = new Scanner(System.in);
        HashMap<Character, Character> dicionario = new HashMap<Character, Character>();
        dicionario.put('q', 'z');
        dicionario.put('w', 'f');
        dicionario.put('e', 'o');
        dicionario.put('r', 't');
        dicionario.put('t', 'w');
        dicionario.put('y', 'a');
        dicionario.put('u', 'j');
        dicionario.put('i', 'd');
        dicionario.put('o', 'k');
        dicionario.put('p', 'r');
        dicionario.put('a', 'y');
        dicionario.put('s', 'n');
        dicionario.put('d', 's');
        dicionario.put('f', 'c');
        dicionario.put('g', 'v');
        dicionario.put('h', 'x');
        dicionario.put('j', 'u');
        dicionario.put('k', 'i');
        dicionario.put('l', 'g');
        dicionario.put('z', 'q');
        dicionario.put('x', 'm');
        dicionario.put('c', 'e');
        dicionario.put('v', 'p');
        dicionario.put('b', 'h');
        dicionario.put('n', 'b');
        dicionario.put('m', 'l');
        dicionario.put(' ', ' ');
        int t = problem.nextInt();
        problem.nextLine();
        for (int i = 0; i < t; i++) {
            String line = problem.nextLine();
            String whiskasSache = "";
            for (int j = 0; j < line.length(); j++) {
                whiskasSache += dicionario.get(line.toCharArray()[j]);
            }
            System.out.println(String.format("Case #%s: %s", i + 1, whiskasSache));
        }
    }
}
