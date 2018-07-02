package methodEmbedding.Revenge_of_the_Pancakes.S.LYD629;

/**
 * Created by kushrustagi on 4/9/16.
 */
import java.util.*;
import java.io.*;
class pancakes {
    public static void main(String ... orange) throws Exception{
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int p = s.nextInt();
        for (int i = 0; i < p; i++) {
            String n = s.next();            
            
            int counter = 0;
            int temp;
            for (temp = n.length() - 1; temp >= 0; temp--) {
                if (n.charAt(temp) == '-') {
                    String dum = "";
                    counter++;
                    for (int y = 0; y <= temp; y++) {

                        if (n.charAt(y) == '-') dum += '+';
                        else if (n.charAt(y) == '+') dum += '-';
                    }
                    n = dum + n.substring(temp + 1);
                }
            }
            System.out.println("Case #"+(i+1)+": " + counter);
        }
    }
}
