package methodEmbedding.Revenge_of_the_Pancakes.S.LYD191;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ProblemB {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt() + 1;
        for (int i = 1 ; i < N ; i++) {
    			   String s = in.next();
             int lIdx = s.lastIndexOf("-");
             int num = 0;

             //Stack<Character> stack = new Stack<Character>();
             //if (s.charAt(idx) == '+') stack.push('-'); else stack.push('+');

             /*while (lIdx != -1) {
                ++num;
                String tmp = "";
                int idx = 0;
                System.out.println(s + " :: " + lIdx);
                while (idx <= lIdx) {
                  tmp = ((s.charAt(idx) == '+') ? "-" : "+") + tmp ;
                  ++idx;
                }
                System.out.println(tmp);
                s = tmp.substring(0, tmp.lastIndexOf('-')) ;//+ ((lIdx < s.length() - 1) ? s.substring(lIdx + 1) : "");
                lIdx = s.lastIndexOf("-");
                System.out.println(s + " : temp : " + tmp + " " + lIdx);
                //lIdx = -1;
             }*/
             // ends with + ?
             if (s.charAt(s.length() - 1) == '-') {
                ++num;
                s = s.replaceAll("-", ":");
                s = s.replaceAll("\\+", "-");
                s = s.replaceAll(":", "\\+");
             }
             if (s.charAt(0) == '-') ++num;
             while (s.indexOf("+-") > -1) {
               s = s.substring(s.indexOf("+-") + 2);
               num += 2;
             }

    			   System.out.println("Case #" + i + ": " + num);
        }
		    in.close();
    }
}
