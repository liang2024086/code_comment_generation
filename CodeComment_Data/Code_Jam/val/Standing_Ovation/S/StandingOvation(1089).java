package methodEmbedding.Standing_Ovation.S.LYD2040;

import java.util.Scanner;

/**
 * Created by shereifhawary on 4/11/15.
 */
public class StandingOvation {
    public static void main(String ... args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 1 ; i<= T ; i++) {
            int count = 0;
            int size = scanner.nextInt();
            String res = scanner.next();
            int j = 0;
            int shyneesCount = 0;
            for(char c : res.toCharArray()){
                if(shyneesCount < j) {
                    int remain = j-shyneesCount;
                    count+= remain;
                    shyneesCount += remain ;
                }
                shyneesCount+= c-'0';
                j++;
            }

            System.out.println("Case #"+i+": "+count);

        }
    }
}

