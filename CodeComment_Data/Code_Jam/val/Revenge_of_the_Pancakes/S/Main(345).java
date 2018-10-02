package methodEmbedding.Revenge_of_the_Pancakes.S.LYD816;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader fRead= new FileReader("problemA.in");
            FileWriter fWrite = new FileWriter("problemB.out");

            Scanner in = new Scanner(fRead);
            int T = in.nextInt();
            in.nextLine();
            for (int i = 0; i < T; i++) {
                String str = in.nextLine();
                char[] cakes = str.toCharArray();

                int endIndex = cakes.length - 1;
                while ( endIndex >= 0 && cakes[endIndex] == '+')
                    endIndex--;

                int flipCount = 0;
                if(endIndex >= 0)
                {
                    flipCount = 1;
                    int currChar = cakes[0];
                    for (int k = 1; k <= endIndex; k++) {
                        if(cakes[k] != currChar)
                        {
                            flipCount++;
                            currChar = cakes[k];
                        }
                    }
                }

                fWrite.write("Case #" + (i+1) + ": " + flipCount + "\n");
            }

            fRead.close();
            fWrite.close();
        } catch (Exception ex) {

        }
    }

}
