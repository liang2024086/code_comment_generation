package methodEmbedding.Magic_Trick.S.LYD69;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rong
 */
public class MagicTrick {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:/test.txt"));

        String line = null;
        line = reader.readLine().trim();

        int caseNum = Integer.parseInt(line);
        String resultPrefix = "Case #";
        String resultBad = "Bad magician!";
        String resultCheat = "Volunteer cheated!";

        int rowNum = 0;

        String[] nums = null;

        for (int i = 1; i <= caseNum; i++) {
            line = reader.readLine().trim();
            rowNum = Integer.parseInt(line);
            List<String> set1 = new LinkedList<String>();
            List<String> set2 = new LinkedList<String>();
            
            for (int j = 1; j <= 4; j++) {
                line = reader.readLine().trim();
                if (j == rowNum) {
                    nums = line.split("\\s+");
                    for (String s : nums) {
                        set1.add(s);
                    }
                }
            }
            line = reader.readLine().trim();
            rowNum = Integer.parseInt(line);
            for (int j = 1; j <= 4; j++) {
                line = reader.readLine().trim();
                if (j == rowNum) {
                    nums = line.split("\\s+");
                    for (String s : nums) {
                        set2.add(s);
                    }
                }
            }

            set1.retainAll(set2);

            if(set1.size() == 1){
                System.out.println(resultPrefix+i+": "+set1.get(0));
            }

            if(set1.size() == 0){
                System.out.println(resultPrefix+i+": "+resultCheat);
            }

            if(set1.size() > 1){
                System.out.println(resultPrefix+i+": "+resultBad);
            }
        }
    }
}
