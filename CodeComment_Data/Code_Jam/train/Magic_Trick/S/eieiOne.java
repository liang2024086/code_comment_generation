package methodEmbedding.Magic_Trick.S.LYD1381;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author chakree30584
 */
public class eieiOne {

    public static void main(String[] args) {
        try {

            PrintStream console = System.out;
            File file = new File("/Users/chakree30584/NetBeansProjects/Codejam/src/codejam/output.txt");
            FileOutputStream fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);


            Scanner sc = new Scanner(new File("/Users/chakree30584/NetBeansProjects/Codejam/src/codejam/input.txt"));
            int num = sc.nextInt(); //Number of Test Set
            System.out.println("Test Set : " + num);
            String input[] = new String[num + 1];


            System.setOut(ps);
            //System.setOut(console);
            for (int z = 1; z <= num; z++) {
                List<Integer> selrow1 = new ArrayList<Integer>();
                List<Integer> selrow2 = new ArrayList<Integer>();
                List<Integer> result = new ArrayList<Integer>();
                int sel = sc.nextInt();
                int first = sel;
                //System.out.println("First Question Choose :" + sel);
                if (sel == 1) {
                    for (int i = 1; i <= 4; i++) {
                        selrow1.add(sc.nextInt());
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                } else if (sel == 2) {
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        selrow1.add(sc.nextInt());
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                } else if (sel == 3) {
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        selrow1.add(sc.nextInt());
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                } else if (sel == 4) {
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        selrow1.add(sc.nextInt());
                    }
                }
                sel = sc.nextInt();
                int second = sel;
                //System.out.println("Second Question Choose :" + sel);
                if (sel == 1) {
                    for (int i = 1; i <= 4; i++) {
                        selrow2.add(sc.nextInt());
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                } else if (sel == 2) {
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        selrow2.add(sc.nextInt());
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                } else if (sel == 3) {
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        selrow2.add(sc.nextInt());
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                } else if (sel == 4) {
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        sc.nextInt();
                    }
                    for (int i = 1; i <= 4; i++) {
                        selrow2.add(sc.nextInt());
                    }
                }
                for (int j = 0; j < selrow1.size(); j++) {
                    for (int i = 0; i < selrow2.size(); i++) {
                        if (selrow2.get(i) == selrow1.get(j)) {
                            result.add(selrow1.get(j));
                        }
                    }
                }
                if(result.size()==0){
                    System.out.println("Case #"+z+": Volunteer cheated!");
                }else if(result.size()==1){
                    System.out.println("Case #"+z+": "+result.get(0));
                }else{
                    System.out.println("Case #"+z+": Bad magician!");
                }

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
