package methodEmbedding.Magic_Trick.S.LYD2042;

import java.util.*;

/**
 * Created by Will on 11-Apr-14.
 */
public class MagicTrick {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int cases = Integer.parseInt(in.nextLine());
        for(int tt = 1; tt <= cases; tt ++){
            int row1 = Integer.parseInt(in.nextLine()) - 1;
            Set<Integer> cards = new HashSet<>();
            for(int i = 0; i < 4; i ++){
                if (i == row1){
                    for(int j = 0; j < 4; j ++){
                        cards.add(in.nextInt());
                    }
                }
                in.nextLine();
            }
            int row2 = Integer.parseInt(in.nextLine()) - 1;
            List<Integer> shuffled = new ArrayList<>();
            for(int i = 0; i < 4; i ++){
                if (i == row2) {
                    for (int j = 0; j < 4; j++) {
                        shuffled.add(in.nextInt());
                    }
                }
                in.nextLine();
            }
            cards.retainAll(shuffled);
            if (cards.size() == 0){
                System.out.printf("Case #%d: Volunteer cheated!\n", tt);
            }else if (cards.size() == 1){
                System.out.printf("Case #%d: %d\n", tt, cards.toArray()[0]);
            }else{
                System.out.printf("Case #%d: Bad magician!\n", tt);
            }

        }
    }
}
