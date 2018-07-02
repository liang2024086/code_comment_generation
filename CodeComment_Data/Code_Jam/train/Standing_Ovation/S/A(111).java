package methodEmbedding.Standing_Ovation.S.LYD174;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\YOU-XIN\\Desktop\\A-small-attempt1.in"));
		
		// first line tells the test case number
		int t = Integer.parseInt(br.readLine());
		//System.out.println("Number of test cases: " + t);
		
		// the output text
		StringBuffer sb = new StringBuffer();
		
		// loop over t test cases
		for (int i = 0; i < t; i++) {
			String[] test = br.readLine().split(" ");
			int smax = Integer.parseInt(test[0]);
			char[] sarray = test[1].toCharArray();
			int invite = 0;

			// computer how many friends to invite
			int stand = 0;
			for (int s = 0; s < sarray.length; s++) {
				int p = Integer.parseInt(String.valueOf(sarray[s]));
				if (s > stand) {
					int need = s - stand;
					invite += need;
					stand += need;
				}
				stand += p;
			}

			// craft output
			sb.append("Case #" + (i + 1) + ": " + invite);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
