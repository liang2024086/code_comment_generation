package methodEmbedding.Standing_Ovation.S.LYD1176;


import java.io.*;

class StandingOvation {
	public static void main(String args[]) throws IOException {
		/* BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));*/
		BufferedReader br = new BufferedReader(new FileReader(
				"D:/codejam/A-small-attempt2.in"));
		int testCase = Integer.parseInt(br.readLine());
		FileWriter fw = new FileWriter(new File(
				"D:/codejam/A-small-attempt2.out"));
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 1; i <= testCase; i++) {
			String input = br.readLine().split(" ")[1];
			int count = 0;
			long sum =0;
			for (int j = 0; j < input.length(); j++) {
				sum = sum + Integer.valueOf(input.charAt(j))-Integer.valueOf('0');
				if(sum<j+1) {
					count++;
					sum++;
				}
			/*	if (input.charAt(j) == '0') {
					if (previous)
						count++;
					else {
						count = 1;
						previous = true;
					}
				} else {
					if (max < count)
						max = count;
					count = 0;
					flag = false;
					previous = false;
				}
				if (max < count)
					max = count;*/
			}
//			 System.out.println(("Case #"+i+": "+count+"\n"));
			bw.write("Case #" + i + ": " + count + "\n");
		}
		bw.close();
	}
}
