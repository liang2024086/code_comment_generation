package methodEmbedding.Counting_Sheep.S.LYD1180;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Daniel on 09/04/2016.
 */
public class solution {
    public static void main(String[] args) throws IOException {
        String fileName = "small.in";
        FileReader fileReader = new FileReader("input/a/"+fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("output/a/"+fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = bufferedReader.readLine();
        Integer size = Integer.parseInt(line);
        for(int i = 1; i<=size; i++){
            line = bufferedReader.readLine();
            Integer n = Integer.parseInt(line);
            if(n == 0){
                String output = "Case #"+i+": INSOMNIA";
                bufferedWriter.write(output + System.lineSeparator());
            }else{
                List<String> digits= new ArrayList<>();

                digits.add("0");
                digits.add("1");
                digits.add("2");
                digits.add("3");
                digits.add("4");
                digits.add("5");
                digits.add("6");
                digits.add("7");
                digits.add("8");
                digits.add("9");

                int e = 1;
                Integer mult = 0;
                String multString = "";
                while(digits.size() != 0 && e<1000){
                    mult = n*e;
                    multString = mult.toString();
                    for(int d = 0; d < digits.size(); d++){
                        String digit = digits.get(d);
                        if(multString.contains(digit)){
                            digits.remove(d);
                            d--;
                        }
                    }
                    e++;
                }
                String output = "Case #"+i+": "+mult;
                bufferedWriter.write(output + System.lineSeparator());
            }

        }
        bufferedReader.close();


        bufferedWriter.close();
    }
}
