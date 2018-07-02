package methodEmbedding.Speaking_in_Tongues.S.LYD366;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Translate {
    private static final String inFile = "A-small-attempt0.in";
    private static final String outFile = "A-small.out";

    private static final char[] input = {   'y', 'h', 'e', 's', 'o',
                                            'c', 'v', 'x', 'd', 'u',
                                            'i', 'g', 'l', 'b', 'k',
                                            'r', 'z', 't', 'n', 'w',
                                            'j', 'p', 'f', 'm', 'a',
                                            'q'};

    public static void main(String[] args) throws IOException {
        BufferedReader iStream = new BufferedReader(new FileReader(inFile));
        BufferedWriter oStream = new BufferedWriter(new FileWriter(outFile));
        int total = new Integer(iStream.readLine());
        String line;

        for(int i = 0; i < total; i++) {
            System.out.print("Case #" + (i+1) + ": ");
            line = iStream.readLine();

            for(int j = 0; j < line.length(); j++) {
                if( line.charAt(j) == ' ') {
                    System.out.print(' ');
                    continue;
                }

                int index = ((int)line.charAt(j)) - ((int)'a');
                System.out.print(input[index]);
            }
            System.out.println();
        }
    }
}
