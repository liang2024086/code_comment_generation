package methodEmbedding.Standing_Ovation.S.LYD1108;

import java.io.*;
public class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		System.setOut(out);
		String st = in.readLine();
		int test = Integer.parseInt(st);
		for (int t=1;t<=test;t++){
			String[] line = in.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int sum = 0;
			int res = 0;
			for (int i=0;i<=n;i++) {
				if (sum<i) {res=res+(i-sum);sum=i;}
				int x = (int)line[1].charAt(i)-'0';
				sum=sum+x;
			}
			System.out.println("Case #"+t+": "+res);
		}
		
	}
}
