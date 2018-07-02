package methodEmbedding.Standing_Ovation.S.LYD2160;


import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Arman
 */
public class Main {

    public static void main(String[] args) {
        Scanner inn = new Scanner(new InputStreamReader(System.in));
        int n = inn.nextInt();
        ArrayList<Integer> s_max = new ArrayList<Integer>();
        ArrayList<String> s_string = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            int id = inn.nextInt();
            String score = inn.next();
            s_max.add(id);
            s_string.add(score);
        }

        int totalCurrent = 0;
        int totalNeed = 0;
        for (int i = 0; i < n; i++) {
            String testCase = s_string.get(i);
            totalCurrent = Integer.parseInt(testCase.charAt(0) + "");
            totalNeed = 0;
            for(int j = 1; j < testCase.length(); j++){
                int levelC = Integer.parseInt(testCase.charAt(j) + "");
                if(levelC == 0) continue;
                if(totalCurrent < j){
                    totalNeed += j - totalCurrent;
                    totalCurrent += j - totalCurrent;
                }
                totalCurrent += levelC;
            }
            System.out.println("Case #" + (i+1) + ": " + totalNeed);
        }
    }

}
