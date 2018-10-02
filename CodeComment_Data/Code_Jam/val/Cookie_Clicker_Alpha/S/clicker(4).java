package methodEmbedding.Cookie_Clicker_Alpha.S.LYD370;

import java.io.*;
import java.text.DecimalFormat;
public class clicker {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("B-small-attempt0.in");
		BufferedReader br = new BufferedReader(fr);
		DecimalFormat df = new DecimalFormat("#.#######");
		int numTests = Integer.parseInt(br.readLine());
		for(int n = 0; n < numTests; n++){
			String [] conditions = br.readLine().split(" ");
			double timeCurrent=0;
			double rateCurrent = 2.0000000;
			double cost = Double.parseDouble(conditions[0]);
			double farmRate = Double.parseDouble(conditions[1]);
			double goal = Double.parseDouble(conditions[2]);
			double goalTimeCurrent = goal/rateCurrent;
			double rateNew = rateCurrent + farmRate;
			double timeNew = cost/rateCurrent;
			double goalTimeNew = goal/rateNew+timeNew;
			while(goalTimeCurrent > goalTimeNew){
				rateCurrent=rateNew;
				goalTimeCurrent=goalTimeNew;
				timeCurrent=timeNew;
				rateNew = rateCurrent + farmRate;
				timeNew = timeNew+cost/rateCurrent;
				goalTimeNew = goal/rateNew+timeNew;
			}
			String output = df.format(goalTimeCurrent);
			System.out.println("Case #"+(n+1)+": "+output);
		}
	}

}
