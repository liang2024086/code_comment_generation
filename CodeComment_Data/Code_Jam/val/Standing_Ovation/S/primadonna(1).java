package methodEmbedding.Standing_Ovation.S.LYD1111;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aemilius on 11/04/2015.
 */
public class primadonna {
    public static void main(String[] args) throws IOException {
        String filename = "A-small-attempt1.in";
        Path p = Paths.get(filename);

        LinkedList<String> lines = new LinkedList<>(Files.readAllLines(p));
        Integer attempts = Integer.parseInt(lines.pollFirst());

        LinkedList<List<Integer>> audiences = new LinkedList<>();

        lines.forEach(line ->
        {
            String audience = line.split(" ")[1];
            List<Integer> temp = new LinkedList<>();
            for (Character c : audience.toCharArray())
                temp.add(Integer.parseInt(c.toString()));
            audiences.add(temp);
        });

        for(int i = 1; i<=audiences.size(); i++){
            Integer needed = 0;
            Integer clapping = 0;
            List<Integer> current =  audiences.get(i-1);

            for(int j = 0; j < current.size(); j++){
                if(j <= clapping) clapping += current.get(j);
                else{
                    while(clapping < j) {
                    needed++;
                    clapping++;
                    }
                clapping += current.get(j);
                }
            }

            System.out.println("Case #" + i + ": " + needed);
        }
    }
}
