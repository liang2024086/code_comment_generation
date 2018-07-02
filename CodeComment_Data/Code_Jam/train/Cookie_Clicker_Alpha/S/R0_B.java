package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1433;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class R0_B {
	
	public static void main(String[] args) {
		
		try {
		
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			int T = Integer.parseInt(bf.readLine());
			
			for (int i=0; i<T; i++) {
				
				String[] strTemp = bf.readLine().split(" ");
				double C = Double.parseDouble(strTemp[0]);
				double F = Double.parseDouble(strTemp[1]);
				double X = Double.parseDouble(strTemp[2]);
				
				double currentSpeed = 2.0;
				double currentTime = 0;
				
				double minTime = X / currentSpeed;
				
				while (true) {
					
					currentTime = currentTime + C / currentSpeed;
					currentSpeed = currentSpeed + F;
					double timeX = X / currentSpeed;
					
					if (minTime <= currentTime + timeX) break;
					minTime = currentTime + timeX;
					
				}
		
				System.out.println("Case #" + (i+1) + ": " + minTime);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
