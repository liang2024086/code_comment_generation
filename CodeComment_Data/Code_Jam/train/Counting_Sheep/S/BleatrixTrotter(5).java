package methodEmbedding.Counting_Sheep.S.LYD224;


import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nguyen on 009, 9, 4, 2016.
 */
public class BleatrixTrotter {

    public static void main(String[] args) throws IOException {


        String inputFile = "resource\\A-small-attempt1.in";
        String outputFile = "resource\\A-small-attempt1.out";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(outputFile)))) {
            try (BufferedReader br = new BufferedReader(new FileReader(new File(inputFile)))) {
                Integer inputLength = Integer.valueOf(br.readLine());
                for (int i = 1; i <= inputLength; i++) {
                    Set<Character> t = new HashSet<>();
                    String inputNumber = br.readLine();
                    int inputValue = Integer.valueOf(inputNumber);
                    int tmpValue = inputValue;
                    int previousValue = Integer.MAX_VALUE;
                    while(true) {
                        for (char x : (tmpValue + "").toCharArray()) {
                            t.add(x);
                        }
                        if(t.size() == 10) {
                            bw.write(String.format("Case #%d: %d\n", i, tmpValue));
                            break;
                        }
                        if(tmpValue == previousValue) {
                            bw.write(String.format("Case #%d: INSOMNIA\n", i));
                            break;
                        }
                        previousValue = tmpValue;
                        tmpValue+=inputValue;
                    }
                }
            }
        }
    }
}
