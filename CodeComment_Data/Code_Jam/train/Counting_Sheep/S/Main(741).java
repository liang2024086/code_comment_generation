package methodEmbedding.Counting_Sheep.S.LYD319;


import java.io.*;

public class Main {

    public static void main(String[] args) {


        // read input
        File input = new File("input.txt");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input)))) {

            // ignore first number
            String first = reader.readLine();
            int[] actualNumbers = new int[Integer.parseInt(first)];
            int numbersIndex = 0;
            String line = reader.readLine();
            while (line != null) {
                int number = Integer.parseInt(line);
                actualNumbers[numbersIndex] = number;
                numbersIndex += 1;
                if (number == 0) {
                    System.out.println("Case #" + numbersIndex + ": INSOMNIA");

                } else {
                    boolean[] values = new boolean[10];
                    int count = 0;
                    int i = 1;
                    while (number * i < Integer.MAX_VALUE) {
                        // structure to hold numbers already seen
                        int myNumber = number * i;
                        while (myNumber > 0) {
                            if (values[myNumber % 10] == false) {
                                values[myNumber % 10] = true;
                                count++;
                            }
                            myNumber = myNumber / 10;
                        }
                        if (count == 10) {
                            System.out.println("Case #" + numbersIndex + ": " + number * i);
                            break;
                        }
                        i++;
                    }
                    if (number * i >= Integer.MAX_VALUE) {
                        System.out.println("Case #" + numbersIndex + ": INSOMNIA");
                    }
                }
                //System.out.println(line);
                //values.put(number,, true);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
