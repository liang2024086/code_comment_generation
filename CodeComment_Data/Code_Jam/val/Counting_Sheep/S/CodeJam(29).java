package methodEmbedding.Counting_Sheep.S.LYD1645;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Kareem
 */
public class CodeJam {

    /**
     * First argument: is the input file path
     * Second argument: is the output file path
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InputHandler inputHandler = new InputHandler();
            
            Files.lines(Paths.get(args[0]))
                .forEachOrdered(inputHandler);
            
            Thread[] threads = inputHandler.getThreads();
            
            // Wait for all threads to finish
            for (Thread thread : threads) {
                thread.join();
            }
            
            String[] cases = inputHandler.getOutputHandler().getCases();
            PrintStream out = new PrintStream(new FileOutputStream(args[1]));
            System.setOut(out);
            for (String case1 : cases) {
                System.out.println(case1);
            }
        } catch(IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
