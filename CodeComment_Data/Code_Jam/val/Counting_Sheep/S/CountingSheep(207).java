package methodEmbedding.Counting_Sheep.S.LYD1096;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class CountingSheep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input = new Scanner(new FileReader ("C:\\Users\\Michael\\Desktop\\A-small-attempt0.in"));
        int T = input.nextInt();
        String result = "";
        for (int z = 0; z < T; z++) {
            result += "Case #" + (z+1) + ": ";
            int N = input.nextInt();
            if(N == 0){
                result += "INSOMNIA\n";               
            }
            else{
                boolean nosleep = true;
                Set<Integer> set = new HashSet<>();
                int i = 1;
                while(nosleep){
                    int num = i * N;
                    int [] digits = Integer.toString(num).chars().map(c -> c-='0').toArray();
                    for (int digit : digits) {
                        set.add(digit);
                    }
                    boolean notfull = false;
                    for (int j = 0; j < 10; j++) {
                        if(!set.contains(j)){
                            notfull = true;
                            break;
                        }
                    }
                    if(!notfull){
                        nosleep = false;
                        result += num + "\n";
                    }
                    else{
                        i++;
                    }
                }
            }
        }
        try{
            PrintWriter writer = new PrintWriter(new File("C:\\Users\\Michael\\Desktop\\A-small-attempt0.out"));
            writer.write(result);
            writer.close();
        }
        catch(Exception e){
            System.out.println("exception " + e);
        }
    }
    
}
