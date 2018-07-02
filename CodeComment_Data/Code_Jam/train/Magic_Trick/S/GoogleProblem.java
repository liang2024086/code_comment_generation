package methodEmbedding.Magic_Trick.S.LYD1742;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class GoogleProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/student/Downloads/A-small-attempt1.in")));
                FileWriter fw = new FileWriter("/home/student/Downloads/A-small-attempt1.out", true);) {
            List<String> lst = new ArrayList<>();
            String temp = "";
            while ((temp = br.readLine()) != null) {
                lst.add(temp);
            }
            if (lst.size() > 0) {
                int count = 0;
                int noOfCase = Integer.parseInt(lst.get(0));
                for (int i = 0; i < noOfCase; i++) {
                    List<String> lst1 = new ArrayList<>();
                    for (int j = 0; j < 10; j++) {
                        count++;
                        lst1.add(lst.get(count));
                    }
                    int firstLineNo = Integer.parseInt(lst1.get(0));
                    int secondLineNo = Integer.parseInt(lst1.get(5));
                    String arr1[] = lst1.get(firstLineNo).split(" ");
                    String arr2[] = lst1.get(5 + secondLineNo).split(" ");
                    int check = 0;
                    int no = 0;
                    for (int j = 0; j < arr1.length; j++) {
                        for (int k = 0; k < arr2.length; k++) {
                            //System.out.println(arr1[j] + " " + arr2[k]);
                            if (Integer.parseInt(arr1[j]) == Integer.parseInt(arr2[k])) {
                                //System.out.println("Deepak");
                                check++;
                                no = Integer.parseInt(arr1[j]);
                            }
                        }
                    }
                    if (check == 0) {
                        fw.write("Case #" + (i + 1) + ": Volunteer cheated!\n");
                    } else if (check == 1) {
                        fw.write("Case #" + (i + 1) + ": " + no + "\n");

                    } else {
                        fw.write("Case #" + (i + 1) + ": Bad magician!\n");

                    }

                }
            }
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }

}
