package methodEmbedding.Magic_Trick.S.LYD1083;


import java.io.IOException;

/**
 *
 * @author romero
 */
public class CodeJam1 {

    private static final String INPUT_FILE_NAME = "/home/romero/Desktop/A-small-attempt2.in";
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        InputLoader loader = new InputLoader(INPUT_FILE_NAME);
        MagicTrickCase[] cases = loader.loadInput();
        for (int i=0; i < cases.length; i++) {
            MagicTrickCase mtCase = cases[i];
            System.out.println("Case #" + (i+1) + ": " + Magician.doTrick(mtCase));
        }
    }
    
}
