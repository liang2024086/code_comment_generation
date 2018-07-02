package methodEmbedding.Speaking_in_Tongues.S.LYD1145;


import java.io.IOException;
import java.util.ArrayList;

import ch.googlecodejam.io.InputReader;
import ch.googlecodejam.io.Writer;
import ch.googlecodejam.qualround.SpeakingInTongues;

public class GoogleCodeJam {

    private static String fileNameInput = "\\A-small-attempt0.in";
    
    private static String fileNameOutput = "\\output.txt";

    private static String loadingDirectory = "C:\\Users\\roger\\Downloads";
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        try {
            InputReader reader = new InputReader();
            Writer writer = new Writer();
            ArrayList<String> lines = reader.readLine(loadingDirectory + fileNameInput);
            String result = SpeakingInTongues.solve(lines);
            writer.write(result, loadingDirectory + fileNameOutput);
            
        } catch (IOException e) {
            
            System.out.print(e.toString());
        }
    }

}
