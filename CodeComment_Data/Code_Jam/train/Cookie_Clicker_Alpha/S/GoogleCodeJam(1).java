package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1119;

import java.io.*;
import java.util.*;


public class GoogleCodeJam {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer i,j,n,t,iter=1;
		Double[] a = new Double[3];
		Double c,f,x,count,total,temp,t1,t2,t3,speed=(double) 2;
		BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Output.txt").getAbsoluteFile()));
		String line;
		try {
			t = Integer.parseInt(br.readLine());
			while(t-- != 0) {
				speed=(double) 2;
				line = br.readLine();
				String[] abc = line.split(" ");
				for(i=0;i<abc.length;i++) {
					a[i] = Double.parseDouble(abc[i]);
				}
				c = a[0];
				f = a[1];
				x = a[2];
				count = total = temp = (double) 0;
				if(x<=c) {
					bw.write("Case #");
					bw.write(iter.toString());
					bw.write(": ");
					iter++;
					total = x/((double)2);
					bw.write(total.toString());
					bw.newLine();
					continue;
				}
				while(true) {
					t1 = temp + c/speed;
					t2 = temp + x/speed;
					if(t1 + x/(speed+f) >= t2) {
						bw.write("Case #");
						bw.write(iter.toString());
						bw.write(": ");
						iter++;
						bw.write(t2.toString());
						bw.newLine();
						break;
					} else {
						temp = t1;
						speed += f;
					}
				}
			}
		} finally {
			bw.close();
		}
	}

}
