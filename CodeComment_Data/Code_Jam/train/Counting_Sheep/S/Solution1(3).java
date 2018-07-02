package methodEmbedding.Counting_Sheep.S.LYD1455;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) throws FileNotFoundException{
        File infile = new File("in/A-small-attempt1.in");
        PrintWriter out = new PrintWriter("out/counting_Sheep-output.txt");
        Scanner in = new Scanner(infile);
        ArrayList<Integer> list = new ArrayList<>();
        int cases = Integer.valueOf(in.nextLine());
        int total = 0;

        for(int i = 1; i <= cases; i++){
            String line = in.nextLine();
            int N = Integer.valueOf(line);
            int count = 1;

            out.write("Case #" + i + ": ");
            if(N == 0){
                out.write("INSOMNIA\n");
                continue;
            }

            while(list.size() < 10){
                total = count * N;
                String tmp = Integer.toString(total);
                for(int j = 0; j < tmp.length(); j++){
                    int digit = Character.getNumericValue(tmp.charAt(j));
                    if(!list.contains(digit)) {
                        list.add(digit);
                    }
                }
                count++;
            }
            out.write(total + "\n");
            list.clear();
        }

        out.close();
        in.close();
    }
}
