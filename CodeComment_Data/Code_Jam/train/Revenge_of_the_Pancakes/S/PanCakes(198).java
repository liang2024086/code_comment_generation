package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1011;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.InputStreamReader;


public class PanCakes {
	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/Users/iNviNciBLe/Desktop/B-small-attempt0.in"))));
		PrintWriter pw = new PrintWriter(new FileWriter("/Users/iNviNciBLe/Desktop/outputBsmall"));
		int testCase = Integer.parseInt(br.readLine());
		for(int i=0; i < testCase; i++) {
			boolean positive = true;
			boolean neg = true;
			int count = 0;
			String input = br.readLine();
			int j=0;
			while((j < input.length()) && (input.charAt(j) != '+')){
				j++;
				positive=false;
			}
			if(j > 0) 
				count++;
			
			while ( j < input.length() ){
				if(input.charAt(j) == '-') {
					positive=false;
					if(((j + 1) == input.length()) || input.charAt(j+1) == '+') {
						count = count + 2;
					}
				} else {
					neg=false;
				}
				j++;
			}
			if(neg) {
				pw.println("Case #" + (i + 1) + ": " + 1);  
				System.out.println("Case #" + (i + 1) + ": " + 1);
			} else if (positive) {
				pw.println("Case #" + (i + 1) + ": " + 0);
				System.out.println("Case #" + (i + 1) + ": " + 0);
			} else {
				pw.println("Case #" + (i + 1) + ": " + count);
				System.out.println("Case #" + (i + 1) + ": " + count);
			}
		}
		br.close();
		pw.close();
		System.out.println("Done!!");
	}
	

}
