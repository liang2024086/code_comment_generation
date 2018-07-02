package methodEmbedding.Speaking_in_Tongues.S.LYD132;


import java.io.*;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: giuseppelobrutto
 * Date: 4/14/12
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleToText {

    public static final void main(String args[]) throws IOException {
        Map<String, String> dict = new Hashtable<String, String>();
        dict.put("y","a");
        dict.put("n","b");
        dict.put("f","c");
        dict.put("i","d");
        dict.put("c","e");
        dict.put("w","f");
        dict.put("l","g");
        dict.put("b","h");
        dict.put("k","i");
        dict.put("u","j");
        dict.put("o","k");
        dict.put("m","l");
        dict.put("x","m");
        dict.put("s","n");
        dict.put("e","o");
        dict.put("v","p");
        dict.put("z","q");
        dict.put("p","r");
        dict.put("d","s");
        dict.put("r","t");
        dict.put("j","u");
        dict.put("g","v");
        dict.put("t","w");
        dict.put("h","x");
        dict.put("a","y");
        dict.put("q","z");
        dict.put(" ", " ");
        dict.put("\n", "\n");


        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        FileWriter fw = new FileWriter("A-small-attempt.out.out");

        int lines = Integer.parseInt(br.readLine());
        char[] fromLine = null;
        StringBuilder toLine = new StringBuilder();
        int test = 0;
        for (int i = lines ; i > 0; i-- ){
            fromLine = br.readLine().toCharArray();

            toLine.append("Case #").append(++test).append(": ");
            for (int j = 0; j < fromLine.length; j++){
                String letter = String.valueOf(fromLine[j]);
                toLine.append(dict.get(letter));
            }
            fw.write(toLine.toString()+"\n");
            toLine = new StringBuilder();
        }
        br.close();
        fw.close();

    }
}
