package methodEmbedding.Revenge_of_the_Pancakes.S.LYD674;


import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String filename = "B-small-attempt1.in";
        int numTestCases = 0;
        String[] inputs = new String[numTestCases];
        String output = "";

//        numTestCases = Integer.parseInt(args[0]);
//        inputs = new String[numTestCases];
//
//        for(int ii = 0; ii < numTestCases; ii++){
//            inputs[ii] = args[ii+1];
//        }

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int count = 0;
            for(String line; (line = br.readLine()) != null; ) {
                if(count == 0){
                    numTestCases = Integer.parseInt(line);
                    inputs = new String[numTestCases];
                }
                else{
                    inputs[count-1] = line;
                }
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int index = 1;
        for(String arg : inputs){
            ArrayList<Character> pancakes = new ArrayList<>();
            for (int i = 0; i < arg.length(); i++) {
                pancakes.add(arg.charAt(i));
            }

            int flips = 0;
            for(int ii = (pancakes.size()-1); ii >= 0; ii--){
                if(pancakes.get(ii) == '-'){
                    flips++;
                    for(int jj = ii; jj >= 0; jj--){
                        if(pancakes.get(jj) == '-'){
                            pancakes.remove(jj);
                            pancakes.add(jj, '+');
                        }
                        else{
                            pancakes.remove(jj);
                            pancakes.add(jj, '-');
                        }
                    }
                }
            }
            output = output + "Case #" + index + ": " + flips + "\n";
            index++;
        }

        System.out.println(output);

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("output_2.txt"), "utf-8"))) {
            writer.write(output);
            System.out.format("Wrote to file\n");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
