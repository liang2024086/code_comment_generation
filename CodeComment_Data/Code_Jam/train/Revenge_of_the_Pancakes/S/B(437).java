package methodEmbedding.Revenge_of_the_Pancakes.S.LYD617;

import java.util.*;
import java.io.*;

public class B {
	static PrintWriter pw;
	public static void main(String args[]) throws Exception{
		BufferedReader input = new BufferedReader(new FileReader("../GoogleCodeJam2015/io/B-large.in"));
		pw = new PrintWriter(new FileWriter("../GoogleCodeJam2015/io/output.txt"));
		int T = Integer.parseInt(input.readLine());
		for(int i = 0 ; i < T ; i++){
			int D = Integer.parseInt(input.readLine());
			String[] st = input.readLine().split(" ");
			int[] a = new int[D];
			for(int j = 0 ; j < D ; j++){
				a[j] = Integer.parseInt(st[j]);
			}
			Arrays.sort(a);
			int min = Integer.MAX_VALUE;
			for(int j = a[D - 1] ; j >= 1 ; j--){
				int tmp = 0;
				for(int k = 0 ; k < D ; k++){
					if(a[k] > j){
						if(a[k] % j != 0){
							tmp += a[k] / j;
						}else{
							tmp += a[k] / j - 1;
						}
					}
				}
				tmp += j;
				min = Math.min(min, tmp);
			}
			pw.println("Case #"+(i+1)+": "+min);
		}
		pw.flush();
		input.close();
		pw.close();
	}
}
