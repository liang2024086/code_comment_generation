package methodEmbedding.Counting_Sheep.S.LYD341;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.spec.ECField;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String fileName = "A-small-attempt0.in";
        String line;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            int noOfTestCases = Integer.valueOf(line);
            for(int i=1; i<=noOfTestCases ; i++) {
                Set<Character> digits = new HashSet<>();
                line = bufferedReader.readLine();
                Integer number = Integer.valueOf(line);
                if(number == 0){
                    System.out.println("Case #"+i+": INSOMNIA");
                    continue;
                }
                Integer factor = 1;
                while (digits.size() < 10) {
                    digits.addAll(Integer.toString(number*factor).chars().mapToObj(c -> (char) c).collect(Collectors.toSet()));
                    factor++;
                }
                System.out.println("Case #"+i+": "+number*(factor-1));
            }
            bufferedReader.close();
        } catch (Exception e ) {

        }
    }
}
