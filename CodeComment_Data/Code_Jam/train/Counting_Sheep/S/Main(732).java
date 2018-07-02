package methodEmbedding.Counting_Sheep.S.LYD748;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author Uday Kandpal
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(new File("a_small.in")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("a_small.out")));
        int t = Integer.parseInt(br.readLine());
        int caseT = 1;
        while (t-- > 0) {
            boolean what = true;
            int num = Integer.parseInt(br.readLine());
            bw.write("Case #" + caseT++ + ": ");
            int number = num;
            if (number > 1000000 || number == 0) {
                bw.write("INSOMNIA\n");
            } else {
                int multiple = 1;
                int digits[] = new int[10];
                while (number > 0) {
                    int calculate = number;
                    while (calculate != 0) {
                        int digit = calculate % 10;
                        digits[digit]++;
                        calculate /= 10;
                    }
                    what = true;
                    for (int i = 0; i < 10; i++) {
                        if (digits[i] == 0) {
                            what = false;
                        }
                    }
                    if (what) {
                        break;
                    }
                    multiple++;
                    number = num * multiple;
                }
                if (what) {
                    bw.write(number+"\n");
                } else {
                    bw.write("INSOMNIA\n");
                }
            }
        }
        bw.close();
        br.close();
    }
}
