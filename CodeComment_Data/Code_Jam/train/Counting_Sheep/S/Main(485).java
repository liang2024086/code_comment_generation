package methodEmbedding.Counting_Sheep.S.LYD1184;


import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String filename = "A-small-attempt1.in";
        int numTestCases = 0;
        int[] inputs = new int[numTestCases];
        String output = "";

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int count = 0;
            for(String line; (line = br.readLine()) != null; ) {
                if(count == 0){
                    numTestCases = Integer.parseInt(line);
                    inputs = new int[numTestCases];
                }
                else{
                    inputs[count-1] = Integer.parseInt(line);
                }
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.format("Testcases: " + numTestCases + "\n");

        for(int ii = 0; ii < numTestCases; ii++){
            int test = inputs[ii];

            if(test == 0) {
                output = output + "Case #" + (ii+1) + ": INSOMNIA\n";
            }
            else{
                ArrayList<String> elements = new ArrayList<>();
                int count = 1;
                int tempNumber = 0;
                while(elements.size() != 10){
                    tempNumber = test*(count);
                    String[] numbers = Integer.toString(tempNumber).split("(?!^)");

                    for(int jj = 0; jj < numbers.length; jj++){
                        String number = numbers[jj];
                        if(!elements.contains(number)){
                            elements.add(number);
                        }
                    }
                    count++;
                }
                output = output + "Case #" + (ii+1) + ": " + tempNumber + "\n";
            }
        }

        System.out.println(output);

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("output.txt"), "utf-8"))) {
            writer.write(output);
            System.out.format("Wrote to file\n");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
