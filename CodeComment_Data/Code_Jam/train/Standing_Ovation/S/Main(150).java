package methodEmbedding.Standing_Ovation.S.LYD1748;


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
		file = new File("/Users/Liupeixin/Documents/A-small.out");
		if (!file.exists() != false) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			bw = new BufferedWriter(new FileWriter(file));
			FileReader fr = new FileReader("/Users/Liupeixin/Documents/A-small-attempt0.in");
			br = new BufferedReader(fr);
			// read the count of cases
			int count = 0;
			if ((b = br.readLine()) != null) {
				count = Integer.parseInt(b.trim());
			}
			// loop all cases
			for (int task = 1; task <= count; task++) {
				int n = 0;
				int need = 0;
				bw.write("Case #" + task + ":");
				System.out.println("Case #" + task + ":");

				String line[] = br.readLine().split(" ");
				int si = Integer.parseInt(line[0]);
				for(int i=0;i<=line[1].length()-1;i++){
					int number = Integer.parseInt(line[1].substring(i, i+1));
					if(i > n){
						need += i - n;
						n += i - n;
					}
					n += number;
				}
				System.out.println(" need: " + need);
				bw.write(" " + need);
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
