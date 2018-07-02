package methodEmbedding.Cookie_Clicker_Alpha.S.LYD294;


import java.io.File;

/**
 * Created by Mitchell Ton
 * Date: 12-4-14
 * Time: 15:48
 * ?? DigitalChunks
 */
public class main {

    public static void main(String[] args) {
        try {
            ProblemB prb = new ProblemB(new File("input.txt"),new File("output.txt"));
            prb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
