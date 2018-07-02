package methodEmbedding.Magic_Trick.S.LYD735;

import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine().trim());
		int t1=1;
		while(t-->0){
			pw.print("Case #"+t1+": ");
			int p1=Integer.parseInt(br.readLine().trim());
			int k=p1-1;
			while(k-->0)
				br.readLine();
			String s[]=br.readLine().trim().split(" ");
			Set<Integer> st1=new HashSet<Integer>();
			for(String sk:s )
				st1.add(Integer.parseInt(sk.trim()));
			k=4-p1;
			while(k-->0)
				br.readLine();
			int p2=Integer.parseInt(br.readLine().trim());
			k=p2-1;
			while(k-->0)
				br.readLine();
			s=br.readLine().trim().split(" ");
			Set<Integer> st2=new HashSet<Integer>();
			for(String sk:s )
				st2.add(Integer.parseInt(sk.trim()));
			k=4-p2;
			while(k-->0)
				br.readLine();
			
			if(Collections.disjoint(st1,st2)){
				pw.println("Volunteer cheated!");
			}
			else{
				int count=0,val1=0;
				Iterator<Integer> it1=st1.iterator();
				while(it1.hasNext()){
					int one=it1.next();
					Iterator<Integer> it2=st2.iterator();
					while(it2.hasNext()){
						if(one==it2.next()){
							count++;
							if(count==1)
								val1=one;
						}
					}
				}
				if(count==1)
					pw.println(val1);
				else
					pw.println("Bad magician!");
			}
			t1++;
		}
		pw.flush();pw.close();
	
	}
}
