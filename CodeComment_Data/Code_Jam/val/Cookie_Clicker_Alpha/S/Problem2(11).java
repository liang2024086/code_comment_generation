package methodEmbedding.Cookie_Clicker_Alpha.S.LYD711;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) throws Exception {
		Scanner cin = new Scanner(System.in);
		BufferedWriter cout = new BufferedWriter(new FileWriter(new File("C:/Users/IBM_ADMIN/Desktop/out.txt")));
		int n;
		DecimalFormat df = new DecimalFormat("#.0000000");
		n = cin.nextInt();
		for (int i=1; i<=n ; i++){
			double c,f,x,sec=0.0d,cookie=0.0d,best = Float.MAX_VALUE;
			double inc = 2.0d;
			c = cin.nextDouble();
			f = cin.nextDouble();
			x = cin.nextDouble();
			while (cookie < x){
				double curSec1 = (x-cookie)/inc;
				if (sec+curSec1 < best)
					best =sec+curSec1;
				
				if (cookie < c){
					double curSec2 = (c-cookie)/inc;
					if (sec+curSec2+((x-0)/(inc+f)) < best){
						best = sec+curSec2+((x-0)/(inc+f));
						cookie=0;
						sec +=curSec2;
						inc+=f;
					}else{
						break;
					}
				}else{
					if (sec+((x-cookie-c)/(inc+f)) < best){
						best = sec+((x-cookie-c)/(inc+f));
						cookie-=c;
						inc+=f;
					}else{
						break;
					}
				}
			}
			cout.append("Case #"+i+": "+df.format(best)+"\n");
		}
		cout.flush();
		cout.close();
	}
}
