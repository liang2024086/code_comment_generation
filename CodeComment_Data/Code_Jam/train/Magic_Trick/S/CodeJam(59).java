package methodEmbedding.Magic_Trick.S.LYD1145;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author zikaoinfo
 */
public class CodeJam {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("E:/A-small-attempt0.in");
        Scanner in = new Scanner(f);
        File fOut = new File("E:/out.txt");
        PrintWriter out = new PrintWriter(fOut);
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int firstChosenRow = in.nextInt();
            //System.out.println(":::" + firstChosenRow);
            for (int j = 0; j < 16; j++) {
                list1.add(in.nextInt());
            }

            int secondChosenRow = in.nextInt();
            //System.out.println(":::" + secondChosenRow);
            for (int j = 0; j < 16; j++) {
                list2.add(in.nextInt());
            }
            List<Integer> list1Chosen = new ArrayList();
            for (int j = (firstChosenRow - 1) * 4; j < firstChosenRow * 4; j++) {
                list1Chosen.add(list1.get(j));

            }

            List<Integer> list2Chosen = new ArrayList();
            for (int j = (secondChosenRow - 1) * 4; j < secondChosenRow * 4; j++) {
                list2Chosen.add(list2.get(j));
            }
            //System.out.println("<<<"+list1Chosen);
            ////System.out.println("<<<"+list2Chosen);
            int compt = 0;
            int existe = 0;
            for (int j = 0; j < list1Chosen.size(); j++) {
                int l1 = list1Chosen.get(j);
                for (int k = 0; k < list2Chosen.size(); k++) {
                    int l2 = list2Chosen.get(k);
                    if (l1 == l2) {
                        existe = l1;
                        compt++;
                        //System.out.println(l1+" = "+l2);
                    }
                }
            }
            list1.clear();
            list2.clear();

            list1Chosen.clear();
            list2Chosen.clear();
            int caseNumber=i+1;
            if (compt == 0) {
                out.println("Case #"+caseNumber+": Volunteer cheated!");
            } else if (compt == 1) {
                out.println("Case #"+caseNumber+": "+existe);
            } else if (compt > 0) {
                out.println("Case #"+caseNumber+": Bad magician!");
            }
        }
        out.close();
    }

}
