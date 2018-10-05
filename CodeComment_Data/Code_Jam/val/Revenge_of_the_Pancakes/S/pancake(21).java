package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1083;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class pancake {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int count,moves;
        BufferedReader br = new BufferedReader(new FileReader("/Users/nannapan/NetBeansProjects/JavaLibrary1/src/people/B-small-attempt0.in"));
        PrintWriter writer = new PrintWriter("/Users/nannapan/NetBeansProjects/JavaLibrary1/src/people/B-small.out", "UTF-8");
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {   moves = 0;
            String s = br.readLine();
            char []cakes = s.toCharArray();
            count = 0;
            while (true) {
                char pre = ' ', cur = ' ';
                if (count == cakes.length) {
                    break;
                }
                count = 0;
                for (int j = 0; j < cakes.length; j++) {
                    if (pre == '-' && cakes[j] == '+') {
                        moves++;
                        count++;
                        for (int k = 0; k < j; k++) {
                            if(cakes[k] == '-')
                            {
                                count++;
                                cakes[k]='+';
                            }
                            else{
                                count--;
                                cakes[k]='-';
                            }
                        }
                    } else if (pre == '+' && cakes[j] == '-') {
                        moves++;
                        for (int k = 0; k < j; k++) {
                            if(cakes[k] == '-')
                            {
                                count++;
                                cakes[k]='+';
                            }
                            else{
                                count--;
                                cakes[k]='-';
                            }
                        }
                    } else if (cakes[j] == '+') {
                        count++;
                    }
                    else if(cakes[j] == '-'){
                    }
                    pre = cakes[j];
                }
                if(count ==0 && pre=='-')
                {
                    moves++;
                    break;
                }
            }
            System.out.println(moves);
            writer.println("CASE #" + (i + 1) + ": " +moves);
        }
        writer.close();
    }
}
