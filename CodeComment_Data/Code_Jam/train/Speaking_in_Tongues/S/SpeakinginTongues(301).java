package methodEmbedding.Speaking_in_Tongues.S.LYD1250;

import java.sql.SQLOutput;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: doe
 * Date: 4/13/12
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class SpeakinginTongues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        HashMap<Character, Character> map = new HashMap<Character, Character>();

//        System.out.println((int) 'a');
        map.put('a', 'y');
        map.put('b', 'n');
//c
        map.put('c', 'f');

        map.put('d', 'i');
        map.put('e', 'c');
        map.put('f', 'w');
        map.put('g', 'l');
        map.put('h', 'b');
        map.put('i', 'k');
        map.put('j', 'u');
        map.put('k', 'o');
        map.put('l', 'm');
        map.put('m', 'x');
        map.put('n', 's');
        map.put('o', 'e');
        map.put('p', 'v');

        map.put('q', 'z'); //

        map.put('r', 'p');
        map.put('s', 'd');
        map.put('t', 'r');
        map.put('u', 'j');
        map.put('v', 'g');
        map.put('w', 't');
        map.put('x', 'h');
        map.put('y', 'a');

        map.put('z', 'q');

        map.put(' ', ' ');

        Map<Character, Character> other = new HashMap<Character, Character>();
        other.put(' ', ' ');

        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            other.put(entry.getValue(), entry.getKey());
        }

        for (int i = 0; i < n; i++) {
            String input = s.nextLine();
            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = 0; j < input.length(); j++) {
                System.out.print(other.get(input.charAt(j)));
            }
            System.out.println();
        }
//z
//
//        List<Character> listFrom = new ArrayList<Character>(map.keySet());
//        List<Character> listTo = new ArrayList<Character>(map.values());
//
//        Collections.sort(listFrom);
//        Collections.sort(listTo);
//
//        System.out.println(listFrom);
//        System.out.println(listTo);
//
//        for (int i = 0; i < 26; i++) {
//            if (!map.containsKey((char)(i + 97))) {
//                System.out.println((char)(i + 97));
//            }
////            if (!map.containsValue((char)(i + 97))) {
////                System.out.println((char)(i + 97));
////            }
//
//        }
//        for (int i = 0; i < 26; i++) {
//            if (!map.containsKey((char)(i + 97))) {
////                System.out.println((char)(i + 97));
//            }
//            if (!map.containsValue((char)(i + 97))) {
//                System.out.println((char)(i + 97));
//            }
//
//        }


    }
}
