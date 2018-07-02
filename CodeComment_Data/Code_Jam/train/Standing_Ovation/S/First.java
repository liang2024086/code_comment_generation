package methodEmbedding.Standing_Ovation.S.LYD999;

import java.io.*;
import java.util.*;
class First{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine());
		int a=T;
		StringTokenizer st;
		while(T-->0){
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			//n++;
			String s = st.nextToken();
			long count =0;
			long total =0;
			for(int i=0;i<=n;i++){
				if(count<i)
					count+=(i-count);
				count+=Integer.parseInt(s.charAt(i)+"");
				total+=Integer.parseInt(s.charAt(i)+"");
			}
			pw.println("Case #"+(a-T)+": "+(count-total));
				
			
		}
		//System.out.println("HelloWorld!");
	pw.flush();
	}

}
