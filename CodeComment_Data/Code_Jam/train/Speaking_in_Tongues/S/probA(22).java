package methodEmbedding.Speaking_in_Tongues.S.LYD1237;


//@author mscandal
import java.lang.Character;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class probA {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Character, Character> map;

        /*String google = "";
        String english = "";
        google = scan.next();
        english = scan.next();

        Map<Character, Character> m = new HashMap<Character, Character>();

        for (int i = 0; i < google.length(); i++) {
            if (!m.containsKey(google.toLowerCase().charAt(i))) {
                m.put(google.charAt(i), english.charAt(i));
            }
        }
        System.out.println(m.size());
        for(Character c = 'a'; c <= 'z'; c++){
            if(null != m.get(c))
                System.out.println("map.put('" + c + "', '" + m.get(c)+"')");
            else
                System.out.println(c +":WHATTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTG");
        }
        for(Character c = 'a'; c <= 'z'; c++){
            if(!m.values().contains(c)){
                System.out.println(c);
            }
        }
         * 
         */
        map = new HashMap<Character, Character>();
        map.put('a', 'y');
        map.put('b', 'h');
        map.put('c', 'e');
        map.put('d', 's');
        map.put('e', 'o');
        map.put('f', 'c');
        map.put('g', 'v');
        map.put('h', 'x');
        map.put('i', 'd');
        map.put('j', 'u');
        map.put('k', 'i');
        map.put('l', 'g');
        map.put('m', 'l');
        map.put('n', 'b');
        map.put('o', 'k');
        map.put('p', 'r');
        map.put('q', 'z');
        map.put('r', 't');
        map.put('s', 'n');
        map.put('t', 'w');
        map.put('u', 'j');
        map.put('v', 'p');
        map.put('w', 'f');
        map.put('x', 'm');
        map.put('y', 'a');
        map.put('z', 'q');
        
        Integer max = scan.nextInt();
        scan.nextLine();
        for(int i = 1; i <= max; i++){
            String line = scan.nextLine();
            System.out.print("Case #"+i+": ");
            for(Character c : line.toCharArray()){
                if(map.containsKey(c))
                    System.out.print(map.get(c));
                else
                    System.out.print(c);
            }
            System.out.println();
        }
    }
}
