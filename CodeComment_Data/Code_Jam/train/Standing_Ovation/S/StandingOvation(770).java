package methodEmbedding.Standing_Ovation.S.LYD1493;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mkozeny
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = null;
        long time = System.currentTimeMillis();

        try {

            File file = new File("result.out");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            String sCurrentLine;

            br = new BufferedReader(new FileReader("A-small-attempt0.in"));
            //br = new BufferedReader(new FileReader("A-large-practice.in"));
            //br = new BufferedReader(new FileReader("test.in"));

            Integer numberOfTestCases = 0;
            if ((sCurrentLine = br.readLine()) != null) {
                numberOfTestCases = Integer.parseInt(sCurrentLine);
            }
            for (int i = 0; i < numberOfTestCases; i++) {
                String [] testCase = null;
                if ((sCurrentLine = br.readLine()) != null) {
                    testCase = sCurrentLine.split(" ");
                }
                Long sMax = Long.parseLong(testCase[0]);
                String audience = testCase[1];
                boolean leadingZeros = true;
                Long actualTotalStands = 0L;
                Long minimumNumberOfFriendsToInvite = 0L;
                for(Integer j = 0; j < audience.length(); j++) {
                    if(audience.charAt(j) != '0') {
                        leadingZeros = false;
                    }
                    if(audience.charAt(j) == '0') {
                        if(leadingZeros) {
                            actualTotalStands++;
                            minimumNumberOfFriendsToInvite++;
                        } else if(j.longValue() >= actualTotalStands) {
                            Long diff = (j.longValue() - actualTotalStands) + 1L;
                            actualTotalStands += diff;
                            minimumNumberOfFriendsToInvite += diff;
                        }
                    } else {
                        actualTotalStands += Long.parseLong(String.valueOf(audience.charAt(j)));
                    }
                }
                String resultStr = "Case #" + (i + 1) + ": " + minimumNumberOfFriendsToInvite + "\n";
                System.out.print(resultStr);
                bw.write(resultStr);
            }
    
            System.out.println("Total time: " + (System.currentTimeMillis() - time) + " ms");
            bw.close();
    
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
    
}
