package methodEmbedding.Counting_Sheep.S.LYD1129;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

            String filePath = "/Users/jimmychou516/Downloads/";
            String inputFileName = "A-small-attempt0.in.txt";
            String outputFileName = "output.txt";
            //File file = new File(args[0]);

            // Uncomment to output the file
            PrintStream myconsole = new PrintStream(new File(filePath+outputFileName));
            System.setOut(myconsole);

            Scanner in = new Scanner(new BufferedReader(new FileReader(new File(filePath+inputFileName))));
//            Scanner in = new Scanner("5 0 1 2 11 1692");


            //Your Code Here

            int n = in.nextInt(); // number of cases
            for (int i = 1; i <= n; ++i) {
                int number = in.nextInt();
                if (number == 0) {
                    System.out.println("Case #" + i + ": INSOMNIA");
                } else {
                    int N = 1;
                    List<Integer> list = new LinkedList<Integer>();
                    list.add(0);
                    list.add(1);
                    list.add(2);
                    list.add(3);
                    list.add(4);
                    list.add(5);
                    list.add(6);
                    list.add(7);
                    list.add(8);
                    list.add(9);
                    while (!list.isEmpty()) {
                        int temp = number;
                        temp *= N;
                        while (temp > 0) {
                            if (list.contains(temp % 10)) {
                                list.remove(new Integer(temp % 10));
                                if (list.isEmpty()) {
                                    System.out.println("Case #" + i + ": " + number * N);
                                    break;
                                }
                            }
                            temp = temp / 10;
                        }
                        N++;
                    }
                    list.clear();
                }

            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
