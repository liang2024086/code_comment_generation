package methodEmbedding.Counting_Sheep.S.LYD1557;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountingSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("G:\\Tarun\\Code Jam\\A-small-attempt0.in"));
			bw = new BufferedWriter(new FileWriter(new File("G:\\Tarun\\Code Jam\\A-small-attempt0.out")));

			int N = Integer.parseInt(br.readLine());

			for(int N_i=1; N_i<=N; N_i++){
				int number = Integer.parseInt(br.readLine());
				boolean[] digits = new boolean[10];
				int multiplier = 1;
				int tempNum = number;
				while(true){
					int temp = tempNum;
					while(temp>0){
						int d = temp%10;
						digits[d] = true;
						temp/=10;
					}
					
					if(digits[0]&&digits[1]&&digits[2]&&digits[3]&&digits[4]
							&&digits[5]&&digits[6]&&digits[7]&&digits[8]&&digits[9]){
						bw.write("Case #"+N_i+": "+tempNum+"\n");
						break;
					}
					if(multiplier>100){
						bw.write("Case #"+N_i+": INSOMNIA\n");
						break;
					}
					multiplier++;
					tempNum = multiplier*number;
				}
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(bw!=null) bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
