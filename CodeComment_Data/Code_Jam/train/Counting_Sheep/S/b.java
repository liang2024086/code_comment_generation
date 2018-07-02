package methodEmbedding.Counting_Sheep.S.LYD923;

import java.util.*;
public class b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t=1; t<=T; t++) {
            List<Integer> digitList = new LinkedList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
            int ans=0;
            int nfixed = in.nextInt();
            int n = nfixed;
            while ((nfixed != 0) && (digitList.size() != 0)) {
                int m = n;
                while (m > 0){
                    int digit = m % 10;
                    if (digitList.contains(digit)) {
                        digitList.remove(Integer.valueOf(digit));
                    }
                    m = m / 10;
                }
                ans = n;
                n += nfixed ;
            }

            System.out.printf("Case #%d: ", t);
            if(ans == 0) System.out.println("INSOMNIA");
            else System.out.println(ans);
        }
    }
}
