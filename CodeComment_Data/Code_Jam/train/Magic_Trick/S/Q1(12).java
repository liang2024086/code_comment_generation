package methodEmbedding.Magic_Trick.S.LYD957;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Va??ek
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("in.txt")));
            String line;
            int cases = Integer.parseInt(br.readLine());
            for (int i = 0; i < cases; i++) {
                System.out.print("Case #" + (i + 1) + ": ");
                int ans = Integer.parseInt(br.readLine());
                for (int j = 0; j < ans - 1; j++) {
                    br.readLine();
                }
                String[] split = br.readLine().split(" ");
                int[] row = new int[4];
                for (int j = 0; j < 4; j++) {
                    row[j] = Integer.parseInt(split[j]);
                }
                for (int j = 0; j < 4 - ans; j++) {
                    br.readLine();
                }
                //druh??
                ans = Integer.parseInt(br.readLine());
                for (int j = 0; j < ans - 1; j++) {
                    br.readLine();
                }
                split = br.readLine().split(" ");
                int[] row2 = new int[4];
                int found = 0;
                int res = -1;
                for (int j = 0; j < 4; j++) {
                    if (found > 1) {
                        break;
                    }
                    row2[j] = Integer.parseInt(split[j]);
                    for (int k = 0; k < 4; k++) {
                        if (row2[j] == row[k]) {
                            if (found == 0) {
                                res = row2[j];
                                found++;
                            } else {
                                found++;
                                System.out.println("Bad magician!");
                            }
                            break;
                        }
                    }
                }
                if(found==1){
                    System.out.println(res);
                } else if(found==0){
                    System.out.println("Volunteer cheated!");
                }
                for (int j = 0; j < 4 - ans; j++) {
                    br.readLine();
                }
            }
            while ((line = br.readLine()) != null) {
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
