package methodEmbedding.Counting_Sheep.S.LYD331;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader("/Users/yonggoo/Desktop/A-small-attempt1.in"));
		FileWriter fw = new FileWriter("/Users/yonggoo/Desktop/file_out1.txt", true);
		int T = Integer.parseInt(bf.readLine());
		int N;
		
		for(int i = 1; i <= T; i++){
			int[] checker = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			N = Integer.parseInt(bf.readLine());
			if(N==0){
				fw.write("Case #" + i + ": INSOMNIA\n");
				continue;
			}
			for(int j = 1; true; j++){
				int checkVal = 1;
				int temp = N * j;
				
				while(temp > 0){
					checker[temp%10] += 1;
					temp /= 10;
				}
				
				for(int arrVal : checker)
					checkVal *= arrVal;
				
				if(checkVal != 0){
					fw.write("Case #" + i + ": " + N*j + "\n");
					break;
				}
					
			}
		}
		fw.flush();
	}
}
