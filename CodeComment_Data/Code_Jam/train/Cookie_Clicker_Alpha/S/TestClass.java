package methodEmbedding.Cookie_Clicker_Alpha.S.LYD942;

import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int count = 0; count < testCases; count++){
        	String input[] = br.readLine().split(" ");
        	double C = Double.parseDouble(input[0]);
        	double F = Double.parseDouble(input[1]);
        	double X = Double.parseDouble(input[2]);
        	double currentMinimum = X/2;
        	double farmSize = 0;
        	double farmTime = 0;
        	while(true){
        		farmTime = farmTime + C/(2+farmSize);
        		farmSize = farmSize + F;
        		double totalTime = farmTime + X/(2+farmSize);
        		if(totalTime > currentMinimum){
        			break;
        		}else{
        			currentMinimum = totalTime;
        		}
        	}
        	System.out.println("Case #" + (count + 1) +": " + currentMinimum);
        }
    }
}
