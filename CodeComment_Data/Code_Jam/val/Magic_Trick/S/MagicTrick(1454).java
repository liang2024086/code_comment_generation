package methodEmbedding.Magic_Trick.S.LYD532;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class MagicTrick {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.out")));
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt() + 1;
        int row;
        int[] numbers;
        String r;
        for (int t = 1; t < testCases; t++) {
            numbers = new int[17];
            for (int i = 0; i < 2; i++) {
                row = in.nextInt();
                for (int j = 1; j < 5; j++) {
                    for (int k = 0; k < 4; k++) {
                        if (j == row) {
                            numbers[in.nextInt()]++;
                        } else {
                            in.nextInt();
                        }
                    }
                }
            }
            r = null;
            for (int i = 1; i < 17; i++) {
                if(numbers[i]>1) {
                    if(r==null) {
                        r = Integer.toString(i); 
                    }else{
                       r = "Bad magician!";
                       break;
                    }
                }
            }
            bw.write("Case #" + t + ": "+((r!=null)?r:"Volunteer cheated!"));
            if(t!=testCases-1) {
                bw.newLine();
            }
        }
        bw.close();
    }
}
