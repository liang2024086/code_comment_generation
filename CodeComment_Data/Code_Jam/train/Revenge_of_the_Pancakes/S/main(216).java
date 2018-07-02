package methodEmbedding.Revenge_of_the_Pancakes.S.LYD338;

/**
 * Created by kushrustagi on 4/9/16.
 */
import java.util.*;
import java.io.*;
public class main {
    public static void main(String ... orange) throws Exception{
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            String n = s.next();
            //System.out.println(n);
            //System.out.println(n.length());
            int z;
            int count = 0;

            for (z = n.length() - 1; z >= 0; z--) {
                if (n.charAt(z) == '-') {
                    String dum = "";
                    count++;
                    for (int y = 0; y <= z; y++) {

                        if (n.charAt(y) == '-') dum += '+';
                        else if (n.charAt(y) == '+') dum += '-';
                    }
                    n = dum + n.substring(z + 1);
                }
            }
            System.out.println("Case #"+(i+1)+": " + count);
        }
    }
}
