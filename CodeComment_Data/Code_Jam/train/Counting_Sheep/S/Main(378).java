package methodEmbedding.Counting_Sheep.S.LYD1143;

import java.util.*;
import java.io.*;
/**
 * Created by Justin Kwan on 4/9/2016.
 */
public class Main {
    public static void main(String[] args) {
        int check;
        int count=0;
        int curr;

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i =1; i<=t; ++i){
            int n = in.nextInt();
            if(n==0) System.out.println("Case #"+i+": INSOMNIA");
            else{
                int[] array = {0,0,0,0,0,0,0,0,0,0};
                count=0;
                int m = 0;
                while(count<10){
                    m++;
                    int temp = n*m;
                    while(temp>0){
                        check = temp%10;
                        temp = temp/10;
                        if(array[check]!=1){
                            array[check]=1;
                            count++;
                        }
                    }
                }
                System.out.println("Case #" + i + ": " + (n * m));
            }
        }
    }
}
