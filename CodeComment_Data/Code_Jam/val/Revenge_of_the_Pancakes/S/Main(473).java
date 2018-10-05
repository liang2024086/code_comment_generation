package methodEmbedding.Revenge_of_the_Pancakes.S.LYD473;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashSet;


public class Main {

    // Pancakes

    // Description:
    // Each test case has a stack of N pancakes. These are either "happy side up" or not.
    // You can flip a sub-stack from the top of the stack and each pancake "happy side up?" will be
    // inverted.  Also, the positions of the pancakes within the substack will be inverted.
    // Find the smallest number of flips required to make the stack all "happy side up".

    // Input:
    // First line is one number T. T test cases follow.
    // Each line is a string S, representing a stack of pancakes. The top of the stack is on the left. + means happy.

    // Output:
    // For each output, output the minimum number of flips to make the stack happy
    // Case #t: f(n(t))

    // Limitations:
    // Every character in S is either + or -
    // Small
    //   T: 1 <= T <= 100
    //   S: 0 <= S <= 10
    // Large
    //   T: 1 <= T <= 100
    //   S: 0 <= S <= 100

    // Assumptions:
    // <none>

    // Logic:
    // Consecutive happy or sad cakes can be thought of as a single cake.
    // ...

    public static void main(String[] args) {

        try {

            System.out.println("Starting process..");
            // First we need an input reader

            final String inputSuffix = "in";
            final String inputSubfolder = "input";
            final String outputSuffix = "out";
            final String outputSubfolder = "output";

            final String fileName = args[0];

            FileReader fileReader = new FileReader("./" + inputSubfolder + "/" + fileName + "." + inputSuffix);
            FileWriter fileWriter = new FileWriter("./" + outputSubfolder + "/" + fileName + "." + outputSuffix);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //InputReader inputReader = new InputReader(fileName, inputSubfolder, inputSuffix);
            //inputReader.startReadingFile();

            /*******************************************************************************************************
             *******************************************************************************************************/

            String line = bufferedReader.readLine();
            Integer t = Integer.valueOf(line);
            System.out.println("Test Cases: " + t);

            for (int i = 0; i < t; i++) {
                //System.out.println("Test Case " + (i+1) + ":");

                line = bufferedReader.readLine();
                char lastChar = '+';
                String compactStack = "";

                for (int j = line.length()-1; j >= 0; j--) {
                    // Read backwards from the stack to get the bottom cake first
                    if (line.charAt(j) == lastChar) {
                        // Do nothing...
                    } else {
                        // Add to compact stack...
                        compactStack += line.charAt(j);
                        lastChar = line.charAt(j);
                    }
                }


                // And now, the answer should be the length of the compact stack. Simple as that!
                int k = compactStack.length();
                System.out.println("Stack: " + compactStack);

                bufferedWriter.write("Case #" + (i+1) + ": " + k);
                bufferedWriter.newLine();


            }

            bufferedReader.close();
            bufferedWriter.close();



        } catch(Exception e) {
            System.out.println("Failed to read or write file...");
        }

    }





}


