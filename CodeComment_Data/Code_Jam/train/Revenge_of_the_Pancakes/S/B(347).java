package methodEmbedding.Revenge_of_the_Pancakes.S.LYD166;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 try(Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            for(int t = 1 ; t <= T; t++) {
                String s = sc.next();
                int n = s.length();
                long plus[] = new long[n+1];
                long minus[] = new long[n+1];
                plus[0] = 0L;
                minus[0] = 0L;
                for(int i = 1 ; i <= n; i++) {
                	if(s.charAt(i-1) == '+') {
                		plus[i] = Math.min(plus[i-1], minus[i-1] + 1);
                		minus[i] = Math.min(plus[i-1] + 1, minus[i-1] + 2);
                	} else {
                		plus[i] = Math.min(minus[i-1] + 1, plus[i-1] + 2);
                		minus[i] = Math.min(minus[i-1], plus[i-1] + 1);
                	}
                }
                System.out.println("Case #" + t + ": " + plus[n]);
            }
		 }
	}
}
