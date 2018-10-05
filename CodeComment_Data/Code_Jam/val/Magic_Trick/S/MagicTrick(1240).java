package methodEmbedding.Magic_Trick.S.LYD1985;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author prashant
 */
public class MagicTrick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int[] matrix = new int[16];
            for (int j = 0; j < matrix.length; j++) {
                matrix[j] = 2;
            }
            
            int row_id1 = Integer.parseInt(br.readLine());
            String str = null;
            String temp = null;
            for (int j = 0; j < 4; j++) {
                if (j == row_id1-1) 
                    str = br.readLine();
                else
                    temp = br.readLine();  
            }
            
            String[] num = str.split(" ");
            for (int j = 0; j < num.length; j++) {
                matrix[Integer.parseInt(num[j])-1]--;
            }
            
            row_id1 = Integer.parseInt(br.readLine());
            for (int j = 0; j < 4; j++) {
                if (j == row_id1-1) 
                    str = br.readLine();
                else
                    temp = br.readLine();  
            }
            
            num = str.split(" ");
            for (int j = 0; j < num.length; j++) {
                matrix[Integer.parseInt(num[j])-1]--;
            }
            int num_zero = 0;
            int index = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j] == 0) {
                    num_zero++;
                    index = j+1;
                }
            }
            if (num_zero == 0) {
                System.out.println("Case #"+Integer.toString(i+1)+": "+"Volunteer cheated!");
            }
            else if (num_zero == 1) {
                System.out.println("Case #"+Integer.toString(i+1)+": "+index);
            }
            else
            {
                System.out.println("Case #"+Integer.toString(i+1)+": "+"Bad magician!");
            }
        }
    }
}
