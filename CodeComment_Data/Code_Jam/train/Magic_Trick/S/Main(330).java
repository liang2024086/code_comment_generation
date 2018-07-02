package methodEmbedding.Magic_Trick.S.LYD2069;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krit
 */
public class Main {

    static final String NO_ANSWER = "Volunteer cheated!";
    static final String MULTIPLE_ANSWER = "Bad magician!";

    public static void main(String[] args) throws Exception {
        String inputFilePath = "C:\\Users\\krit\\Desktop\\input.txt";
        FileReader fr = new FileReader(inputFilePath);
        BufferedReader input = new BufferedReader(fr);
        String outputFilePath = "C:\\Users\\krit\\Desktop\\output.txt";
        FileWriter fw = new FileWriter(outputFilePath);
        BufferedWriter output = new BufferedWriter(fw);


        final int caseCnt = Integer.parseInt(input.readLine());

        for (int i = 0; i < caseCnt; i++) {
            final int caseNo = i + 1;
            int rowChosen = Integer.parseInt(input.readLine());
            for (int j = 0; j < rowChosen - 1; j++) {
                input.readLine();
            }
            List<String> rowContentString1 = new ArrayList<>(Arrays.asList(input.readLine().split(" ")));
            for (int j = 0; j < 4 - rowChosen; j++) {
                input.readLine();
            }
            rowChosen = Integer.parseInt(input.readLine());
            for (int j = 0; j < rowChosen - 1; j++) {
                input.readLine();
            }
            List<String> rowContentString2 = new ArrayList<>(Arrays.asList(input.readLine().split(" ")));
            for (int j = 0; j < 4 - rowChosen; j++) {
                input.readLine();
            }
            rowContentString1.retainAll(rowContentString2);

            output.write("Case #" + caseNo + ": ");
            if (rowContentString1.size() == 1) {
                output.write(rowContentString1.get(0));
            } else if (rowContentString1.isEmpty()) {
                output.write(NO_ANSWER);
            } else {
                output.write(MULTIPLE_ANSWER);
            }
            output.newLine();
        }
        input.close();
        output.close();
    }
}
