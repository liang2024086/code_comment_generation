package methodEmbedding.Standing_Ovation.S.LYD2193;

import java.util.Scanner;

/**
 * Created by piyush on 4/10/15.
 */
public class StandingOvation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i<T;i++){
            int N = sc.nextInt();
            char[] arr = sc.next().toCharArray();
            int sum = 0;
            int n = 1;
            int count = 0;
            int j = 0;
            while(j<arr.length){
                sum += arr[j]-'0';
                while(sum<n){
                    sum++;
                    count++;
                }
                j++;
                n++;
            }
            System.out.println("Case #" + (i+1) + ": " + count);
        }
    }
}
