package methodEmbedding.Cookie_Clicker_Alpha.S.LYD570;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mohamed;
 */
public class MagicTrick {

    public static void main(String args[]) {
        String[][] list1 = new String[4][4];
        int firstRow;
        String[][] list2 = new String[4][4];
        int count;
        int element = 0;
        BufferedWriter dataOut=null;
        try {
            BufferedReader dataIn = new BufferedReader(new FileReader(new File("A-small-attempt2.in")));
            dataOut=new BufferedWriter(new FileWriter(new File("A-small-attempt2.out")));
            int cases = Integer.parseInt(dataIn.readLine().toString());
            for (int i = 0; i < cases; i++) {
                count = 0;
                firstRow = 0;
                int firstIn = Integer.parseInt(dataIn.readLine().toString()) - 1;
                list1[0] = dataIn.readLine().split(" ");
                list1[1] = dataIn.readLine().split(" ");
                list1[2] = dataIn.readLine().split(" ");
                list1[3] = dataIn.readLine().split(" ");
                int secondIn = Integer.parseInt(dataIn.readLine().toString()) - 1;
                list2[0] = dataIn.readLine().split(" ");
                list2[1] = dataIn.readLine().split(" ");
                list2[2] = dataIn.readLine().split(" ");
                list2[3] = dataIn.readLine().split(" ");
                for (int j = 0; j < 4; j++) {
                    firstRow = firstRow | (int) Math.pow(2, Integer.parseInt(list1[firstIn][j]));
                }
                for (int j = 0; j < 4; j++) {
                    if ((firstRow & ((int) Math.pow(2, Integer.parseInt(list2[secondIn][j])))) != 0) {
                        count++;
                        element = Integer.parseInt(list2[secondIn][j]);
                    }
                }
                if (count == 0) {
                    dataOut.write("Case #" + (i+1) + ": Volunteer cheated!\n");
                } else if (count == 1) {
                    dataOut.write("Case #" + (i+1) + ": " + element+"\n");
                } else {
                    dataOut.write("Case #" + (i+1) + ": Bad magician!\n");
                }
                dataOut.flush();
            }

        } catch (Exception ex) {
         
        }finally{
            try {
                dataOut.close();
            } catch (IOException ex) {
         
            }
        }

    }

}
