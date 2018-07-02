package methodEmbedding.Cookie_Clicker_Alpha.S.LYD349;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution2 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(isr);
		String tline = bReader.readLine();
		Integer t = Integer.parseInt(tline);
		for (int i = 0; i < t; i++) {
			int m = 0;
			double total=0;
			double[] cs = new double[3];
			double c,f,x;
			tline = bReader.readLine();
			String[] ds = tline.split(" ");
			for (int j = 0; j < ds.length; j++) {
				cs[j] = Double.parseDouble(ds[j]);
			}
			c=cs[0];f=cs[1];x=cs[2];
			double d = x/c-2/f-1;
			while (m<d) {
				
				total+=c/(m*f+2);
				m=m+1;
			}
			total+=x/(m*f+2);
			System.out.println("Case #"+(i+1)+": "+total);
		}
	}
}
