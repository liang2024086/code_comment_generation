package methodEmbedding.Counting_Sheep.S.LYD1421;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raakesh-3083
 */
public class CountingSheepCodeJam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        byte check = 0;

        try {

            String input;
            int testcaseno = 0;

            int totaltestcases = scanner.nextInt();

            for (int p = 0; p < totaltestcases; p++) {

                input = scanner.next();

                ArrayList<Byte> numberlist = new ArrayList<Byte>();

                for (byte i = 0; i < 10; i++) {
                    numberlist.add(i);
                }
                testcaseno++;
                String[] Nsplit = input.split("");

                for (int i = 0; i < Nsplit.length; i++) {
                    byte temp = Byte.parseByte(Nsplit[i]);
                    for (int j = 0; j < numberlist.size(); j++) {
                        if (numberlist.get(j) == temp) {
                            numberlist.remove(j);
                            break;
                        }
                    }
                }
                if (Integer.parseInt(input) == 0) {
                    System.out.println("Case #" + testcaseno + ": INSOMNIA");
                } else if (numberlist.size() == 0) {
                    System.out.println("Case #" + testcaseno + ": " + input);
                } else {
                    int i = 2;
                    while (true) {
                        int N = Integer.parseInt(input) * i;
                        i++;
                        String[] Nsplit1 = String.valueOf(N).split("");
                        for (int k = 0; k < Nsplit1.length; k++) {
                            byte temp = Byte.parseByte(Nsplit1[k]);
                            for (int j = 0; j < numberlist.size(); j++) {
                                if (numberlist.get(j) == temp) {
                                    numberlist.remove(j);
                                    break;
                                }
                            }
                        }
                        if (numberlist.size() == 0) {
                            System.out.println("Case #" + testcaseno + ": " + N);
                            break;
                        }
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
