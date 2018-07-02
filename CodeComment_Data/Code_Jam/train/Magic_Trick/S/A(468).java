package methodEmbedding.Magic_Trick.S.LYD471;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class A {

    public static void main(String[] args) {
        String fileName = "input.txt";
        AReader r = new AReader();
        List<String> result = r.processFile(fileName);
        try (FileWriter fw = new FileWriter("out.txt")) {
            for (int i = 0 ; i < result.size() ; i++) {
                int testCase = i + 1;
                fw.append("Case #" + testCase + ": " + result.get(i)).append("\n");
            }
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
