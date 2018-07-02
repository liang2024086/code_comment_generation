package method_new_test.All_Your_Base.S.LYD41;

import java.util.*;
import java.math.*;

public class a {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        for (int i = 1; i <= c; i++) {
            String s = scanner.next();
            HashSet<Character> hs = new HashSet<Character>();
            for (int j = 0; j < s.length(); j++) {
                hs.add(new Character(s.charAt(j)));
            }
            int base = Math.max(2, hs.size());
            hs.clear();
            StringBuilder sb = new StringBuilder();
            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            hm.put(new Character(s.charAt(0)), new Integer(1));
            sb.append("1");
            int count = 2;
            boolean usedZero = false;
            for (int j = 1; j < s.length(); j++) {
                Character chr = new Character(s.charAt(j));
                if (hm.containsKey(chr)) {
                    sb.append(hm.get(chr).intValue());
                } else {
                    if (!usedZero) {
                        usedZero = true;
                        sb.append("0");
                        hm.put(new Character(s.charAt(j)), new Integer(0));
                    } else {
                        hm.put(new Character(s.charAt(j)), new Integer(count));
                        sb.append(count);
                        count++;
                    }
                }
            }
            BigInteger bi = new BigInteger(sb.toString(), base);
            System.out.println("Case #"+i+": "+bi.toString());
        }
    }
}
