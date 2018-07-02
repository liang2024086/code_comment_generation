package methodEmbedding.Counting_Sheep.S.LYD955;

import java.util.Scanner;

/**
 * Created by kunals726 on 4/9/2016.
 */
public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int ii=1;ii<=t;++ii) {
            long n = sc.nextLong();
            if (n == 0)
                System.out.println("Case #" +ii+ ": INSOMNIA");
            else {
                boolean check[] = new boolean[10];
                boolean flag = true;
                String ans = Long.toString(n);
                for (int i = 0; i < ans.length(); ++i) {
                    int index = Integer.parseInt(ans.charAt(i) + "");
                    check[index] = true;
                }
                flag = true;
                for (int i = 0; i < 10; i++) {
                    if (check[i] == false) {
                        flag =false;
                        break;
                    }
                }
                long nn=n;
                while (!flag) {
                    flag = true;
                    nn+=n;
                    ans=Long.toString(nn);
                    for (int i = 0; i < ans.length(); ++i) {
                        int index = Integer.parseInt(ans.charAt(i) + "");
                        check[index] = true;
                    }
                    //flag=true;
                    for (int i = 0; i < 10; i++) {
                        if (check[i] == false) {
                            flag =false;
                            break;
                        }
                       // System.out.print(i+" "+check[i] + " ");
                    }
                    //System.out.println();
                }
                System.out.println("Case #"+ii+": "+ans);
            }
        }
    }
}
