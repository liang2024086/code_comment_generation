package methodEmbedding.Standing_Ovation.S.LYD929;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("A.in"));
        int T = in.nextInt();
        for (int t = 1; t <= T; t++) {
            int max = in.nextInt() ;
            String n = in.next() ;
            char [] arr = n.toCharArray();
            int curr = 0;
            int res = 0;
            for (int reqd=0;reqd<arr.length;reqd++) {
                char c = arr[reqd];
                int si = Integer.valueOf(String.valueOf(c));
                int diff = 0;
                int added = 0;
                if (si > 0) {
                    if (reqd > curr) {
                        diff = reqd-curr;
                        while(diff > 0) {
                            added ++;
                            diff --;
                        }
                        res += added;
                        curr += added;
                    }
                    curr += si;
                }
                
            }
            System.out.printf("Case #%d: ", t);
            System.out.println(res);
        }
    }

}
