package methodEmbedding.Cookie_Clicker_Alpha.S.LYD670;

import java.util.*;
import java.io.*;

public class Main {
	
	static double c, f, x;

    public static void main(String[] args) throws Exception {
    	Scanner s = new Scanner(new FileReader("input.txt"));
    	PrintWriter p = new PrintWriter(new FileWriter("output.txt"));
    	int n = s.nextInt();
    	for(int i=0; i<n; i++) {
    		c = s.nextDouble();
    		f = s.nextDouble();
    		x = s.nextDouble();
    		double time = 0;
    		double rate = 2;
    		while(true) {
    			if(time + x/rate < time + c/rate + x/(rate+f)) {
    				time += x/rate;
    				break;
    			}
    			time += c/rate;
    			rate += f;
    		}
    		p.println("Case #" + (i+1) + ": " + time);
    	}
    	p.close();
    }
}
