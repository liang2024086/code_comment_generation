package methodEmbedding.Standing_Ovation.S.LYD1172;

import java.io.*;
import java.util.*;
import java.math.*;

public class A
{
	public static void main(String[] args) throws Throwable
	{
		Scanner sc = new Scanner(new File("A-small-attempt0.in"));
		// BufferedReader in = new BufferedReader(new FileReader("A-large.in.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Asmall.out")));
		int t = sc.nextInt();
		for(int caseno = 1; caseno <= t; caseno++)
		{
			int n = sc.nextInt();
			String shy = sc.next();
			int sum = 0;
			int max = 0;
			for(int i = 0; i <= n; i++){
				sum += shy.charAt(i) - 48;
				//System.out.println(i-sum);
				if(i + 1 - sum > max){
					max = i - sum + 1;
				}
			}
			out.println("Case #" + caseno + ": " + max);
		}
		out.close();
		System.exit(0);
	}
}

/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ChargingChaos {
	public static void main(String[]Args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("A-small-attempt0 (4).in"));
		PrintWriter out = new PrintWriter(new File("things.out"));
//		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(),cc=0;
		while(t-->0){
			int n = sc.nextInt();
			int l = sc.nextInt();
			sc.

			long[] things = new long[n];
			long[] things2 = new long[n];
			HashSet<Long> hs = new HashSet<Long>();
			for(int k = 0; k < n;k++)
				things[k]= make(sc.next());
			for(int k = 0; k < n;k++){
				things2[k]= make(sc.next());
				hs.add(things2[k]);
			}
			int ans = l+1;
			for(int k = 0; k < n; k++){
				long swit = things[0]^things2[k];
				boolean good =true;
				for(int j = 0;good && j < n;j++)
					if(!hs.contains(things[j] ^ swit))
						good = false;
				if(good)
					ans = Math.min(Long.bitCount(swit),ans);
			}
			if(ans!=l+1)
				out.printf("Case #%d: %d%n",++cc, ans);
			else
				out.printf("Case #%d: NOT POSSIBLE%n",++cc);
			
		}
		out.close();
	}

	private static long make(String s) {
		return Long.parseLong(s, 2);
	}
}
*/
