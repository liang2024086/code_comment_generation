package methodEmbedding.Cookie_Clicker_Alpha.S.LYD318;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class CookieClicker {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new FileReader("/Users/vigneshiyer/Desktop/a.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/vigneshiyer/Desktop/op.txt"));
		String line;
		int t;
		double c,f,x,time=0,rate=2;
		DecimalFormat format = new DecimalFormat("#.0000000");
		
		t=Integer.parseInt(bi.readLine());
		String[] result = new String[t];
		String[]temp;
		for (int i = 0; i < t; i++) {
			line = bi.readLine();
			temp = line.split(" ");
			c= Double.parseDouble(temp[0]);
			f= Double.parseDouble(temp[1]);
			x= Double.parseDouble(temp[2]);
			
			while(true)
			{
				if((x/rate) > ((c/rate)+(x/(rate+f))))
				{
					//buy a new farm
					time+=(c/rate);
					//System.out.println(c/rate);
					rate = rate+f;										
				}
				else
				{
					time+=(x/rate);
					//System.out.println(x/rate);
					break;
				}
			}
			result[i] = format.format(time);	
			time=0;
			rate=2;
			
		}
		
		for (int i = 0; i < result.length; i++) {
			bw.write("Case #"+(i+1)+": "+result[i]);
			bw.newLine();
			bw.flush();
			//System.out.println("Case #"+(i+1)+": "+result[i]);
		}
		
		
	}
}
