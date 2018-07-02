package methodEmbedding.Cookie_Clicker_Alpha.S.LYD852;

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int num  = 1;
		while(T-->0) {
			String s[] = br.readLine().split(" ");
			double c = Double.parseDouble(s[0]);
			double f = Double.parseDouble(s[1]);
			double x = Double.parseDouble(s[2]);
			double time = 0.0;
			double fnow = 2.0;
			while(true){
				if(c/(fnow) + x/(fnow + f) > x/fnow) break;
				time += c / fnow;
				fnow += f;
			}
			time += x / fnow;
			System.out.printf("Case #%d: %.7f\n", num++, time);
		}
	}
}
