package methodEmbedding.Standing_Ovation.S.LYD960;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Codejam {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("A-small-attempt1.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("out.txt")));
        //Scanner sc = new Scanner(new File("a.txt"));
        int T  = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int count = 0;
            int sum = 0;
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                int num = (s.charAt(j))-48;
                //System.out.println(sum + " " + j);
                if(sum < j){
                    count++;
                    sum++;
                }
                sum += num;
            }
            //System.out.println("Case #" + (i+1) + ": " + count);
            bw.write("Case #" + (i+1) + ": " + count);
            bw.newLine();
            
        }
        bw.close();
    }
    
}
