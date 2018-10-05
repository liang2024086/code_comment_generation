package methodEmbedding.Counting_Sheep.S.LYD489;

import java.io.*;
import java.util.HashMap;

/**
 * Created by ayush on 4/9/16.
 */
public class CountingSheep {
    public static void main(String[] args) throws IOException {
        String className = "CountingSheep";
        String inputFile = "/home/ayush/IdeaProjects/GoogleCodeJam/resources/input/" + className;
        String outputFile = "/home/ayush/IdeaProjects/GoogleCodeJam/resources/output/" + className;
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        int t = Integer.parseInt(reader.readLine());
        for(int i=0; i<t; i++){
            Long n = Long.parseLong(reader.readLine());
            String toWrite = "Case #" + (i+1) + ": ";
            if(n == 0) {
                writer.write(toWrite + "INSOMNIA\n");
                continue;
            }
            HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
            long k = 0L;
            for(int j=1; map.size() != 10; j++){
                k = n*j;
                for(long l = k; l!=0; l = l/10)
                    map.put((int)l%10, true);
            }
            writer.write(toWrite + k + "\n");
        }
        writer.flush();
    }
}
