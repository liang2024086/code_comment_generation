package methodEmbedding.Magic_Trick.S.LYD421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A_MagicTrick {

    public static void main(String[] args) throws java.io.IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        final int TESTS = Integer.parseInt(input.readLine());
        for (int t = 1 ; t <= TESTS ; t++) {
            List<Integer> answers1 = new ArrayList<>();
            
            int row1 = Integer.parseInt(input.readLine()) - 1;
            for (int i = 0 ; i < 4 ; i++) {
                String[] vals = input.readLine().split(" ");
                if (i == row1) {
                    for (String s : vals) {
                        answers1.add(Integer.parseInt(s));
                    }
                }
            }
            
            int row2 = Integer.parseInt(input.readLine()) - 1;
            List<Integer> answers2 = new ArrayList<>();
            for (int i = 0 ; i < 4 ; i++) {
                String[] vals = input.readLine().split(" ");
                if (i == row2) {
                    for (String s : vals) {
                        answers2.add(Integer.parseInt(s));
                    }
                }
            }
            
            answers1.retainAll(answers2);
            
            System.out.print("Case #" + t + ": ");
            if (answers1.size() > 1) {
                System.out.println("Bad magician!");
            } else if (answers1.size() == 1) {
                System.out.println(answers1.get(0));
            } else {
                System.out.println("Volunteer cheated!");
            }
        }
    }
}
