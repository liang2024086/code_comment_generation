package methodEmbedding.Magic_Trick.S.LYD1672;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Nimesha
 */
public class CodeJam2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File input = new File("C:\\Users\\Nimesha\\Desktop\\2014\\A-small-attempt0.in");
            FileReader fr = new FileReader(input);
            BufferedReader br = new BufferedReader(fr);
            PrintWriter out = new PrintWriter(new File("C:\\Users\\Nimesha\\Desktop\\2014\\A-small-ans.in"));
            String no = br.readLine();
            int number = Integer.parseInt(no);
            for (int h = 0; h <= number - 1; h++) {
                int row1 = Integer.parseInt(br.readLine());
                String line[][] = new String[4][4];
                line[0] = br.readLine().split(" ");
                line[1] = br.readLine().split(" ");
                line[2] = br.readLine().split(" ");
                line[3] = br.readLine().split(" ");
                String answer="";
                
                Vector v = new Vector();
                v.add(line[row1-1][0]);
                v.add(line[row1-1][1]);
                v.add(line[row1-1][2]);
                v.add(line[row1-1][3]);
                
                
                int row2 = Integer.parseInt(br.readLine());
                String line2[][] = new String[4][4];
                line2[0] = br.readLine().split(" ");
                line2[1] = br.readLine().split(" ");
                line2[2] = br.readLine().split(" ");
                line2[3] = br.readLine().split(" ");
                
               int f = 0;
               String k = "";
                for (int i =0; i<4;i++){
                    if (v.contains(line2[row2-1][i])){
                        f++;
                        k = line2[row2-1][i];
                    }
                }
                if (f==1)
                {
                    answer = k;
                }else if (f ==0){
                    answer = "Volunteer cheated!";
                }else{
                    answer = "Bad magician!";
                }
                //System.out.println(answer);
                int m = 1 + h;
                String ans = "Case #" + m + ": " + answer;
                out.println(ans);
                out.flush();

            }
            br.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
