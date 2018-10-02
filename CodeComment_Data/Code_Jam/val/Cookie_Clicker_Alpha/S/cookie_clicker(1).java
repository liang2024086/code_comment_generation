package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1036;

import java.io.*;

public class cookie_clicker {	
	public static void main(String[] args)throws FileNotFoundException{
	int T;
	double C, F, X;
	double time, time_buying, time_no_buying, cookie_rate;
	String bw_line;
	String line;
	String[] values;
	
	try{		
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		File file = new File("cookie_clicker_out.txt");
		 
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		T = Integer.parseInt(br.readLine());
		
		for(int j = 1; j <= T; j++){
			line = br.readLine();
			values = line.split(" ");
			C = Double.parseDouble(values[0]);
			F = Double.parseDouble(values[1]);
			X = Double.parseDouble(values[2]);
			time = 0.0;
			cookie_rate = 2.0;
			
			while(true){
				time_no_buying = X/cookie_rate;
				time_buying = C/cookie_rate;
				time_buying += X/(cookie_rate + F);
				
				if(time_no_buying <= time_buying){
					time += time_no_buying;
					//DecimalFormat f = new DecimalFormat("##.0000000");
					bw_line = "Case #" + j + ": " + time;
					
					bw.write(bw_line);
					bw.newLine();					
					break;
				}
				else{
					time += C/cookie_rate;
					cookie_rate += F;
				}
			}			
		}
		br.close();
		bw.close();
	}catch(Exception ex){}
	finally {		
	}		
}
}
