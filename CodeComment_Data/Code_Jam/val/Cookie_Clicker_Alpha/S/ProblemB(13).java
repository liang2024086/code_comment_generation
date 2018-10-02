package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1375;

import java.io.*;

public class ProblemB {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("B-small-attempt0.in"));
        PrintWriter writer = new PrintWriter(new FileWriter("B-small-attempt0.out", false));
		
		int t = Integer.parseInt(reader.readLine());
		String[] s;
		double c, f, x;
		
		double time, rate;
		
		for(int loop = 1; loop <= t; loop++) {
			
			time = 0;
			rate = 2d;
			
			s = reader.readLine().split(" ");
			
			c = Double.parseDouble(s[0]);
			f = Double.parseDouble(s[1]);
			x = Double.parseDouble(s[2]);
			
			while(true) {
				
				time += c / rate;
				
				if(x / (rate + f) < (x - c) / rate) {
					rate += f;
				} else {
					time += (x - c) / rate;
					break;
				}
				
			}
			
			writer.println("Case #" + loop + ": " + time);
			
		}
		
		writer.close();
        
    }
    
}
