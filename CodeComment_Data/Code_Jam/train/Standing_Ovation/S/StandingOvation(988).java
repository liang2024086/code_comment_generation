package methodEmbedding.Standing_Ovation.S.LYD1393;

import java.util.*;
import java.lang.*;
import java.io.*;

class StandingOvation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		for(int test = 0; test < tests; test++) {
			int n = scan.nextInt()+1;
			String[] ins = scan.nextLine().trim().split("");
			int sum = 0;
			int friends = 0;
			for(int i  = 0; i < n; i++) {
				//System.out.println(i+" "+sum+" "+friends+" "+n+" "+Arrays.toString(ins));
				int in = Integer.parseInt(ins[i]);
				if(i-sum>friends && in > 0)
					friends = i-sum;
				sum+=in;
			}
			System.out.println("Case #"+(test+1)+": "+friends);
		}
	}
}
