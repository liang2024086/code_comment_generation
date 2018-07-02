package methodEmbedding.Standing_Ovation.S.LYD621;

import java.io.*;
import java.util.*;

public class A {
	public static void main (String[]args)throws IOException{
		BufferedReader x=new BufferedReader(new FileReader("Asmall.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Asmall.out")));
		int t=Integer.parseInt(x.readLine());
		for (int cases=1; cases<=t; cases++){
			StringTokenizer st=new StringTokenizer(x.readLine());
			int n=Integer.parseInt(st.nextToken());
			String s=st.nextToken();
			int[]num=new int[n+1];
			for (int i=0; i<=n; i++){
				num[i]=Integer.parseInt(s.charAt(i)+"");
			}
			int cumsum=0;
			int standing=0;
			for (int i=0; i<=n; i++){
				if (i<=standing){
					standing+=num[i];
				}else{
					cumsum+=i-standing;
					standing+=(i-standing)+num[i];
				}
			}
			out.println("Case #"+cases+": "+cumsum);
		}
		out.close();
		System.exit(0);
	}
}
