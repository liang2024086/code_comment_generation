package methodEmbedding.Cookie_Clicker_Alpha.S.LYD282;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;


public class CookieClickerAlpha {
	
	public static final String filename = "B-small-attempt0";

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(filename+".in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filename + ".out")));
		DecimalFormat form = new DecimalFormat("0.0000000");
		int t = Integer.parseInt(br.readLine());
		for (int i=1; i<=t; i++){
			double c,f,x,rate,time;
			String linea[] = br.readLine().split(" ");
			c = Double.parseDouble(linea[0]);
			f = Double.parseDouble(linea[1]);
			x = Double.parseDouble(linea[2]);
			rate = 2d;
			time = 0d;
			boolean finish = false;
			while(!finish){
				double timeBuy, thisTime, nextTime;
				timeBuy = c / rate;
				nextTime = timeBuy + (x / (rate + f));
				thisTime = x / rate;
				if (thisTime <= nextTime){
					time += thisTime;
					finish = true;
				}else{
					time += timeBuy;
					rate += f;
				}
			}
			bw.write("Case #"+i+": "+form.format(time).replace(",", ".")+"\n");
		}
		br.close();
		bw.close();
	}

}
