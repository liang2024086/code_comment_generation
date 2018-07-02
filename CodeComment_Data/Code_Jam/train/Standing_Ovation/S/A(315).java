package methodEmbedding.Standing_Ovation.S.LYD438;

import java.util.*;
import java.io.*;

public class A{
	public static void main(String[] args)throws IOException{
		Scanner in = new Scanner(new File("A-small-attempt6.in"));
		int t = in.nextInt();
		PrintWriter out = new PrintWriter(new File("A.txt"));
		int m;
		int n;
		for(int i = 0; i < t; i++){
			m = in.nextInt();
			n = in.nextInt();
			int count = 0;
			int friend = 0;
			int[] a = new int[m+1];
			for(int j = 0; j <= m; j++){
				a[m-j] = n%10;
				n /= 10;
			}
			for(int k = 0; k < a.length; k++){
				int temp = 0;
				if(a[k]>0 && k > count){
					temp = k - count;
					
					friend += k-count;
				}
				else{
					temp = 0;
				}
				System.out.println(a[k] + " " + k + " " + count + " " + friend);
				count += a[k] + temp;
				
			}
			out.println("Case #" + (i+1) + ": " + friend);
			System.out.println((i+1)+ " " + friend);
		
		}
		in.close();
		out.close();
	}
}
