package methodEmbedding.Revenge_of_the_Pancakes.S.LYD770;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//https://code.google.com/codejam/contest/6254486/dashboard#s=p0

public class Solution {

	public static void main(String[] args) {

		int T, N;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;
			input = br.readLine();
			T = Integer.parseInt(input);
			String caseNum;
			String S;
			Boolean printed = false;
			for (int t = 0; t < T; t++) {
				int x = t + 1;
				caseNum = "" + x;
				S = br.readLine();
				int res = 0;
				char[] Schar = S.toCharArray();
				for (int i = 0; i < S.length() - 1; i++) {
					char c1 = Schar[i], c2 = Schar[i + 1];
					if (c1 == '-' && c2 == '+') {
						res += 1;

					}
					if (c1 == '+' && c2 == '-') {
						res += 2;
						i++;
						while (i!=S.length()&&Schar[i]=='-'){
							Schar[i++]='+';
						}
						i--;
					}
				}
				if (S.length()==1||S.contains("+")==false)
					if (S.charAt(0)=='-')
						res=1;
				System.out.println("Case #" + caseNum + ": " + res);

			}

		} catch (

		IOException io) {
			io.printStackTrace();
		}
	}

}
