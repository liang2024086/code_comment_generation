package methodEmbedding.Revenge_of_the_Pancakes.S.LYD668;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer cases = in.nextInt();
        for (Integer i = 0; i < cases; i ++) {
            String sequence = in.next();
            ArrayList<String> list = new ArrayList<String>();
            for(Character c : sequence.toCharArray()) {
                list.add(c.toString());
            }
            Boolean want = true;
            Integer count = 0;
            for (Integer k = list.size() - 1; k >= 0; k--) {
                Boolean is = Objects.equals(list.get(k), "+");
                if (is != want) {
                    want = !want;
                    count++;
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + count);
        }
    }
}
