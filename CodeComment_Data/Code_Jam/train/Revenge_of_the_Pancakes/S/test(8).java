package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class test {
    public static void main(String[] args) throws IOException {

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(stdin.readLine());
		
		for (int i=0; i<num; i++) {

			String stack = stdin.readLine();
			int length = stack.length();
			int numFlips = 0;
			int numUp = 0;
			int numDown = 0;

			for (int j=0; j<length; j++) {
				char ch = stack.charAt(j);
				if (ch == '-' && numUp==0)  {
					numDown++;
				} else if (ch == '+' && numDown == 0){
					numUp++;
				} else if (numDown > 0 && ch == '+') {
					numFlips++; numDown=0; numUp++;
				} else if (numUp > 0 && ch == '-') {
					numFlips++; numUp=0; numDown++;
				}
			}
			if (numDown > 0) numFlips++;
			System.out.println("Case #" + (i+1) + ": " + numFlips);
		}

    }
}
