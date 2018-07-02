package methodEmbedding.Standing_Ovation.S.LYD966;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author MahmooD
 */
public class StandingOvation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter("result.out");
        int T = in.nextInt();
        for(int i = 0; i< T; i++){
            int S_max = in.nextInt();
            String people = in.next();
            int add = 0;
            char[] peopleArray = people.toCharArray();
            int counter =0;
            for(int j = 0; j < peopleArray.length; j++){
                if(Integer.parseInt(""+peopleArray[j])> 0){
                    if(j <= counter){
                        counter +=Integer.parseInt(""+peopleArray[j]);
                    }else{
                        add += j - counter;
                        counter += add;
                        counter +=Integer.parseInt(""+peopleArray[j]);
                    }
                    
                }
            }
            out.println ("Case #" + (i+1)+": " + add);
            
            
            
        }
        out.flush();
        out.close();
    }
}
