package methodEmbedding.Revenge_of_the_Pancakes.S.LYD971;


import java.io.*;

/**
 * Created by Nguyen on 009, 9, 4, 2016.
 */
public class TheInfiniteHouseOfPancakes {

    public static void main(String[] args) throws IOException {
        String outputFile  = "resource\\TheInfiniteHouseOfPancakes\\B-small-attempt0.out";
        String inputFile = "resource\\TheInfiniteHouseOfPancakes\\B-small-attempt0.in";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(outputFile)))) {
            try(BufferedReader br = new BufferedReader(new FileReader(new File(inputFile)))) {
                int inputSize = Integer.valueOf(br.readLine());
                for(int i = 1; i <= inputSize; i++){
                    int count = 0;
                    String input = br.readLine();
                    for(int p = 1; p < input.length(); p++) {
                        if(input.charAt(p) != input.charAt(p-1)) {
                            count++;
                        }
                    }
                    if(input.charAt(input.length()-1) =='-') {
                        count++;
                    }
                    bw.write(String.format("Case #%d: %d\n", i, count));
                }
            }
        }
    }
}
