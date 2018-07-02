package methodEmbedding.Revenge_of_the_Pancakes.S.LYD773;

import java.util.*;
import java.io.*;

public class B {

    public static void main(String[] args) throws Exception {
    	Scanner s = new Scanner(new FileReader("b.in"));
    	PrintWriter p = new PrintWriter(new FileWriter("b.out"));
    	int t = s.nextInt();
    	for(int i=1; i<=t; i++) {
    		String str = s.next();
    		int count = 0;
    		char last = str.charAt(str.length()-1);
    		for(int j=0; j<str.length(); j++) {
    			char cur = str.charAt(j);
    			count++;
    			while(j<str.length()) {
    				if(cur != str.charAt(j)) break;
    				j++;
    			}
    			j--;
    		}
    		if(last == '+') count--;
			p.println("Case #" + i + ": " + count);
			System.out.println("Case #" + i + ": " + count);
    	}
    	p.close();
    }
}
