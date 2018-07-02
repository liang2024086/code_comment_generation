package methodEmbedding.Counting_Sheep.S.LYD101;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashSet;


public class Main {

    // Counting Sheep

    // Description:
    // Beatrix chooses some number N, and counts multiples thereof.
    // While counting, Beatrix tracks individual digits counted (1, 2, etc).
    // After Beatrix has counted all ten digits, Beatrix falls asleep.

    // Input:
    // First line is one number T. T test cases follow.
    // Following T lines have one number, N, the number Beatrix counts multiples of.

    // Output:
    // For each test case, output the number "steps" Beatrix must count before falling asleep
    // Case #t: f(n(t))

    // Limitations:
    // Small
    //   T: 1 <= T <= 100
    //   N: 0 <= N <= 200
    // Large
    //   T: 1 <= T <= 100
    //   N: 0 <= N <= 10^6

    // Assumptions:
    // The only case where Beatrix will never fall asleep is for N = 0

    public static void main(String[] args) {

        try {

            System.out.println("Starting process..");
            System.out.println("args[0]: " + args[0]);
            System.out.println("args: " + args.toString());
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

            HashSet<Integer> allIntegers = new HashSet<Integer>();
            allIntegers.add(0);
            allIntegers.add(1);
            allIntegers.add(2);
            allIntegers.add(3);
            allIntegers.add(4);
            allIntegers.add(5);
            allIntegers.add(6);
            allIntegers.add(7);
            allIntegers.add(8);
            allIntegers.add(9);


            for (int i = 0; i < t; i++) {
                //System.out.println("Test Case " + (i+1) + ":");

                line = bufferedReader.readLine();
                Integer n = Integer.valueOf(line); // starting number
                Integer k = 0; // currentNumber
                Integer s = 0; // steps passed

                HashSet<Integer> passedIntegers = new HashSet<Integer>();

                if (n == 0) {
                    // This is a fail case...
                    bufferedWriter.write("Case #" + (i+1) + ": " + "INSOMNIA");
                    bufferedWriter.newLine();
                    continue;
                }

                //while (!passedIntegers.containsAll(allIntegers) && s < 50) {
                while (passedIntegers.size() < 10) {
                    s += 1;
                    k += n;
                    //System.out.println("Test case " + i + " step " + s);
                    //System.out.print(passedIntegers.size());

                    // Build char array.
                    String number = k.toString();
                    for (int j = 0; j < number.length(); j++) {
                        passedIntegers.add(Integer.valueOf(number.charAt(j)));
                    }

                }

                System.out.println("Test case " + (i+1) + " steps " + s + "last number " + k);
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


