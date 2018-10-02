package methodEmbedding.Magic_Trick.S.LYD1358;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayowa-ideapad4500
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicTrick {
     public static void main(String args[]) throws FileNotFoundException {
          Scanner in = new Scanner(new File("A-small-attempt0.in"));
          PrintWriter pw = new PrintWriter(new File("output.txt"));
          
          int number = in.nextInt();
          
          int testcase = 1;
          for (int i = 0; i < number; i++) {
               ArrayList<Integer> list = new ArrayList<Integer>();
               
               int rowfirst = in.nextInt();
               int j = 1;
               while (j != rowfirst) {
                    in.nextInt();in.nextInt();in.nextInt();in.nextInt();
                    j++;
               }
               
               
               
               list.add(in.nextInt()); list.add(in.nextInt()); list.add(in.nextInt()); list.add(in.nextInt());
               
               while (j != 4) {
                    in.nextInt();in.nextInt();in.nextInt();in.nextInt();
                    j++;
               }
               
               int rowsecond = in.nextInt();
               j = 1;
               
               while (j!= rowsecond) {
                    in.nextInt();in.nextInt();in.nextInt();in.nextInt();
                    j++;
               }
               
               int containcount = 0;
               ArrayList<Integer> li = new ArrayList<Integer>();
               
               for (int k = 0; k < 4; k++) {
                    int thevalue = in.nextInt();
                    if (list.contains(thevalue)) {
                         li.add(thevalue);
                         containcount++;
                    }
               }
               
               if (containcount == 1 && li.size() == 1)
                    pw.println("Case #" + testcase + ": " + li.get(0));
               else if (containcount > 1)
                    pw.println("Case #" + testcase + ": Bad magician!" );
               else if (containcount == 0)
                    pw.println("Case #" + testcase + ": Volunteer cheated!" );
               
               testcase++;
               
               while (j != 4) {
                    in.nextInt();in.nextInt();in.nextInt();in.nextInt();
                    j++;
               }
               
               pw.flush();
          }
     }
     
}
