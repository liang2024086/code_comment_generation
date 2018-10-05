package methodEmbedding.Magic_Trick.S.LYD2135;

/*
 * Copyright 1999-2004 Alibaba.com All right reserved. This software is the confidential and proprietary information of
 * Alibaba.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

/**
 * ??MagicTrick.java????????????TODO ??????????
 * 
 * @author noMoon Apr 12, 2014 1:04:35 PM
 */
public class MagicTrick {

    public static void main(String[] args) throws ClientProtocolException, IOException, InterruptedException {
        File file = new File("A-small-attempt3.in.txt");
        File outputFile = new File("MagicTrick.out");
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        // ????inputstream ????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line = br.readLine();
        int issueNumber = Integer.valueOf(line);
        for (int i = 0; i < issueNumber; i++) {
            line = br.readLine();
            int firstRow = Integer.valueOf(line);
            String firstChosenRow = null;
            for (int j = 1; j < 5; j++) {
                line = br.readLine();
                if (firstRow == j) {
                    firstChosenRow = line;
                }
            }
            line = br.readLine();
            int secondRow = Integer.valueOf(line);
            String secondChosenRow = null;
            for (int j = 1; j < 5; j++) {
                line = br.readLine();
                if (secondRow == j) {
                    secondChosenRow = line;
                }
            }
            List<String> solution = new ArrayList<String>();
            String[] firstRowList = firstChosenRow.split(" ");
            String[] secondRwoList = secondChosenRow.split(" ");
            for (String number1 : firstRowList) {
                for (String number2 : secondRwoList) {
                    if (number1.equals(number2)) {
                        solution.add(number1);
                    }
                }
            }
            bw.write("Case #" + String.valueOf(i + 1) + ": ");
            if (0 == solution.size()) {
                bw.write("Volunteer cheated!");
            } else if (1 == solution.size()) {
                bw.write(solution.get(0));
            } else {
                bw.write("Bad magician!");
            }
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
