package methodEmbedding.Standing_Ovation.S.LYD1550;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
//import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Problem_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int curStanding;
        int req;
        List<String> stringseq = new ArrayList<String>();
        List<String> stringoutput = new ArrayList<String>();
        //Scanner in = new Scanner(new BufferedInputStream(System.in));
        //System.out.println("Enter strings, and type\"quit\" to finish input");
        /*while (!(in.nextLine().equals("quit"))) {
         String s = in.nextLine();
         stringseq.add(s);
         }*/
        try {
            File file = new File("A-small-attempt1.in");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
                stringseq.add(line);
            }
            fileReader.close();
            bufferedReader.close();
            System.out.println("Contents of file:");
            System.out.println(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int line = Integer.parseInt(stringseq.get(0));
        for (int i = 1; i <= line; i++) {
            String[] testcase = stringseq.get(i).split("\\s+");
            int Smax = Integer.parseInt(testcase[0]);
            String seq = testcase[1];
            curStanding = 0;
            req = 0;
            for (int j = 0; j <= Smax; j++) {
                if (j == 0) {
                    curStanding = Character.getNumericValue(seq.charAt(0));
                } else if (Character.getNumericValue(seq.charAt(j)) == 0) {
                    continue;
                } else {
                    if (curStanding < j) {
                        req = req + j - curStanding;
                        curStanding = j + Character.getNumericValue(seq.charAt(j));
                    } else {
                        curStanding = curStanding + Character.getNumericValue(seq.charAt(j));
                    }
                }
            }
            stringoutput.add("Case #" + i + ": " + req);
        }

        try {
            File file = new File("output.txt");
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (int m = 0; m < stringoutput.size(); m++) {
                bw.write(stringoutput.get(m));
                bw.newLine();
            }
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
