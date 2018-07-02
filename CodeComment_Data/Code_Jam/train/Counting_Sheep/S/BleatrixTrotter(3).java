package methodEmbedding.Counting_Sheep.S.LYD111;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by sams on 4/9/2016.
 */
public class BleatrixTrotter {
    public static void main( String [] args) throws FileNotFoundException {
        boolean numbers[] = new boolean[10];
        Scanner input = new Scanner(new File("C:\\Users\\sams\\Downloads\\A-small-attempt1.in"));
        PrintWriter output = new PrintWriter(new File("output.txt"));
        int numInputs = input.nextInt();
        int n;
        for(int i = 1; i< numInputs+1; i++){
            n = input.nextInt();
            String nString = n +"";
            int multipler = 2;
            boolean allTrue = false;
            for(int k = 0; k<10;k++){
                numbers[k] = false;
            }
            while(!allTrue) {
                for (int l = 0; l < nString.length(); l++) {
                    if (n == 0) {
                        output.println("Case #" + i + ": INSOMNIA");
                        allTrue = true;
                        break;
                    }
                    String digit = nString.charAt(l) + "";
                    if (!numbers[Integer.parseInt(digit)])
                        numbers[Integer.parseInt(digit)] = true;
                    int numberTrue= 0;
                    for (int o = 0; o < 10; o++) {
                        if (numbers[o]) {
                            numberTrue++;
                        }
                    }
                    if (numberTrue == 10) {
                        output.println("Case #" + i + ": " + nString);
                        allTrue = true;
                        break;
                    }

                }
                int temp = n*multipler;
                nString =  temp +"";
                multipler++;
            }
        }
        output.close();

    }

}
