package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1008;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class CJQuali2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("ans.txt"));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++){
			String[] tmp = br.readLine().split(" ");
			double C = Double.parseDouble(tmp[0]);
			double F = Double.parseDouble(tmp[1]);
			double X = Double.parseDouble(tmp[2]);
			double speed = 2.0;
			double days = 0.0;
			if(X < C){
				days = X / speed;
			}
			else{
				while(true){
					if(X / (speed + F) > (X-C) / speed){
						days += X / speed;
						break;
					}
					else{
						days += C / speed;
						speed += F;
					}
				}
			}
			DecimalFormat df = new DecimalFormat("0.0000000");
			bw.write("Case #" + (i+1) + ": " +df.format(days)+ "\n");
			
		}
		br.close();
		bw.close();
	}

}
