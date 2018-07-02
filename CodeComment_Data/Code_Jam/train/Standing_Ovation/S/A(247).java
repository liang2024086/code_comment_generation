package methodEmbedding.Standing_Ovation.S.LYD405;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class A {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("A.in"));
        int numOfCases = Integer.parseInt(in.nextLine());
        PrintWriter out = new PrintWriter(new File("A.txt"));

        String temp;
        int maxShyness;
        String[] tempArray;
        String shyness;
        for (int TC = 1; TC <= numOfCases; TC++) {
            temp = in.nextLine();
            tempArray = temp.split(" ");
            maxShyness = Integer.parseInt(tempArray[0]);
            shyness = tempArray[1];

            int numStdPpl = 0;
            int numInvinted = 0;
            for (int index = 0; index < shyness.length(); index++) {
                if(Character.getNumericValue(shyness.charAt(index)) != 0){
                    if (numStdPpl >= index)
                        numStdPpl += Character.getNumericValue(shyness.charAt(index));
                    else {
                        numInvinted += index - numStdPpl;
                        numStdPpl += Character.getNumericValue(shyness.charAt(index)) + numInvinted;
                    }
                }
            }
            if (maxShyness > numStdPpl)
                numInvinted += maxShyness - numStdPpl;

            System.out.println("Case #" + TC + ": " + numInvinted);
            out.println("Case #" + TC + ": " + numInvinted);
        }

        in.close();
        out.close();
    }
}
