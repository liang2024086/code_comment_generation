package methodEmbedding.Counting_Sheep.S.LYD157;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CodeJemA {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(input.readLine());
         HashSet<Character> out ;
        for (int i = 0; i < num; i++) {
          out = new HashSet<>();
          long number = Integer.parseInt(input.readLine());
            if (number==0) {
                System.out.printf("Case #%d: INSOMNIA\n",(i+1));
                continue;
            }
          int x =1;
          String name ="";
            while (out.size()<10) {
              name  = (number*x)+"";
                for (int j = 0; j < name.length(); j++) {
                    out.add(name.charAt(j));
                }
                x++;
            }
            
            System.out.printf("Case #%d: %s\n",(i+1),name);
        }
    }
}


