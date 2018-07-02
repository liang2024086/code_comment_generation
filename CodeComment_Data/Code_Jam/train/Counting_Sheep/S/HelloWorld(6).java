package methodEmbedding.Counting_Sheep.S.LYD1655;

import javax.xml.transform.sax.SAXSource;
import java.util.*;
public class HelloWorld{

    public static void main(String []args){
        Scanner reader = new Scanner(System.in);
        Set<Integer> digitSet = new HashSet<Integer>();
        int T = reader.nextInt();
        for(int i = 1; i <= T; i++){
            int N = reader.nextInt();
            digitSet.clear();
            int k = 1;
            if(N == 0 ) {
                System.out.println("Case #"+i+": INSOMNIA");
            } else {
                while (digitSet.size() != 10) {
                    int tempN = k * N;
                    while (tempN != 0) {
                        int digit = tempN % 10;
                        tempN = tempN / 10;
                        digitSet.add(digit);
                    }

                    k++;
                }
                System.out.println("Case #" + i + ": " + (k - 1) * N);
            }
        }
    }
}
