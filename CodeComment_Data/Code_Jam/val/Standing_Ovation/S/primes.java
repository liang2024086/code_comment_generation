package methodEmbedding.Standing_Ovation.S.LYD1755;

import java.io.*;
public class primes {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader("D:\\Downloads\\cases.txt"));
		int cases = Integer.parseInt(input.readLine());
		for (int c=1;c<=cases;c++){
			String inputs =input.readLine();
			inputs = inputs.substring(2);
			int extras =0;
			int total =0;
			int oldE =0;
			for(int i=0;i<inputs.length();i++){
				int shy = (int) inputs.charAt(i)-48;
				if (total< i) {
					oldE=extras;
					extras+=i-total;
					total =total+extras-oldE+shy;
				}
				else{total+=shy;}
			}
			System.out.println("Case #"+c+": " +extras);
		}
	}
}
