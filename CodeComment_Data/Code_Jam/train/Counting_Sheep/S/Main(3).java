package methodEmbedding.Counting_Sheep.S.LYD1401;

import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 5st7 on 2016/04/10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hitumae =0;
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; ++i) {
            int a = sc.nextInt(),ans=1;
            String num[] = {"0","1","2","3","4","5","6","7","8","9"};
            boolean numBool[] = {false, false, false, false, false, false, false, false, false, false};
            boolean allBool = false;

            int n = a;
            while (!allBool){
                if(n==0){
                    break;
                }
                if (!allBool){
                    String str= String.valueOf(n);
                    for (int j = 0; j < num.length; ++j) {
                        if(!numBool[j]&&str.indexOf(num[j])>=0){
                            numBool[j] = true;
                        }
                    }
                    for (int j = 0; j < num.length; j++) {
                        if (numBool[j]) {
                            allBool = true;
                        }else{
                            allBool = false;
                            break;
                        }
                    }
                    ans++;
                    hitumae = n;
                    n = a*ans;
                } else{
                    break;
                }
            }
            int caisu = i+1;
            ans-=1;
            if(ans==0){
                System.out.println("Case #"+caisu+ ": INSOMNIA");
            } else{
                System.out.println("Case #" + caisu + ": " + hitumae);
            }
        }
    }
}
