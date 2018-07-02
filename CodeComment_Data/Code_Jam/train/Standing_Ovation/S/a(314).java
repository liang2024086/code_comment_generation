package methodEmbedding.Standing_Ovation.S.LYD31;

import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: Michal
 * Date: 11.4.15
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
        int count = 0;
        int needed = 0;
            int blablablablablabla = in.nextInt();
            String s = in.next();
        for (int j = 0; j < blablablablablabla+1; j++) {
            if(needed+count<j){
                needed++;
            }
            count += s.charAt(j)-'0';
        }
            System.out.println("Case #"+i+": "+needed);
        }
    }
}
