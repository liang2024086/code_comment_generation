package methodEmbedding.Standing_Ovation.S.LYD526;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Rian
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int it = 0;
        File f1 = new File("file.in");
        File f2 = new File("file.out");
        //Scanner sc = new Scanner(System.in);
        Scanner scan = null;
        int[] counti = new int[1000];
        String[] counts = new String[1000];
        int[] result = new int[1000];
        try{
           scan = new Scanner(f1);
        }
        catch(Exception e){
           System.exit(0);
        }
        it = scan.nextInt();
        for (int i=0;i<it;i++){
            counti[i] = scan.nextInt();
            counts[i] = scan.nextLine().substring(1);
        }
        scan.close();
        for (int i=0;i<it;i++){
            if (counti[i]==0) result[i] = 0;
            else {
                int temp = 0;
                int sum = 0;
                for (int j=0;j<counti[i];j++){
                    sum += Character.getNumericValue(counts[i].charAt(j));
                    System.out.println(sum);
                    System.out.println(j+1);
                    System.out.println();
                    if (sum < j+1){
                        temp += 1;
                        sum += 1;
                    }
                }
                result[i] = temp;
            }
        }
        FileWriter fw = new FileWriter("file.out");
        PrintWriter pw = new PrintWriter(fw);
        for (int i=0;i<it;i++){
            pw.println("Case #" + (i+1) +": " + result[i]);
        }
        pw.flush();
        pw.close();
        fw.close();
    }
}
