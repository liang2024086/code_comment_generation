package methodEmbedding.Counting_Sheep.S.LYD1384;

/**
 * Created by Hojae on 4/8/2016.
 */
import java.util.*;
import java.io.*;

public class CountingSheep {

    public static void main(String... args)throws Exception{
        Scanner scan = new Scanner(new File("A-small-attempt0.in"));
        File out = new File("output.txt");
        FileWriter fWriter = new FileWriter (out);
        PrintWriter pWriter = new PrintWriter (fWriter);
        int n, x, count;
        boolean[] seen;
        String current, text;
        text = "";
        n = Integer.parseInt(scan.nextLine().trim());
        for(int i=0; i<n; i++){
            seen = new boolean[10];
            count = 0;
            x = Integer.parseInt(scan.nextLine().trim());
            if(x == 0){
                for(int j=0; j<10; j++)
                    seen[j] = true;
                text = "INSOMNIA";
            }
            while(!(seen[0] && seen[1] && seen[2] && seen[3] && seen[4] && seen[5] && seen[6] && seen[7] && seen[8] && seen[9])){
                count++;
                current = Integer.toString(count * x);
                for(int j=0; j<10; j++){
                    if(current.contains(Integer.toString(j)))
                        seen[j] = true;
                }
                text = Integer.toString(count * x);
            }
            pWriter.println("Case #" + (i+1) + ": " + text);
        }
        pWriter.close();
    }

}
