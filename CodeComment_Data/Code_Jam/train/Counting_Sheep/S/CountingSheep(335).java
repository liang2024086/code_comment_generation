package methodEmbedding.Counting_Sheep.S.LYD283;

import java.util.*;

/**
 * Created by Dominic on 8/4/2016.
 */
public class CountingSheep {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for(int i = 0; i<tests; i++){
            int[] arr1 = new int[10];

            int[] arr2 = new int[10];
            int N = sc.nextInt();
            int temp = N;

            if(N>0){
                for(int j = 1; j <20000; j++) {
                    while (temp >= 10) {
                        arr1[temp % 10] += 1;
                        temp = temp/10;
                    }

                    arr1[temp%10] +=1;
                    for(int k = 0; k <10 ;k ++){
                        arr2[k] = arr1[k];
                    }
                    Arrays.sort(arr2);
                    if (arr2[0] > 0){
                        System.out.println("Case #"+(i+1)+": "+ j*N);
                        break;
                    }
                    else{
                        temp = (j+1)*N;
                    }

                }
            }
            else{
                System.out.println("Case #"+(i+1)+": INSOMNIA");
            }

        }
    }
}
