package methodEmbedding.Revenge_of_the_Pancakes.S.LYD815;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adedayo Ominiyi
 */
public class Main2 {

   
    public static void main(String[] args) throws FileNotFoundException {
       String filename = "B-small-attempt0";

        Scanner in = new Scanner(new File(String.format("%s.in", filename)));
        PrintStream out = new PrintStream(new File(String.format("%s.out", filename)));

        // read first line
        int inputSize = Integer.parseInt(in.nextLine());
        //out.println("inputSize: " + inputSize);

        List<String> lines = new ArrayList<>(inputSize);
        while (in.hasNext()) {
            String line = in.nextLine();

            if (line.trim().isEmpty()) {
                break;
            }
            lines.add(line);
        }
        //out.println("lines.size(): " + lines.size());
        
        int counter = 1;
        for (String line : lines) {
            int flips = 0;
            char[] lineChars = line.toCharArray();
            char currentChar = lineChars[0];
            for (int i = 1; i < lineChars.length; i++) {
                char temp = lineChars[i];
                if (temp != currentChar) {
                    ++flips;
                    currentChar = temp;
                }
            }
            if (currentChar == '-') {
                ++flips;
            }
            out.println(String.format("Case #%d: %d", counter++, flips));
        }
    }
    
}
