package methodEmbedding.Counting_Sheep.S.LYD1581;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by bozidar on 9.4.2016..
 */
public class SheepMain {
    static Input input = new Input();
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Output.writeTofile(input.input());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
