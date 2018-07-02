package methodEmbedding.Counting_Sheep.S.LYD1142;

/**
 * Created by jmeng on 4/8/16.
 */

import java.io.*;

public class CountingSheep {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("/Users/jmeng/Downloads/A-small-attempt2.in"));

        int n = Integer.parseInt(br.readLine());
        boolean[] record;
        int mark;
        PrintStream out = new PrintStream(new FileOutputStream("/Users/jmeng/Documents/codeJam/CountingSheep.txt"));
        System.setOut(out);

        for(int i = 0; i < n; i++){
            String num = br.readLine();
            record = new boolean[10];
            mark = 0;
            if(Integer.parseInt(num) == 0)
            {
                System.out.println("Case #"+(i+1) +": INSOMNIA");
            }
            else {
                int k = 0;
                while(true) {
                    k++;
                    String knum = String.valueOf(k* Integer.parseInt(num));
                    int len = knum.length();
                    int c;
                    for (int j = 0; j < len; j++) {
                        c = knum.charAt(j) - '0';
                        if (record[c] == false) {
                            record[c] = true;
                            mark++;
                        }
                    }
                    if (mark == 10) {
                        System.out.println("Case #" + (i + 1) + ": " + knum);
                        break;
                    }
                }
            }
        }



    }
}
