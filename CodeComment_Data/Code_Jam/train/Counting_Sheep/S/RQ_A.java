package methodEmbedding.Counting_Sheep.S.LYD689;

// @author:debverine | 09-Apr-2016 | 10:00:45 am
import java.io.*;
import java.util.*;

class RQ_A {

	public static void main(String[] args) throws Exception {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		BufferedReader br=new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter pw=new PrintWriter(new FileWriter("A.out"));
		HashSet<Integer> h = new HashSet<Integer>();
		int t,tc,j,n,N,d;
		t = Integer.parseInt(br.readLine().trim());
		for(tc=1;tc<=t;tc++) {
			pw.print("Case #"+tc+": ");
			h.clear();
			n=Integer.parseInt(br.readLine().trim());
			if(n==0){
				pw.println("INSOMNIA");
				continue;
			}			
			for(j=1;;j++){
				N=n*j;
				while(N>0){
					d=N%10;
					h.add(d);
					N/=10;
				}
				
				if(h.size()==10)
					break;
			}
			pw.println(n*j);
		}
		pw.flush();
		pw.close();
		br.close();
	}

}
