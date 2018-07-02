package methodEmbedding.Speaking_in_Tongues.S.LYD1370;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpeakingTongues {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("speakingTonguesSmall.txt"));
        int testes = in.nextInt();
        String jumpStartLine = in.nextLine();

        Map<Character, Character> translate = new HashMap<Character, Character>();
        translate.put('y', 'a');
        translate.put('n', 'b');
        translate.put('f', 'c');
        translate.put('i', 'd');
        translate.put('c', 'e');
        translate.put('w', 'f');
        translate.put('l', 'g');
        translate.put('b', 'h');
        translate.put('k', 'i');
        translate.put('u', 'j');
        translate.put('o', 'k');
        translate.put('m', 'l');
        translate.put('x', 'm');
        translate.put('s', 'n');
        translate.put('e', 'o');
        translate.put('v', 'p');
        translate.put('z', 'q');
        translate.put('p', 'r');
        translate.put('d', 's');
        translate.put('r', 't');
        translate.put('j', 'u');
        translate.put('g', 'v');
        translate.put('t', 'w');
        translate.put('h', 'x');
        translate.put('a', 'y');
        translate.put('q', 'z');
        translate.put(' ', ' ');

        for (int t = 1; t <= testes; t++) {
            String linha = in.nextLine();
            String translatedLine = "";
            for (int i = 0; i < linha.length(); i++) {
                translatedLine += translate.get(new Character(linha.charAt(i)));
            }
            System.out.format("Case #%d: %s\n", t, translatedLine);
            }
        }
}
