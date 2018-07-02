package methodEmbedding.Counting_Sheep.S.LYD1032;


import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Romero
 */
public class Main {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        URL url = Qualification_Round.Counting_Sheep.Main.class.getResource("A-small-attempt0.in");
        File file = new File(url.toURI());
        Scanner in = new Scanner(file);
        int cases = in.nextInt();
        for (int j=0; j<cases; j++) {
            long N = in.nextLong();
            if (N == 0) {
                System.out.println("Case #" + (j+1) + ": INSOMNIA");
            } else {
                int count = 0;
                boolean ocurrences[] = new boolean[10];
                long i = 1;
                while (count < 10) {
                    long aux = i*N;
                    while (aux > 0) {
                        int digit = (int) (aux % 10);
                        if (!ocurrences[digit]) {
                            //System.out.println(aux + " " + digit);
                            ocurrences[digit] = true;
                            count++;
                        }
                        aux = aux / 10;
                    }
                    i++;
                }
                System.out.println("Case #" + (j+1) + ": " + (i-1)*N);
            }
        }
    }
    
}
