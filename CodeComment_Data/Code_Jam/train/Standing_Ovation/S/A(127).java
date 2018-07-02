package methodEmbedding.Standing_Ovation.S.LYD2222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int ti = 0; ti < t; ti++) {
			String line = br.readLine();
			String[] slivers = line.split(" ");
			int smax = Integer.parseInt(slivers[0]);
			char[] members = slivers[1].toCharArray();
			assert members.length == smax +1;
			int[] shyness = new int[smax+1];
			for (int i = 0; i < members.length; i++) {
				shyness[i] = members[i] - '0';
			}
			int count = 0;
			int friends = 0;
			for (int i = 0; i < shyness.length; i++) {

				int diff = i - count;
				count += shyness[i];
				if (diff <= 0){
					continue;
				}
				friends++;
				count++;
			}
			System.out.println("Case #"+(ti+1)+": " + friends);
		}
	}
	
}
