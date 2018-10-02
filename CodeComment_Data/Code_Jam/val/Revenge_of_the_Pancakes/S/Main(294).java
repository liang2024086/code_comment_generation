package methodEmbedding.Revenge_of_the_Pancakes.S.LYD294;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        cin.nextLine();
        for (int i=1;i<=t;i++) {
        	String pancakes = cin.nextLine();
        	int out = 0;
    		String last = pancakes.substring(0, 1);
        	for (int j=1;j<pancakes.length();j++){
        		String curr = pancakes.substring(j, j+1);
        		if (!curr.equals(last)){
        			out++;
        		}
        		last = curr;
        	}
        	if (last.equals("-")) out++;
        	System.out.println("Case #"+i+": "+out);
        }
    }
}
