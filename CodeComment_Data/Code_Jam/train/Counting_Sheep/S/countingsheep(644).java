package methodEmbedding.Counting_Sheep.S.LYD281;

/**
 * Created by JL on 4/9/16.
 */
import java.io.*;
import java.util.*;

public class countingsheep {
    public static HashSet<Integer> h1;
    public static HashSet<Integer> h2;

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();

        h1 = new HashSet<>();
        h2 = new HashSet<>();

        h1.add(0);
        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.add(4);
        h1.add(5);
        h1.add(6);
        h1.add(7);
        h1.add(8);
        h1.add(9);

        for(int k = 0; k < C; k++) {
            String n = in.next();
            String save = n;
            int check = Integer.parseInt(n);
            int nn = Integer.parseInt(n);

            if(check == 0) {
                System.out.println("Case #" + (k+1) + ": INSOMNIA");
                continue;
            }

            boolean flag = false;

            int step = 0;
            while(true) {
                for (int i = 0; i < n.length(); i++) {
                    char c = n.charAt(i);
                    int cc = Character.getNumericValue(c);

                    h2.add(cc);

                    if (h1.size() == h2.size()) {
                        System.out.println("Case #" + (k + 1) + ": " + nn);
                        flag = true;
                        break;
                    }
                }

                if(flag == true){
                    h2.clear();
                    break;
                }

                nn = Integer.parseInt(save + "") * (step + 1);
                n = Integer.toString(nn);
                step++;

            }
        }
    }
}
