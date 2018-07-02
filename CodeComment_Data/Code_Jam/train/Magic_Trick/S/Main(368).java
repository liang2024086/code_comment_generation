package methodEmbedding.Magic_Trick.S.LYD517;


import qualification.MagicTrick;
import qualification.ReadWrite;

import java.util.List;

/**
 * Created by Roma on 12.04.14.
 */
public class Main {

    public static void main(String args[]){
        ReadWrite rw = new ReadWrite();
        List<String> data = rw.readFile("1.in");
        MagicTrick magicTrick = new MagicTrick(data);
        rw.writeFile(magicTrick.getAnswers(), "out.txt");
    }

}
