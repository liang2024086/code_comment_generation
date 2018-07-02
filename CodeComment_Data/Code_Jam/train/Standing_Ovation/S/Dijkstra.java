package methodEmbedding.Standing_Ovation.S.LYD1723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sdonkena on 11/04/15.
 */
public class Dijkstra {

        public static void main(String args[]) {

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String s = br.readLine();
                int t = (Integer.parseInt(s));
                int c = 0;
                while (c < t) {

                    String s1 = br.readLine();
                    String ss[] = s1.split(" ");

                    int smax = Integer.parseInt(ss[0]);
                    char order[] = ss[1].toCharArray();
                    int count = 0;
                    int result = 0;
                    int temp = 0;

                    for (int i = 0; i < order.length; i++) {
                        temp = 0;
                        int a = Character.getNumericValue(order[i]);
                        if (a == 0 && count == i) {
                            count++;
                            result++;
                        } else {
                            count += a;
                        }
                    }

                    int out = c+1;
                    System.out.println("Case #"+out+": "+result);
                    c++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
