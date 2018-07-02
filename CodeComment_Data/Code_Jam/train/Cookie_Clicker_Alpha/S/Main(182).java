package methodEmbedding.Cookie_Clicker_Alpha.S.LYD263;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	private static BufferedReader br = null;
	private static File file = null;
	private static BufferedWriter bw = null;

	public static void main(String[] args) {
		String b = null;
		file = new File("C:\\B-small.out");
		if (!file.exists() != false) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			bw = new BufferedWriter(new FileWriter(file));
			FileReader fr = new FileReader("C:\\B-small-attempt0.in");
			br = new BufferedReader(fr);
			// read the count of cases
			int count = 0;
			if ((b = br.readLine()) != null) {
				count = Integer.parseInt(b.trim());
			}
			// loop all cases
			for (int task = 1; task <= count; task++) {
				//System.out.println("start task " + task);
				String line[] = br.readLine().split(" ");
				double c = Double.parseDouble(line[0].trim());
				double f = Double.parseDouble(line[1].trim());
				double x = Double.parseDouble(line[2].trim());
				//System.out.println("C: " + c + " F: " + f + " X: " + x);
				double result = 0.0;
				double sum = 0.0;
				double speed = 2.0;
				for (int process = 1; process <= 100000; process++) {
					//System.out.println("Process: " + process);
					if (sum >= x){
						break;
					}
					double buyFarmThenWin = (c - sum)/speed + x/(speed+f);
					double winTime = (x - sum)/speed;
					if(buyFarmThenWin < winTime){
						result += (c - sum)/speed;
						speed += f;
					}else{
						result += winTime;
						break;
					}
				}
				bw.write("Case #" + task + ": " + result);
				System.out.println("Case #" + task + ": " + result);
				bw.newLine();
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				// bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
