package methodEmbedding.Counting_Sheep.S.LYD1716;


import java.io.*;
import java.util.*;

public class Countsheep {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("src/gcj2016qual/A-small-attempt0.in"))));
	
		PrintWriter out = new PrintWriter("src/gcj2016qual/A.out");
		
		int res, rep, i, j, co, n;
		boolean[] flag = new boolean[10];
		
		res = sc.nextInt();
		for(rep=1;rep<=res;rep++) {
			out.printf("Case #%d: ", rep);
			
			n = sc.nextInt(); co = 10;
			Arrays.fill(flag,false);
			if (n==0) {
				out.println("INSOMNIA");
				continue;
			}
			
			i = 0;
			while (co>0) {
				i++;
				
				int n2 = i*n;
				while (n2>0) {
					
					int t = n2 % 10;
					if (!flag[t]) {
						flag[t] = true; co--;
					}
					n2 /= 10;
					
				}
				
				//System.out.println(co);
			}
			
			out.println(i*n);
		}
		
		out.close();
	}

}
