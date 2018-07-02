package methodEmbedding.Cookie_Clicker_Alpha.S.LYD149;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cookie {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			int cases = Integer.parseInt(br.readLine());
			
			double[] out = new double[cases];
			
			for (int i = 0; i < cases; i++) {

				String in[] = br.readLine().split(" ");
				double c = Double.parseDouble(in[0]);
				double f = Double.parseDouble(in[1]);
				double x = Double.parseDouble(in[2]);

				double achieved = 0;

				double perSecond = 2;
				double timePrev = x / perSecond;
				double buy = 0;
				int cnt = -1;
				double temp = 0;
				while (true) {
					
					perSecond = 2;
					double currTime = 0;
					double timeNeeded = 0;

					buy++;

					for (int hx = 0; hx < buy; hx++) {

						timeNeeded = c / perSecond;
						currTime += timeNeeded;
						perSecond += f;
					}

					currTime += x / perSecond;

					if(timePrev <= currTime){
						//System.out.print(timePrev);
						out[i] = timePrev;
						break;
					}

					if (timePrev > currTime) {
						timePrev = currTime;
					}
				}

			}
			for( int j =0; j< cases;j++) {
				System.out.println("Case #" + (j+1) + ": " + out[j] );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
