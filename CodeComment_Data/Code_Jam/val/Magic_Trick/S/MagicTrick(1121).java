package methodEmbedding.Magic_Trick.S.LYD1614;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MagicTrick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for (int t = 1; t <= T; t++) {
            int r1 = in.nextInt();
            Set<Integer> set1 = new HashSet<Integer>();
            
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 4; j++) {
                    if (i == r1) {
                        set1.add(in.nextInt());
                    } else {
                        in.nextInt();
                    }
                }
            }
            
            int r2 = in.nextInt();
            Set<Integer> set2 = new HashSet<Integer>();
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 4; j++) {
                    if (i == r2) {
                        set2.add(in.nextInt());
                    } else {
                        in.nextInt();
                    }
                }
            }
            
            set1.retainAll(set2);
            
            if (set1.size() == 1) {
                sb.append("Case #" + t + ": " + set1.iterator().next()+"\n");
            } else if (set1.size() > 1) {
                sb.append("Case #" + t + ": " + "Bad magician!\n");
            } else {
                sb.append("Case #" + t + ": " + "Volunteer cheated!\n");
            }
            
        }
        
        System.out.println(sb.toString());;
    }

}
