package methodEmbedding.Standing_Ovation.S.LYD1148;


import java.io.*;

public class Jam1 {
	
	public static void main(String[] args) {
		int T = 0, max = 0, cnt = 0, curSum = 0, iter = 1;
		String seq = null;
		
		// file processing
		InputStream input = null;
		BufferedReader reader;
		String line = null;
		
		try {
			input = new FileInputStream("Input.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader = new BufferedReader(new InputStreamReader(input));
		
		try {
			line = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		T = Integer.parseInt(line);
		
		while(T > 0) {
			cnt = 0;
			curSum = 0;
			seq = null;
			
			try {
				line = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String[] tokens = line.split(" ");
			max = Integer.parseInt(tokens[0]);
			seq = tokens[1];
			
			if(seq.charAt(0) == '0') {
					cnt ++;
					curSum ++;
			}
			
			for(int i = 1; i <= max; i ++) {
//				System.out.println(curSum + "  cur" + i);
//				int tmp = seq.charAt(i) - '0';
				curSum += seq.charAt(i - 1) - '0';
				if(curSum < i) {
					cnt += i - curSum;
					curSum = i;
				}
//				curSum += tmp;
			}
			System.out.println("Case #" + iter + ": " + cnt);
			iter ++;
			T --;
		}
	}
}
