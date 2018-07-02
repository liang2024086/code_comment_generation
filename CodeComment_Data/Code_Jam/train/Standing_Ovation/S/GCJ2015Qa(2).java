package methodEmbedding.Standing_Ovation.S.LYD1308;

import java.util.*;
import java.io.*;

public class GCJ2015Qa {
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc=new Scanner(System.in);
		PrintStream ps=new PrintStream(new FileOutputStream("GCJ2015Qa.txt"));
		int T=sc.nextInt();
		int smax,claps,extras;
		ArrayList<Integer> sv;
		String s;
		
		for(int t=1; t<=T; t++){
			
			smax=sc.nextInt();
			sv=new ArrayList<Integer>(smax+2);
			s=sc.next();
			for(int i=0; i<=smax; i++){
				sv.add((int)s.charAt(i)-48);
			}
			//
			claps=sv.get(0);
			extras=0;
			
			for(int i=1; i<=smax; i++){
				if(claps<i){
					extras+=i-claps;
					claps=i;
				}
				claps+=sv.get(i);
			}
			
			ps.format("Case #%d: %d\n", t, extras);
			
		}
		
		ps.close();
		sc.close();
		
	}

}
