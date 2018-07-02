package methodEmbedding.Magic_Trick.S.LYD1840;

import java.io.*;
import java.util.*;
public class A {
	public static void main(String [] args)throws IOException{
		//BufferedReader k = new BufferedReader(new FileReader("H:uva.txt"));
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter z = new PrintWriter(System.out);
		//PrintWriter z = new PrintWriter(new FileWriter("H:uvaans.txt"));
		int T = Integer.valueOf(k.readLine());
		int test = 1;
		while(T-->0){
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			int ans1 = Integer.valueOf(k.readLine());
			ans1--;
			int [][] y = new int[4][4];
			for(int c = 0;c<4;c++){
				int d = 0;
				StringTokenizer s = new StringTokenizer(k.readLine());
				while(s.hasMoreTokens()){
					y[c][d] = Integer.valueOf(s.nextToken());
					if(c==ans1){
						list1.add(y[c][d]);
					}
					d++;
				}
			}
			
			int ans2 = Integer.valueOf(k.readLine());
			ans2--;
			int [][] yy = new int[4][4];
			for(int c = 0;c<4;c++){
				int d = 0;
				StringTokenizer s = new StringTokenizer(k.readLine());
				while(s.hasMoreTokens()){
					yy[c][d] = Integer.valueOf(s.nextToken());
					if(c==ans2){
						list2.add(yy[c][d]);
					}
					d++;
				}
			}
			
			int j = 0;
			int fans = 0;
			
			for(int c = 0;c<4;c++){
				int v1 = list1.get(c);
				for(int d = 0;d<4;d++){
					int v2 = list2.get(d);
					if(v2==v1){
						j++;
						fans = v2;
					}
				}
			}
			
			if(j==1){
				z.println("Case #"+(test++)+": "+fans);
			}
			else if(j>1){
				z.println("Case #"+(test++)+": "+"Bad magician!");
			}
			else{
				z.println("Case #"+(test++)+": "+"Volunteer cheated!");
			}
	
		}
		z.flush();
		
	}

}
