package methodEmbedding.Counting_Sheep.S.LYD1187;

import java.io.*;
import java.util.*;
import java.lang.*;

class countingsheep {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader (new FileReader ("A-small-attempt0.in.txt"));
        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("countingsheep.out")));
        int n = Integer.parseInt(input.readLine());
        int x;
        boolean[] seen;
        for(int i = 0; i<n;i++){
            x = Integer.parseInt(input.readLine());
            seen = new boolean[10];
            for(int j = 1; j<=100; j++) { //cycles after 10 times
                int temp = x * j;
                while(temp != 0) {
                    seen[temp%10] = true;
                    temp /= 10;
                }
                // if seen is all true, break and print temp
                if(seen[0] == true && seen[1] == true && seen[2] == true && seen[3] == true &&
                seen[4] == true && seen[5] == true && seen[6] == true && seen[7] == true &&
                seen[8] == true && seen[9] == true) {
                    output.println("Case #" + (i+1) + ": " + (x*j));
                    break;
                }
            }
            // if seen is not all true, print insomnia
            if(seen[0] == false || seen[1] == false || seen[2] == false || seen[3] == false ||
            seen[4] == false || seen[5] == false || seen[6] == false || seen[7] == false ||
            seen[8] == false || seen[9] == false) {
                output.println("Case #" + (i+1) + ": INSOMNIA");
            }

        }
        output.close();
        input.close();
    }
}
