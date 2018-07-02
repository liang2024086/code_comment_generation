package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1075;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("d:/B-small-attempt0.in");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		BufferedWriter writer = new BufferedWriter(new FileWriter("d:/ans.txt"));
		String readLine = reader.readLine();
		int T = Integer.parseInt(readLine);
	
		for(int i=0;i<T;i++){
			String line = reader.readLine();
			String[] split = line.split("[ ]+");
			double cost = Double.parseDouble(split[0]);
			double plus = Double.parseDouble(split[1]);
			double position = Double.parseDouble(split[2]);
			double nowRate = 2.0;
			double min = position / nowRate;
			double nextFarmTime = cost / nowRate;
			double allNextFarmTime = 0.0;
			while(true){
				nowRate = nowRate + plus;
				allNextFarmTime = allNextFarmTime+nextFarmTime;
				double temp = allNextFarmTime + position / nowRate;
				nextFarmTime = cost /nowRate;
				
				if(temp < min){
					min = temp;
				}
				else{
					break;
				}
			}
			writer.write("Case #"+(i+1)+": "+min+"\r\n");
		}
		
		reader.close();
		writer.close();
	}

}
