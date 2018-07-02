package methodEmbedding.Magic_Trick.S.LYD878;

import java.util.ArrayList;

/**
 * Created by Cristi on 4/12/2014.
 */
public class Main {
    public static void main(String[] args){
        ArrayList<String> input = IO.readFile("e:\\Downloads\\A-small-attempt0.in");
        Magic magic = new Magic();
        ArrayList<String> result = magic.process(input);
        IO.writeFile("e:\\Downloads\\output.txt", result);
    }
}
