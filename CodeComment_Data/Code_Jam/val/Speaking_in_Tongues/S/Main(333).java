package methodEmbedding.Speaking_in_Tongues.S.LYD937;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 *
 * @author Ka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic her
        File f = new File("A-small-attempt0.in");
        FileWriter fstream = new FileWriter("output.txt");
        BufferedWriter out = new BufferedWriter(fstream);
        Solution s = new Solution(f);
        s.translate();
        s.output(out);
    }
}
