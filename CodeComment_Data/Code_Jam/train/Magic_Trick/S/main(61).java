package methodEmbedding.Magic_Trick.S.LYD1069;


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
            ProblemA prb = new ProblemA(new File("input.txt"));
            prb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
