package methodEmbedding.Counting_Sheep.S.LYD71;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Created by trinhhoangnguyen on 09/04/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int N;
        int T;

        BufferedReader br = new BufferedReader(new FileReader("test1"));
        try {
            StringBuilder sb = new StringBuilder();
            T = Integer.valueOf(br.readLine());
            for (int i=1; i <=T; i++){
                HashSet<Character> numberSet = new HashSet<>();


                N = Integer.valueOf(br.readLine());
                int M = N;
                if (N==0){
                    System.out.println("Case #" + i + ": INSOMNIA");
                } else {
//                System.out.println("Case #" + i);

                    int j = 1;
                    while (numberSet.size() < 10) {
                         M = N * j;
                        String curr = String.valueOf(M);
                        char[] digits = curr.toCharArray();
                        for (char digit : digits) {
                            numberSet.add(digit);
                        }
                        j++;
                    }
                    System.out.println("Case #" + i + ": " + M);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}
