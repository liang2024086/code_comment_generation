package methodEmbedding.Cookie_Clicker_Alpha.S.LYD853;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class CookieClickerAlpha_Qual14_GCJ {
	public static void main(String[] args) {
		try{
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\arvind\\Work\\Code\\Algorithms\\Algorithmz_Home\\IO Files\\B-small-attempt0.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\arvind\\Work\\Code\\Algorithms\\Algorithmz_Home\\IO Files\\B-small-attempt0.out"));
			int noOfInputs=Integer.parseInt(br.readLine());
			for( int test = 1;test <= noOfInputs; test++){
				String cfxString[]=br.readLine().split(" ");
				double C=Double.parseDouble(cfxString[0]);
				double F=Double.parseDouble(cfxString[1]);
				double X=Double.parseDouble(cfxString[2]);
				double totalTime=0.0d;
				double currentRatePS=2d;
				while(true){
					double pickTime=(C/currentRatePS)+(X/(currentRatePS+F));
					double directCloseTime=X/currentRatePS;
					if(pickTime<directCloseTime){
						totalTime+=(C/currentRatePS);
						currentRatePS+=F;
					}else{
						totalTime+=directCloseTime;
						break;
					}
				}
				StringBuilder printThis=new StringBuilder("Case #"+(test)+": "+totalTime);
				bw.write(printThis.toString());
				System.out.println(printThis.toString());
				if(test!=noOfInputs)
					bw.write("\n");
			}		
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
