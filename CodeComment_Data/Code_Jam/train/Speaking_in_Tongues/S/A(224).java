package methodEmbedding.Speaking_in_Tongues.S.LYD664;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class A {
    public static void main (String [] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.in"));
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(new Character('a'), new Character('y'));
        map.put(new Character('b'), new Character('h'));
        map.put(new Character('c'), new Character('e'));
        map.put(new Character('d'), new Character('s'));
        map.put(new Character('e'), new Character('o'));
        map.put(new Character('f'), new Character('c'));
        map.put(new Character('g'), new Character('v'));
        map.put(new Character('h'), new Character('x'));
        map.put(new Character('i'), new Character('d'));
        map.put(new Character('j'), new Character('u'));
        map.put(new Character('k'), new Character('i'));
        map.put(new Character('l'), new Character('g'));
        map.put(new Character('m'), new Character('l'));
        map.put(new Character('n'), new Character('b'));
        map.put(new Character('o'), new Character('k'));
        map.put(new Character('p'), new Character('r'));
        map.put(new Character('q'), new Character('z'));
        map.put(new Character('r'), new Character('t'));
        map.put(new Character('s'), new Character('n'));
        map.put(new Character('t'), new Character('w'));
        map.put(new Character('u'), new Character('j'));
        map.put(new Character('v'), new Character('p'));
        map.put(new Character('w'), new Character('f'));
        map.put(new Character('x'), new Character('m'));
        map.put(new Character('y'), new Character('a'));
        map.put(new Character('z'), new Character('q'));
        int count = input.nextInt();
        input.nextLine();
        for (int i = 0 ; i < count; i++) {
            String given = input.nextLine();
            char[] chars = given.toCharArray();
            StringBuffer buf = new StringBuffer();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == ' ')
                    buf.append(" ");
                else 
                    buf.append(map.get(new Character(chars[j])));
            }
            System.out.println("Case #" + (i + 1) + ": " + buf.toString());
        }
    }
}
