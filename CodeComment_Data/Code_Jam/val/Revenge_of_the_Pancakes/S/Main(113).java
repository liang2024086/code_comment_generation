package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1101;

import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            int len = arr.length;
            int end = len-1;
            while (end >= 0 && arr[end] == '+') end--;
            if (end < 0) {
                continue;
            }
            int count = 0;
            for (; end > 0; end--) {
                if (arr[end] != arr[end-1]) count++;
            }
            result[i] = count+1;
        }
        for (int i = 1; i <= T; i++) {
            //if (result[i] == 0) System.out.println("Case #"+num+": INSOMNIA");
            System.out.println("Case #"+ i +": "+result[i-1]);
        }
        sc.close();
    }
}
    
