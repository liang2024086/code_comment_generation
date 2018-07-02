package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1373;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
			int count = Integer.parseInt(br.readLine().trim());
			for(int i = 1; i <= count; i++){
				String input[] = br.readLine().trim().split(" ");
				double c = Double.parseDouble(input[0]);
				double f = Double.parseDouble(input[1]);
				double x = Double.parseDouble(input[2]);
				
				double  currentRate = 2;
				double currentTime = 0;
				double bestTime = x/currentRate;
				double newTime = x/currentRate;
				while(true){
					newTime = currentTime + c/currentRate + x/(currentRate + f);
					if(newTime < bestTime){
						bestTime = newTime;
						currentTime = currentTime + c/currentRate;
						currentRate = currentRate + f;
					}
					else{
						break;
					}
				}
				System.out.println("Case #" + i + ": " + bestTime);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
