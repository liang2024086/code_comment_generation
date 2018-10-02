package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1307;

import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] input;
		for(int i=0;i<T;i++){
		
			input = br.readLine().split(" ");
			
			double costOfFarm = Double.parseDouble(input[0]);
			double farmSpeed = Double.parseDouble(input[1]);
			double cookieTarget = Double.parseDouble(input[2]);
			
			double timeWithCurrSpeed=0;
			double timeWithNextSpeed=0;
			double currSpeed = 2;
			double totalTimeTaken=0;
			while(true){
					timeWithCurrSpeed = (cookieTarget/currSpeed);					
					timeWithNextSpeed = (cookieTarget/(currSpeed+farmSpeed)) + (costOfFarm/currSpeed);
					
					double a=timeWithCurrSpeed*10000000;
					long tmp1=(long)a;
					double b=timeWithNextSpeed*10000000;
					long tmp2=(long)b;
					
					if(tmp2 < tmp1){
						totalTimeTaken += (costOfFarm/currSpeed);
						currSpeed += farmSpeed;					
					}
					else{
						//System.out.format("\nPrev Time %.7f " , totalTimeTaken);
						totalTimeTaken = totalTimeTaken + (cookieTarget/currSpeed);						
						//System.out.format("\nLatest Time %.7f " , totalTimeTaken);
						break;
					}
			}
			sb.append("Case #" + String.valueOf(i+1) +": " + String.format("%.7f",totalTimeTaken));
			sb.append("\n");
		}		
		System.out.println(sb);
	}
}
