package methodEmbedding.Standing_Ovation.S.LYD2126;


import java.util.*;
import java.io.*;

public class StandingOvation {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileReader("c:\\Gcj\\A-small-attempt2.in"));
		PrintWriter out = new PrintWriter(new FileWriter("c:\\Gcj\\A-small-attempt2.out"));
		int res, cur, smax;
		char[] val;
		
		int T = sc.nextInt();		
		for(int t=1; t<=T; t++) {
			out.print("Case #"+t+": ");			
			res=0; 
			cur=0;
			
			smax = sc.nextInt();
			val = sc.next().toCharArray();
			if(smax==0) {
				out.println("0");
				continue;
			}
			
			for(int s=0; s<=smax; s++) {
				if((val[s]-'0')>0 && s>cur) {					
					res+=s-cur;
					cur+=s-cur;
				}
				cur+=(val[s]-'0');				
			}
			out.println(res);			
		}		
		out.flush();
		out.close();
		sc.close();
	}
}
