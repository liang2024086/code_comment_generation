package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1474;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cookie {

	public static void main(String[] args) {
		String[] result;
		int n = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("cookie/input.txt"));
			
			n = Integer.valueOf(br.readLine());
			result = new String[n];
			for (int i = 1; i <= n; i++) {
				String line = br.readLine();
				String[] values = line.split(" ");
				double c = Double.valueOf(values[0]);
				double f = Double.valueOf(values[1]);
				double x = Double.valueOf(values[2]);
				
				double currF = 2;
				double nextF = currF + f;
				double cTime = c / currF;
				double time = 0;
				while (x / currF > (cTime + x / nextF)) {
					time += cTime;
					currF = nextF;
					cTime = c / currF;
					nextF += f;
				}
				time += x / currF;
				
				result[i-1] = "Case #"+ i + ": " + time;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		try {
			BufferedWriter wr = new BufferedWriter(new FileWriter("cookie/output.txt"));
			for (int i = 0; i < n; i++) {
				wr.write(result[i]);
				wr.newLine();
			}
			wr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
