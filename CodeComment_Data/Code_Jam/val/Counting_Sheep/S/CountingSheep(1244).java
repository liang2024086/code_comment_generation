package methodEmbedding.Counting_Sheep.S.LYD326;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by sidd on 4/8/16.
 */
public class CountingSheep {

    public static void main(String[] args) throws FileNotFoundException{

        Scanner in = new Scanner(new File("input.txt"));
        int n = in.nextInt();
        PrintWriter out = new PrintWriter(new File("output.txt"));

        for(int i = 1; i <= n; i++){
            int val = in.nextInt();
            if(val==0) out.println("Case #" + i + ": INSOMNIA");
            else {
                int count = 0;
                HashSet<Character> hs = new HashSet<Character>();
                int val2 = val;
                for (int j = '0'; j <= '9'; j++) {
                    hs.add((char) j);
                }
                Integer.toString(val);
                for (char c : Integer.toString(val).toCharArray()) {
                    hs.remove(c);
                }
                while (!hs.isEmpty() && count < 100) {
                    val2 += val;
                    for (char c : Integer.toString(val2).toCharArray()) {
                        if(hs.contains(c)) count = 0;
                        hs.remove(c);
                    }
                    count++;
                }
                if(count<100) out.println("Case #" + i + ": " + val2);
                else out.println("Case #" + i + ": INSOMNIA");
            }

        }

        out.close();

    }

}
