package methodEmbedding.Standing_Ovation.S.LYD425;

import java.util.*;
/*
 * Created by Prasanna on 4/11/2015.
 */
public class A2015 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for(int t=1;t<=T;t++) {

            int l = in.nextInt();
            char [] s = in.next().toCharArray();
            int []a = new int[s.length];
            int sppl = 0,count = 0;
            if(s.length == 1 && s[0] == 1)
                System.out.println("Case #" + t + ": " + 0);
            else if(s.length == 1 && s[0] == 0)
                System.out.println("Case #" + t + ": " + 1);
            else {
                for (int i = 0; i < s.length; i++)
                    a[i] = Character.getNumericValue(s[i]);
                for (int i = 0; i < a.length-1; i++) {
                    if(a[i] != 0 && a[i+1] == 0){}
                    else if(a[i] == 0 && a[i+1] != 0) {
                        if (sppl < i+1) {
                            int p = i + 1 - sppl;
                            sppl += p;
                            count += p;
                            //System.out.println(i+"**");
                        }
                        //System.out.println("sppl "+sppl);
                    }
                    //System.out.println(i);
                    sppl += a[i];
                }
                System.out.println("Case #" + t + ": " + count);
            }
        }
    }
}
