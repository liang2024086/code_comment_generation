package methodEmbedding.Counting_Sheep.S.LYD390;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++) {
        	
        	int test = scan.nextInt();
        	if(test==0) {
        		System.out.println("Case #"+i+": INSOMNIA");
        		continue;
        	}
        	
        	boolean[] seen = new boolean[10];
        	int toSee = 10;
        	
        	int mult = 0;
        	while(toSee > 0) {
//        		System.out.println(test+" "+mult);
        		long t = test*++mult;
        		
//        		System.out.println(toSee+" : "+t);
        		
        		while(t>0) {
        			int k = (int) (t%10);
        			if(!seen[k]) {
        				--toSee;
        				seen[k] = true;
        			}
        			t/=10;
        		}
        	}
        	
        	System.out.println("Case #"+i+": "+(mult*test));
        }
    }
}
