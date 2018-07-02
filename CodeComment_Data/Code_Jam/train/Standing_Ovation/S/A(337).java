package methodEmbedding.Standing_Ovation.S.LYD2035;


import java.util.Scanner;

/**
 * Created by Rathinakumar on 4/10/2015.
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 1 ; t<=T; t++)
        {
            int sMax = sc.nextInt();
            String s = sc.next();
            int tot= 0;
            int add = 0;
            for(int i=0; i<=sMax; i++)
            {
                int n = Integer.parseInt(String.valueOf(s.charAt(i)));
                if(n>0 && tot<i)
                {
                    add += i-tot;
                    tot=i;
                }
                tot+=n;
            }
            System.out.println("Case #"+t+": "+add);
        }
    }
}
