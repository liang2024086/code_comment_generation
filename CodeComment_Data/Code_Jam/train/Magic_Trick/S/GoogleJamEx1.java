package methodEmbedding.Magic_Trick.S.LYD1452;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class GoogleJamEx1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream(new File("./input.txt"));
        BufferedReader reader;
        reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder out = new StringBuilder();
        String line;
        int testCase = 0;
        int[] answers = new int[2];
        //int[][] distrib1 = new int[4][4];
        ArrayList<ArrayList<Integer>> distrib1 = null; 
        ArrayList<ArrayList<Integer>> distrib2 = null;
        int game = 0;
        line = reader.readLine();
        if (line != null) {
            testCase = Integer.parseInt(line);
        } else {
            exit(0);
        }

        while (testCase-- > 0) {
            game++;
            distrib1 = new ArrayList<ArrayList<Integer>>();
            distrib2 = new ArrayList<ArrayList<Integer>>();
            line = reader.readLine();
            answers[0] = Integer.parseInt(line);

            int i = 0;
            int j = 0;
            while (i < 4) {
                j = 0;
                line = reader.readLine();
                if (line == null) {
                    exit(0);
                }
                String[] split = line.split(" ");
                ArrayList<Integer> subDistrib = new ArrayList<Integer>();
                for (String card : split) {
                    subDistrib.add(Integer.parseInt(card));
                    j++;
                }
                distrib1.add(subDistrib);
                ++i;
            }
            line = reader.readLine();
            answers[1] = Integer.parseInt(line);
            i = 0;
            j = 0;
            while (i < 4) {
                j = 0;
                line = reader.readLine();
                if (line == null) {
                    exit(0);
                }
                String[] split = line.split(" ");
                ArrayList<Integer> subDistrib = new ArrayList<Integer>();
                for (String card : split) {
                    subDistrib.add(Integer.parseInt(card));
                    j++;
                }
                distrib2.add(subDistrib);
                ++i;
            }
            
            //game
            //System.out.println("game nb:" + testCase);
            //System.out.println(distrib1);
            //System.out.println(distrib2);
            List<Integer> firstPick = distrib1.get(answers[0]-1);
            List<Integer> secondPick = distrib2.get(answers[1]-1);
            //System.out.println("Carte dans :" + firstPick);
            //System.out.println("et dans :" + secondPick);
            firstPick.retainAll(secondPick);
            System.out.print("Case #"+game+": ");
            if (firstPick.size() == 1) {
                System.out.println(firstPick.get(0));
            } else if (firstPick.size() < 1) {
                System.out.println("Volunteer cheated!");
            } else {
                System.out.println("Bad magician!");
            }
            
            
            //Case #2: Bad magician!
            //Case #3: Volunteer cheated!
        }

        reader.close();
    }

}
