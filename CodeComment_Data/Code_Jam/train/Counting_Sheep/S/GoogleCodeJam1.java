package methodEmbedding.Counting_Sheep.S.LYD668;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;


public class GoogleCodeJam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 0;
		HashSet<Character> set = new HashSet<Character>();
		long res = N;
		String str;
		int strLen, k=1;

		Scanner in = new Scanner(System.in);
		int T  = in.nextInt();
		//System.out.println(T);

		for(int i=0;i<T;i++) {
			N = in.nextInt();
			set = new HashSet<Character>();
			k = 1;
			if(N==0) {
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			else {

				res = N;
				while(set.size()!=10) {
					res = N * k;
					str = ""+res;
					strLen = str.length();
					for(int j=0;j<strLen;j++)
						set.add(str.charAt(j));
					k+=1;
				}


				System.out.println("Case #"+(i+1)+": "+res);
			}
		}

	}

}
