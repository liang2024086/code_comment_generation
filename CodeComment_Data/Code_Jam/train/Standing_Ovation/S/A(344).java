package methodEmbedding.Standing_Ovation.S.LYD593;

import java.util.*;
import java.io.*;

public class A {

    public static void main(String[] args) throws Exception {
    	Scanner s = new Scanner(new FileReader("a.in"));
    	PrintWriter printer = new PrintWriter(new FileWriter("a.out"));
    	int t = s.nextInt();
    	for(int i=0; i<t; i++) {
    		int n = s.nextInt();
    		int[] arr = new int[n+1];
    		String str = s.next();
    		for(int j=0; j<str.length(); j++)
    			arr[j] = (int)(str.charAt(j)-'0');
    		int sum = arr[0];
    		int ans = 0;
    		for(int j=1; j<str.length(); j++) {
    			if(sum < j) {
    				sum++;
    				ans++;
    			}
    			sum += arr[j];
    		}
    		printer.println("Case #" + (i+1) + ": " + ans);
    	}
    	printer.close();
    }
}
