package methodEmbedding.Cookie_Clicker_Alpha.S.LYD270;

import java.io.*;

public class cookies {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("cookiesIn"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cookiesOut")));
		
		int amt = Integer.valueOf(file.readLine());
		double values[][] = new double[amt][3];
		
		for(int i=0;i<amt;i++) {
			String vals[] = file.readLine().split("\\s");
			for(int j=0;j<3;j++) 
				values[i][j] = Double.valueOf(vals[j]);
		}
		
		for(int i=0;i<amt;i++) {
			double c = values[i][0];
			double f = values[i][1];
			double x = values[i][2];
			
			double r = 2;  // r0
			double last = 0; // last0
			double t = x/r; // t0
			
			// ttn: time to next, rwn: rate with next
			while(true) {
				double ttn = c / r;
				double rwn = x/(r+f);
				double tn = last + ttn + rwn;
				
				if(t < tn)
					break;
				
				last += ttn;
				r += f;
				t = tn;
			}
			out.println("Case #" + (i+1) + ": " + t);
		}
		
		out.close();
		System.exit(0);
	}
}
