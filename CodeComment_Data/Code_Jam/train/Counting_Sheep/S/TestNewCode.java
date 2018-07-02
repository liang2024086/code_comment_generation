package methodEmbedding.Counting_Sheep.S.LYD622;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKSingh
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TestNewCode {

    /**
     * @param args
     */

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("A-small-attempt2.in");
        DataInputStream in = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int N = 0;
        String line = null;
        while ((line = br.readLine()) != null) {
            if(N==0){
                N++;
                continue;
            }
            int input = Integer.parseInt(line);
            if (input >= 0 && input <= 200) {
                int i = 0;
                int n = 1;
                int number = 0;
                int currNum = 0;
                boolean hasSeenAllNum = false;
                LinkedList<Integer> stack = new LinkedList<Integer>();
                while (i <= 100) {
                    number = input * n;
                    currNum = number;
                    while (number > 0) {
                        stack.push(number % 10);
                        number = number / 10;
                    }
                    Collections.sort(stack);
                    int match = 0;
                    for (int k = 0; k < 10; k++) {
                        if (stack.contains(k)) {
                            match++;
                        }
                    }
                    if ((match == 10)) {
                        hasSeenAllNum = true;
                        break;
                    }
                    i++;
                    n++;
                }//while-loop-ends
                if (hasSeenAllNum) {
                    System.out.println("Case #" + N + ": " + currNum);
                } else {
                    System.out.println("Case #" + N + ": INSOMNIA");
                }
            }//if-block-ends
            N++;
        }
    }
}
