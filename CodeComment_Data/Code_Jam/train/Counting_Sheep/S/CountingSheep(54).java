package methodEmbedding.Counting_Sheep.S.LYD1270;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Akash on 4/10/2016.
 */
public class CountingSheep {

    public static void main(String[] args) throws IOException{
        FileReader in = new FileReader("input1.txt");
        BufferedReader br = new BufferedReader(in);
        //System.out.print(br.readLine());

        FileWriter out = new FileWriter("output.txt");

        int t = Integer.parseInt(br.readLine());

        int t1 = t;

        while(t-- > 0) {
            long input = Long.parseLong(br.readLine());

            int[] cnt = new int[10];

            for (int i = 0; i < 10; i++) {
                cnt[i] = 0;
            }

            int count = 0;
            long mul = 1;
            long tmp = input, tmp1 = input;

            int test = t1 - t;
            out.write("Case #" + String.valueOf(test) + ": ");

            if(input == 0) {
                out.write(String.valueOf("INSOMNIA") + "\n");
            } else {

                while (count != 10) {
                    tmp = input * mul;
                    tmp1 = tmp;

                    while (tmp != 0) {
                        int rem = (int) (tmp % 10);
                        if (cnt[rem] == 0) {
                            cnt[rem]++;
                            count++;
                        }
                        tmp = tmp / 10;
                    }
                    mul++;

                }
                out.write(String.valueOf(tmp1) + "\n");
            }

        }
        out.close();
    }
}
