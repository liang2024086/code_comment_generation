package methodEmbedding.Revenge_of_the_Pancakes.S.LYD462;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int noCase = 1;
        
        try {
            String line = br.readLine();
            line = br.readLine();

            while (line != null) {
                char[] stacks = line.toCharArray();
                int flip = 0;
                
                for (int i = 0; i < stacks.length - 1; ++i) {
                    if (stacks[i] != stacks[i + 1]) {
                        flip++;
                    }
                }
                
                if (stacks[stacks.length - 1] == '-') flip++;
               
                
                System.out.println("Case #" + noCase++ + ": " + flip);
                line = br.readLine();
            }
        } finally {
            br.close();
        }
    }
}
