package methodEmbedding.Revenge_of_the_Pancakes.S.LYD918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PanCake {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int count;
		for (int i1 = 1; i1 <= t; i1++) {
			
		
			String str = br.readLine();
			if(!str.contains("+"))
				{
				System.out.println("Case #" + i1 + ": 1");
				continue;
				}
			int flag = 2;
			// 0-> - & 1-> +
			count = 0;
			for (int i = 0; i < str.length(); i++) {
				//System.out.println(str.charAt(i) + "  " + count);
				if (flag == 2) {
					if (str.charAt(i) == '-') {
						flag = 0;
					} else
						flag = 1;
				} else if (str.charAt(i) == '-' && flag == 0) {
				} else if (str.charAt(i) == '+' && flag == 1) {
				} else if (str.charAt(i) == '-' && flag == 1) {
					count++;
					flag=0;
				} else if (str.charAt(i) == '+' && flag == 0) {
					count++;
					flag=1;
				} else {

				}
			}
			if (str.charAt(str.length() - 1) == '-')
				count++;
			System.out.println("Case #" + i1 + ": " + count);
		}
	}
}
