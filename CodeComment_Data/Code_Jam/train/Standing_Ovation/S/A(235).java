package methodEmbedding.Standing_Ovation.S.LYD795;

import java.util.*;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 1; i<= T; i++) {
            int max = in.nextInt();
            String st = in.next("\\w+");
            char[] arr = st.toCharArray();
            int[] array = new int[max+1];
            for(int j=0; j<=max;j++) {
                array[j] = Character.getNumericValue(arr[j]);
            }
            int total = array[0];
            int totalN = 0;
            for(int j = 1; j<= max; j++) {
                if(total < j) {
                    totalN += j -total;
                    total += j -total; 
                }
                total += array[j];
            }
            System.out.printf("Case #%d: %d\n", i,totalN);
        }
    }
    
}
