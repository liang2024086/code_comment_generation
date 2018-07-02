package methodEmbedding.Cookie_Clicker_Alpha.S.LYD626;

public class Cookies{

	static int[][] starting;
	static int[][] ending;
	static int start, end;
	
	public static void main(String[] args){
		try{
			java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader("in3.in"));
			java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.FileWriter("output2.txt"));
			
			int numTests = Integer.parseInt(in.readLine());
			for(int t = 1; t <= numTests; t ++){
				String[] bits = in.readLine().split(" ");
				double cost = Double.parseDouble(bits[0]);
				double prod = Double.parseDouble(bits[1]);
				double target = Double.parseDouble(bits[2]);
				double cookies = 0;
				int numFarms = 0;
				double numSecs = 0;
				System.out.println("Target: "+ target + ", production: " + prod + ", cost:" + cost);
				while(true){
					double cookiesPerSec = 2 + numFarms*prod;
					double timeTillFarm = (cost/cookiesPerSec - cookies);
					double secsTillWin = (target - cookies)/cookiesPerSec; //how many seconds until win @ current rate
					
					//investigate farm purchase
					double cookiesAfter = 0;
					double cookiesPerSecAfter = 2 + (numFarms + 1)*prod;
					double secsTillWinAfter = (target - cookiesAfter)/cookiesPerSecAfter;
					
					//System.out.println("\nSecs so far: "+ numSecs + ", secs till farm: " + timeTillFarm + ", cookies per sec: " + cookiesPerSec + ", secs till win: "+ secsTillWin);
					
					if(secsTillWin < secsTillWinAfter + timeTillFarm){
						// no more farms for you mister
						numSecs += secsTillWin;
						System.out.println("Done: " + numSecs + "\n\n\n");
						out.write("Case #" + t + ": " + numSecs + "\n");
						break;
					}else{
						// best to buy a farm
						System.out.println("new farm");
						numSecs += timeTillFarm;
						cookies += cookiesPerSec*timeTillFarm;
						cookies -= cost;
						cookies = 0;
						numFarms ++;
						//System.out.println("now have " + cookies + " cookies and " + numFarms + " farms.");
						continue;
					}
				}
			}
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
