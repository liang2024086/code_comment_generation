package methodEmbedding.Counting_Sheep.S.LYD490;

import java.io.*;
import java.util.*;

public class codejam{
	
	static String i0 = "dummy.in";
	static String o0 = "dummy.out";
	
	static String i1 = "small.in";
	static String o1 = "small.out";
	
	static String i2 = "large.in";
	static String o2 = "large.out";
	
	public static void main(String[] args) throws Exception{
		
		Scanner r = null;
		BufferedWriter w = null;
		
		r = new Scanner(new FileReader(i0));
		w = new BufferedWriter(new FileWriter(new File(o0)));
		
		int t = r.nextInt();
		for (int i=0;i<t;i++){
			System.out.println("Case #"+(i+1)+"--------------");
			
			long result = 0;
			
			w.write("Case #"+(i+1)+": ");
			
			int n = r.nextInt();
			int[] m = new int[10];
			int counter = 0;
			int cnt = 2;
			int tmp = n;
			if (n == 0) {
				w.write("INSOMNIA\n");
				continue;
			}
			while(true){
				char[] s = (""+tmp).toCharArray();
				for (char c:s){
					if (m[c - '0'] != 1) {
						m[c - '0'] = 1;
						counter++;
					}
				}
				if (counter == 10)
					break;
				else{
					tmp = n*cnt;
					cnt++;
				}
			}
			
			w.write(String.valueOf(tmp));
			w.write("\n");
		}
		w.close();
	}
}


