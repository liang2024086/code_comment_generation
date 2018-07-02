package methodEmbedding.Cookie_Clicker_Alpha.S.LYD287;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CookieClicker {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("testing.txt"));
			int times = Integer.valueOf(br.readLine());
			
			for (int i=0; i<times; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				double costOfFarm = Double.valueOf(st.nextToken());
				double farmProduce = Double.valueOf(st.nextToken());
				double winPoint = Double.valueOf(st.nextToken());
				
				double noFarmTime = winPoint / 2;
				double bestTime = noFarmTime;
				double currentTime = 0.0;
				int farmNum = 1;
				while(true) {
					currentTime = winPoint / (2 + farmNum*farmProduce);
					for (int j=0; j<farmNum; j++){
						currentTime += costOfFarm / (2+j*farmProduce);
					}
					if ( currentTime > bestTime) {
						System.out.println("Case #" + (i+1) +": " + bestTime);
						break;
					}
					else
						bestTime = currentTime;
					farmNum++;
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
