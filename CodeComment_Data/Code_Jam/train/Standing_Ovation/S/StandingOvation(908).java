package methodEmbedding.Standing_Ovation.S.LYD1824;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StandingOvation{
	
	public static void main(String[] args)	{
        Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=1; t<=T; t++) {
            int N = in.nextInt() + 1;
            char[] arr = in.next().toCharArray();
            int ans = 0;
            int temp = 0;
            int ppl = arr[0] - '0' ;
            for (int level = 1 ; level < N ; level++) {
                temp = arr[level] - '0';
                if (ppl < level) {++ans; ++temp;}
                ppl += temp;
                //System.out.println(level + " :: " + ppl + " :: " + ans);
            }
            System.out.println("Case #" + t + ": " + ans);
        }
        in.close();
    }
}
