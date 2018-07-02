package methodEmbedding.Standing_Ovation.S.LYD1879;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class CodeJamA {
	public static void main(String[] args) throws Throwable {
		//BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in=new BufferedReader(new FileReader("CodeJam-A-small-attempt0.in"));
		System.setOut(new PrintStream("CodeJam-A-small-attempt0.out"));
		for(int t=0,T=parseInt(in.readLine().trim());t++<T;) {
			StringTokenizer st=new StringTokenizer(in.readLine());
			int max=parseInt(st.nextToken());
			char[] a=st.nextToken().toCharArray();
			int sol=0, cant=0;
			for(int i=0;i<=max;i++) {
				int c=a[i]-'0';
				if(cant<i&&c>0) {
					sol+=(i-cant);
					cant=i;
				}
				cant+=c;
			}
			System.out.println("Case #"+t+": "+sol);
		}
	}
}
