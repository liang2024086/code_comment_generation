package methodEmbedding.Standing_Ovation.S.LYD1623;


import java.util.*;

/**
 *
 * @author Hisham
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T = Integer.parseInt(input.nextLine());

        for (int t = 0; t < T; t++) {
            String testCase = input.nextLine();
            String audience = testCase.split(" ")[1];
            int maxShyness = Integer.parseInt(testCase.split(" ")[0]);
            
            int totalAudience = 0, neededAudience = 0;
            for (int i = 0; i < audience.length(); i++) {
                if(maxShyness == 0) break;
                if (totalAudience < i) {
                    neededAudience += (i - totalAudience);
                    totalAudience = i; 
                }
                totalAudience += Integer.parseInt(audience.charAt(i) + "");
            }

            System.out.println(String.format("Case #%s: %2d", t + 1, neededAudience));
        }
    }

}
