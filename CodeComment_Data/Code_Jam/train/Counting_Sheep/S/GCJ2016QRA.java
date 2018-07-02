package methodEmbedding.Counting_Sheep.S.LYD318;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by sami on 08/04/2016.
 */
public class GCJ2016QRA {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("A-small-attempt0.in"));
        PrintWriter out = new PrintWriter(new File("output.txt"));
        int T = in.nextInt();
        for (int c = 1; c <= T; c++){
            /////////////////////////////////////
            //System.out.println("Checking: " + c);
            int[] na = new int[10];
            int i = 1;
            boolean b = false;
            int N = in.nextInt();
            if(N == 0){
                out.println("Case #" + c + ": INSOMNIA");
                continue;
            }

            while(!b){
                int t = N * i;
                String s = Integer.toString(t);
                char[] ds = s.toCharArray();
                for(int j = 0; j < ds.length; j++){
                    na[Integer.parseInt(Character.toString(ds[j]))] += 1;
                }

                for (int j = 0; j < 10; j++){
                    if(na[j] == 0)
                        break;
                    if(j == 9 && na[j] != 0) {
                        b = true;
                        //System.out.println(t);
                        out.println("Case #" + c + ": " + t);
                    }
                }
                i++;
            }

            /////////////////////////////////////

        }

        in.close();
        out.close();
    }
}
